// Unit impulse signal

clear
n = -5:5
x = [zeros(1,5), ones(1,1), zeros(1,5)]
subplot(2,2,1)
plot2d(n,x)
title("Unit Impulse (continuous)")
xlabel("X")
ylabel("Y")
subplot(2,2,2)
plot2d3(n,x)
title("Unit Impulse (Discrete)")
xlabel("X")
ylabel("Y")


// unit step

x1 = [zeros(1,5), ones(1,6)]
subplot(2,2,3)
plot2d(n,x1)
title("Unit Step (continuous)")
xlabel("X")
ylabel("Y")
subplot(2,2,4)
plot2d3(n,x1)
title("Unit Step (Discrete)")
xlabel("X")
ylabel("Y")











