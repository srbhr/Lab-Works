
clc;
clear all;
n = input("Enter the number of bits:- ");
snrdb = 4.8+6*n;
print(%io(2),snrdb,"in db");
xmax = input("Enter xmax :-");
pb = input("Enter the input power:- ");
snr = (pb*3*(2^2*n))/(xmax^2);
print(%io(2),snr);
print(%io(2),"In no unit");
notb = 10.1:30;
//disp("notb",notb);
pe = 0.5*erfc(0.5*sqrt(pb/notb));
print(%io(2),pe);
plot(notb,pe);
xlabel("Noise Power Spectral Density");
ylabel("Probab of Error");
title("Probab of error of PCM system");
