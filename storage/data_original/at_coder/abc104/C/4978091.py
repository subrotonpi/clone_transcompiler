from math import ceil

D, G = [int(t) for t in input().split()]
p = []
c = []
for i in range(D):
    p_, c_ = [int(t) for t in input().split()]
    p.append(p_)
    c.append(c_)

def solve(G, i):
    """100i?????????G??????????"""
    if i <= 0:
        return float('inf')
    #??????????????????????????
    n = min(ceil(G / (100 * i)), p[i - 1])
    s = 100 * i * n
    #????????????????????????????????????
    if n == p[i - 1]:
        s += c[i - 1]
    if G > s:
        n += solve(G - s, i - 1)
    return min(n, solve(G, i - 1))

print(solve(G, D))