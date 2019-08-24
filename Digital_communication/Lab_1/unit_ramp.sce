// Ramp signal

clear
n = -5:5
x = [zeros(1,5), 0:5]
subplot(2,2,1)
plot2d(n,x)
title("Unit Ramp (continuous)")
xlabel("X")
ylabel("Y")
subplot(2,2,2)
plot2d3(n,x)
title("Unit Ramp (Discrete)")
xlabel("X")
ylabel("Y")


// sinewave

f = 0.2
t = 0:0.1:10
x1 = sin(2*%pi*t*f)
subplot(2,2,3)
plot(t,x1)
title("Sine Wave(Continous)")
xlabel("X")
ylabel("T")
subplot(2,2,4)
plot2d3(t,x1)
title("Sine Wave(Discrete)")
xlabel("X")
ylabel("T")
