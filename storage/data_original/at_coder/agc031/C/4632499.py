#!/usr/bin/env python3
# -*- coding: utf-8 -*-

# AtCoder Grand Contest 031
# Problem C: Differ by 1 Bit

N, A, B = [int(t) for t in input().split()]

def grayCode(n):
    """n???Gray???????"""
    for v in range(2 ** n):
        yield v ^ (v >> 1)

def grayCodeEnding(b, n):
    """0????b????n???Gray???????"""
    code = list(grayCode(n))
    l = len(code)
    p = code.index(b)  # b?????
    assert p % 2 == 1  # b?????????????????

    # ???????yield
    q = 0
    while q != p:
        yield code[q]
        if q % 2 == 0:
            q = l - 1 - q
        else:
            q += 1 if q < p else -1

    # ??????yield
    q = l - 1 - q
    d = 1 if q < p else -1
    for i in range(q + d, p + d, d):
        yield code[i]

def weight(v):
    """v?N???2????????1???"""
    return sum(1 for k in range(N) if (v & (1 << k)) != 0)

# 0 ??B ^ A ????????????????.
B ^= A

# B????????, ?? 2 ** N ?????????.
if weight(B) % 2 == 0:
    print('NO')
    exit()

print('YES')
code = [A ^ c for c in grayCodeEnding(B, N)]
print(' '.join(str(c) for c in code))