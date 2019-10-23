//Aim:- To find Gaussian Distribution and Uniform Distribution Curve
clc 
clear all
var = input("Enter the variance : ");
Mean = input("Enter the mean: ");
x = -10:0.001:10;
pdf = ((1/sqrt(2*3.14*var))*exp(-((x-Mean)^2)/(2*var)));
var1 = input("Enter the Variance : ");
Mean1 = input("Enter the mean : ");
pdf1 = ((1/sqrt(2*3.14*var1))*exp(-((x-Mean1)^2)/(2*var1)));


var2 = input("Enter the Variace : ");
Mean2 = input("Enter the mean: ");
pdf2 = ((1/sqrt(2*3.14*var2))*exp(-((x-Mean2)^2)/(2*var2)));

plot(x,pdf,'r');
plot(x,pdf1,'b');
plot(x,pdf2,'g');

xlabel("X");
ylabel("PDF");
title("Gaussian Distribution Function");
h1= legend("Curve ","Curve 2","Curve 3");
