def c_saving(C):
    n = len(C)
    # ??????????????????????(???n??)
    pattern = [('x' * k + C + C)[:n * 2] for k in range(n)]
    ans = n  # n???????????

    for bits in range(1, 1 << n):
        # bits?2????????2**k(k?????)???1??????
        # pattern[k]?????????(??1??????)
        tmp = []  # ??????????????
        string = ''  # ??????
        tv_last = -1
        for k in range(n):
            if bits & (1 << k) != 0:
                tv_last = k
                tmp.append(pattern[k])

        for s in zip(*tmp):
            # ???????????????????????????????
            # 'o'?????1???????????????????????
            if 'o' in s:
                string += 'o'
            else:
                string += 'x'

        # ????????????????????????'o'???
        # ?????????????????????
        # ????????????????????????????
        if string[tv_last:] == 'o' * len(string[tv_last:]):
            # print(*tmp, '|', string)
            ans = min(ans, len(tmp))
    return ans

C = input()
print(c_saving(C))