import sys
sys.setrecursionlimit(10**7)
INF = 10 ** 18
MOD = 10 ** 9 + 7
def LI(): return [int(x) for x in sys.stdin.readline().split()]
def LI_(): return [int(x) - 1 for x in sys.stdin.readline().split()]
def LF(): return [float(x) for x in sys.stdin.readline().split()]
def LS(): return sys.stdin.readline().split()
def II(): return int(sys.stdin.readline())
def SI(): return input()

from itertools import accumulate

def main():
    N = II()
    A = LI()
    A.sort()
    S = list(accumulate(A))
    ans = 1
    for s, a in zip(S[-2::-1], A[-1::-1]):
        if s * 2 < a:
            break
        ans += 1

    return ans

print(main())