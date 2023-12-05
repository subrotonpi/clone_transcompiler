def b_many_times(N, S1, S2):
    class UnionFind(object):
        def __init__(self, N):
            self.p = list(range(N))  # ??????i??????(parent)?i?
            self.rank = [0] * N  # ?????????????0(?????????)
            self.size = [1] * N  # ????????????????????1

        def union(self, x, y):  # x,y????????????
            u = self.find(x)
            v = self.find(y)
            if u == v:  # x,y???????????????
                return
            if self.rank[u] < self.rank[v]:
                self.p[u] = v  # ?????????????
                self.size[v] += self.size[u]  # ??????????????
                self.size[u] = 0  # ??????????????????
            else:
                # ???????
                self.p[v] = u
                self.size[u] += self.size[v]
                self.size[v] = 0
                if self.rank[u] == self.rank[v]:
                    # ?????1??????
                    self.rank[u] += 1

        def find(self, x):  # ??x???????????(????)????
            if self.p[x] != x:  # ??x???????????
                self.p[x] = self.find(self.p[x])  # ????(x???????)
            return self.p[x]

        def is_same(self, x, y):  # ??x,y?????????????
            return self.find(x) == self.find(y)

        def get_size(self, x):  # ??x????????????
            return self.size[self.find(x)]

        def __str__(self):
            return '[{}]'.format(', '.join(map(str, self.p)))

    # ord('0')=>48, ord('Z')=>90 ???????????????????????
    # ????????
    uf = UnionFind(100)
    for c1, c2 in zip(S1, S2):
        uf.union(ord(c1), ord(c2))

    ans = 1
    for k, c in enumerate(S1):
        # ????????????????????????????????1??
        is_digit = False
        for d in range(ord('0'), ord('0') + 10):
            if uf.is_same(d, ord(c)):
                is_digit = True
                break
        if is_digit:
            continue

        # ?????????????????????
        # ????????????????????9?????????10??
        tmp = 9 if k == 0 else 10
        ans *= tmp
        # ??????????????????????????(??0????????)
        uf.union(ord(c), ord('0'))

    return ans

N = int(input())
S1 = input()
S2 = input()
print(b_many_times(N, S1, S2))