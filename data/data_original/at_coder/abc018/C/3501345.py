Y, X, K = map(int, input().split())
a = [[0 if c=="x" else 1 for c in input()]for i in range(Y)]

#y???????????????
for x in range(X):
    st = 0
    for y in range(Y + 1):
        #??? or "�"?????????
        if y == Y or a[y][x] == 0:
            r = -(-(y-st) // 2)
            for i in range(r):
                #????????????(st,ed?????)???
                a[st+i][x] = i+1
                a[y-i-1][x] = i+1
            st = y + 1
            
result = 0
#????????
diamond_length = (K-1)*2 + 1
#?????
diamond_radius = K
#K > min(i-st,ed-i)??????????
for y in range(K-1, Y-K+1):
    start = 0
    cnt = a[y].count(0)
    for i in range(cnt+1):
        #start??0???
        end = a[y].index(0, start) if i < cnt else X-1
        range_length = end - start + 1

        if range_length < diamond_length:
            start = end + 1
            continue
        checked = 0
        # ???????????????????????????
        for j in range(range_length-diamond_length+1):
            checked = max(0, checked-1)
            _start = start + j
            is_creatable = True
            flag = True

            # checked ??????????????????????????
            for k in range(checked, diamond_length):
                #y????????
                req = k+1 if k < diamond_radius else 2*diamond_radius-k-1
                now = a[y][_start+k]
                if now < req:
                    is_creatable = False
                    break
                # ?????????(k < r / 2)????????????????????????
                # ?????????????????????????
                elif k <= diamond_radius-1 or flag and now >= diamond_radius:
                    checked = k
                else:
                    flag = False

            if is_creatable:
                result += 1
        start = end + 1
print(result)