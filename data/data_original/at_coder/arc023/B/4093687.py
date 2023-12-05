def b_unknown_x(R, C, D, Grid):
    # ???????1?1??????BFS??????????????1?1??
    # ?????????????????????????????D?????????
    # ???????????????
    # ??????????????????D???????
    # ????????????????????????????????????
    ans = 0
    parity = D % 2
    for r in range(R):
        for c in range(C):
            if (r + c) <= D and (r + c) % 2 == parity:
                ans = max(ans, Grid[r][c])
    return ans

R, C, D = [int(i) for i in input().split()]
Grid = [[int(i) for i in input().split()] for j in range(R)]
print(b_unknown_x(R, C, D, Grid))