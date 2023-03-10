from bisect import bisect_left


def solve(string):
    a, b, q, *stx = map(int, string.split())
    bignum = 3 * 10**10
    s = [-bignum] + stx[:a] + [bignum]
    t = [-bignum] + stx[a:a + b] + [bignum]
    ans = []
    for _x in stx[-q:]:
        i_s, i_t = bisect_left(s, _x), bisect_left(t, _x)
        ls, rs = _x - s[i_s - 1], s[i_s] - _x
        lt, rt = _x - t[i_t - 1], t[i_t] - _x
        ans.append(str(min(max(rs, rt), max(ls, lt), rt + ls + min(rt, ls),
                           rs + lt + min(rs, lt))))
    return "\n".join(ans)


if __name__ == '__main__':
    n, m, l = map(int, input().split())
    print(solve('{} {} {}\n'.format(n, m, l) + '\n'.join([input() for _ in range(n + m + l)])))