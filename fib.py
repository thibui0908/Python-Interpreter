def fib(n):
    if l[n-1] != -1:
        return l[n-1]
    l[n-1] = fib(n-1) + fib(n-2)
    return l[n-1]


n = 40
l = [-1] * n
l[0] = 1
l[1] = 1
print(fib(n))
print(l)
