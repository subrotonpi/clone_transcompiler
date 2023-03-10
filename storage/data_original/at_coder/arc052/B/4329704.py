def b_cone(N, Q, Cones, Queries):
    """
    xyz????N????????????????????????
    ????????yz???????x??????????????
    i????????????????x???X_i???R_i???H_i????
    ??Q??????????
    ?2????A, B???? A <= x <= B ???????????????????????????????
    """
    import math

    ans_tmp = []
    for a, b in Queries:
        # ?????????????
        volume_sum = 0
        for x, r, h in Cones:
            # x=a??????????????
            if x <= a <= x + h:
                # ????? h:(x+h-a) ??????????? h**3:(x+h-a)**3.
                # ?????????? h**3 : (x+h-a)**3 = ?*h*r**2/3 : v1 ??????
                v1 = ((x + h - a)**3) / (h**2) * math.pi * (r**2) / 3
            elif a < x:
                # ?????????
                v1 = math.pi * (r**2) * h / 3
            else:
                # ???????
                v1 = 0

            # ????x=b??????????????
            if x <= b <= x + h:
                v2 = ((x + h - b)**3) / (h**2) * math.pi * (r**2) / 3
            elif b < x:
                v2 = math.pi * (r**2) * h / 3
            else:
                v2 = 0
            # a<=x<=b??????????
            volume_sum += v1 - v2
        ans_tmp.append(str(round(volume_sum, 6)))
    ans = '\n'.join(ans_tmp)
    return ans

N, Q = [int(i) for i in input().split()]
Cones = [[int(i) for i in input().split()] for j in range(N)]
Queries = [[int(i) for i in input().split()] for j in range(Q)]
print(b_cone(N, Q, Cones, Queries))