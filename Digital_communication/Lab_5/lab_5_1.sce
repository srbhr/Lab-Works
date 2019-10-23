//Aim:- To find Gaussian Distribution and Uniform Distribution Curve
clc 
clear all
a = input("Enter the Lower Limit: ");
b = input("Enter the Upper Limit: ");
a1 = input("Enter the Lower Limit: ");
b1 = input("Enter the Upper Limit: ");
a2 = input("Enter the Lower Limit: ");
b2 = input("Enter the Upper Limit: ");
// 1st
x = a-5:0.001:b+5;
for i=1:length(x)
    if x(i)>=a && x(i)<=b
        pdf(i) = (1/(b-a));
     else
         pdf(i) = 0;
    end
end
//2nd
x1 = a1-5:0.001:b1+5;
for i=1:length(x1)
    if x1(i)>=a1 && x1(i)<=b1
        pdf1(i) = (1/(b1-a1));
     else
         pdf1(i) = 0;
    end
end
//3rd
x2= a2-5:0.001:b2+5;
for i=1:length(x2)
    if x2(i)>=a2 && x2(i)<=b2
        pdf2(i) = (1/(b2-a2));
     else
         pdf2(i) = 0;
    end
end
plot(x,pdf,'r');
plot(x1,pdf1,'g');
plot(x2,pdf2,'b');
xlabel("X");
ylabel("PDF");
title("Uniform Distribution Curve");
h1= legend("Curve ","Curve 2","Curve 3");
