clc
clear all

f1=input("enter carrier frequency:");
f2=input("enter frequency of pulse:");
t=0:0.001:1;
x=cos(2*3.14*f1*t);
y=(squarewave(2*3.14*f2*t)+1)/2;
z=x.*y;
subplot(3,1,1)
plot2d3(t,x);
xtitle("carrier signal","tiem","amplitude")

subplot(3,1,2)
plot2d3(t,y);
xtitle("modulating sinal","time","amplitude");

subplot(3,1,3)
plot(t,z);
xtitle("ASK signal","time","amplitude");
