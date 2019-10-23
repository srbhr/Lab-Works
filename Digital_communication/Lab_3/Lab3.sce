//Lab 3
//Aim: To find out SNR and Probability of Error in PCM signals.
clc;
clear all;
n = input("Enter the number of bits:- ");
snrdb = 4.8+6*n;
disp(%io(2),snrdb,"in db");
xmax = input("Enter XMAX :-");
pb = input("Enter the input power:- ");
//disp("Pb :- ",pb)
snr = ((pb*3*(2^2*n))/(xmax^2));
disp(%io(2),snr);
disp(%io(2),"In no unit");
notb = [10:1:30];
//disp("notb",notb);
pe = 0.5*erfc(-0.5*sqrt(pb./notb));
disp(%io(2),pe);
plot(notb,pe);
xlabel("Noise Power Spectral Density");
ylabel("Probab of Error");
title("Probab of error of PCM system");
