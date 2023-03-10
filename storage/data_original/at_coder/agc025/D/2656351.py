from itertools import product

N, D1, D2 = map(int, input().split())

# D?????or?D%4=2???????4???
Ds = []
Ms = []
for D in [D1, D2]:
    M = 1
    while D % 4 == 0:
        D //= 4
        M *= 2

    Ds += [D]
    Ms += [M]

# ??(i,j)??????????
num = 0
for i, j in product(range(2 * N), repeat=2):
    # 1/M????????(0,0)???????????????
    for D, M in zip(Ds, Ms):
        if D % 2:
            # D????(x+y)?????????
            if (i // M + j // M) % 2: break
        else:
            # D%4=2?x?????????
            if (i // M) % 2: break
    else:
        print(i, j)
        num += 1
        if num == N * N: break