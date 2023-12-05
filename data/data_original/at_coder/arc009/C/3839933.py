def c_24(N, K):
    MOD = 1777777777

    class Combination(object):
        # ???????????????????
        def __init__(self, mod=10**15 + 91):
            self.mod = mod

        def _mult_inverse_(self, n):
            return pow(n, self.mod - 2, self.mod)

        def comb(self, n, r):
            if n < 0 or r < 0 or n < r:
                return 0
            numerator, denominator = 1, 1
            for k in range(n, n - r, -1):
                numerator = (numerator * k) % self.mod
            for k in range(r, 0, -1):
                denominator = (denominator * k) % self.mod
            return (numerator * self._mult_inverse_(denominator)) % self.mod

    def montmort(n):
        # 1~n ????????? a ?????? a_i != i ?????????????
        # ??????????????????????
        t1, t2 = 0, 1
        for k in range(3, n + 1):
            t1, t2 = t2, ((k - 1) * (t1 + t2)) % MOD
        return t2

    # N??????????????????????comb(N, K)??
    # K???????????????????????????????????
    ans = (Combination(MOD).comb(N, K) * montmort(K)) % MOD
    return ans

N, K = [int(i) for i in input().split()]
print(c_24(N, K))