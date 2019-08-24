clear 
// Cosine wave
f = 0.2
t = 0:0.1:10
x = cos(2*%pi*t*f)
subplot(3,3,1)
plot(t,x)
title("Cosine Wave(Continous)")
xlabel("X")
ylabel("T")
subplot(3,3,2)
plot2d3(t,x)
title("Cosine Wave(Discrete)")
xlabel("X")
ylabel("T")

// Exponential Functions Increasing

j = -3:0.1:3
x1 = exp(j)
x2 = exp(-j)
subplot(3,3,3)
plot(j,x1)
title("Exponential Increasing (Continous)")
xlabel("X")
ylabel("Y")
subplot(3,3,4)
plot2d3(j,x1)
title("Exponential Increasing (Discrete)")
xlabel("X")
ylabel("Y")

// Exponential Decreasing

subplot(3,3,5)
plot(j,x2)
title("Exponential Decreasing (Continous)")
xlabel("X")
ylabel("Y")
subplot(3,3,6)
plot2d3(j,x2)
title("Exponential Decreasing (Discrete)")
xlabel("X")
ylabel("Y")
