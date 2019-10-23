//Lab 4
//Aim:- To perform Delta Modulation and Demodulation.
clc
clear all
t = 0:%pi/50:%pi*2;
x = sin(t);
subplot(3,1,1);
plot(x,"V");
delta=0.3;
xn(1) = 0;
for i=1:length(x)
    if x(i)>xn(i)
        d(i)=1;
        xn(i+1)=xn(i)+delta;
    else
        d(i)=0;
        xn(i+1)=xn(i)-delta;
    end
end
subplot(3,1,2);
plot2d2(xn);
title("Modulation");
xlabel("time");
ylabel("Amplitude");

//Demodulation

x2 = 0;
for i=1:length(x)
    if d(i)==1
        x2(i+1) = x2(i)+delta;
    else
        x2(i+1) = x2(i)-delta;
    end
end
subplot(3,1,3);
plot(x2);
title("Demodulatio");
xlabel("Time");
ylabel("Amplitude");

