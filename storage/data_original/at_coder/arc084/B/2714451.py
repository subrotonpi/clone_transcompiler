from heapq import heappush, heappop

K = int(input())
adjL = [[] for i in range(K)]
for i in range(K):
    adjL[i].append(((i + 1) % K, 1))  # i?(i+1) ????1?????
    adjL[i].append(((i * 10) % K, 0)) # i?(i*10)????0?????

# ???????
cost = [float('inf')] * K
cost[1] = 0
PQ = []
heappush(PQ, (0, 1)) # 1??????
while PQ:
    cNow, vNow = heappop(PQ)

    if vNow == 0: break # 0????????
    if cNow > cost[vNow]: continue

    for v2, wt in adjL[vNow]:
        c2 = cNow + wt
        if c2 < cost[v2]:
            cost[v2] = c2
            heappush(PQ, (c2, v2))

# ?1?0????????+1??????
print(cost[0] + 1)