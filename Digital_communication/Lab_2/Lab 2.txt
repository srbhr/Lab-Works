//Aim to perform sampling of a given signal and plot it's waveform using SciLab
//Function Used sin wave
//Conditions for Sampling:-
//fs>2fm [Over Sampling]
//fs=2fm [Critical Sampling]
//fs<2fm [Under Sampling]




clc
clear all
fm = input("Enter the MAXIMUM frequency : - ")
fs = input("Enter the SAMPLING frequency : - ")
nyc = 4  // Numbver of cycles
t = 0:1/fs:nyc*1/fm 
x = sin(2*%pi*fm*t)
y = squarewave(3*%pi*fm*t, 100)
z = x.*y

subplot(3,1,1)
plot(t,x)
xtitle("Message Signal","F(x)","Amp")
//

subplot(3,1,2)
plot2d3(t,y)
xtitle("Impulse Signal","F(x)","Amp")
//

subplot(3,1,3)
plot2d3(t,z)
xtitle("Sampled Signal [Over Sampling]","F(x)","Amp")
