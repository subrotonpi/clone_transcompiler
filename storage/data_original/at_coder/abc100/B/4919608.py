D, N = map(int, input().split())
if N <= 99:
    print((100**D)*N)
else:
    print(101*(100**D))