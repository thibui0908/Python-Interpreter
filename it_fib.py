first = 0
second = 1
n = 40
while n != 1:
    new_second = first + second
    first = second
    second = new_second
    n = n - 1
print(second)