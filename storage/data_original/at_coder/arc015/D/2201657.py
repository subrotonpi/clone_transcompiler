# seishin.py
T, N, P = input().split()
T = int(T); N = int(N); P = float(P)
D = []
for i in range(N):
    q, x, t = input().split()
    q = float(q); x = int(x); t = int(t)
    D.append((t, x, q))
D.sort()

# ??????
# M[p] := ??p?????? (????????????p???????)
# M[0] = 1.0
# M[1] = (1 - P) + P*(x_0*q_0 + ..., + x_{N-1}*q_{N-1})
#   (=> cur????)
# ...
# (??t_i????????? t_i < x ?????)
# M[y] = <???????????> + <(????????)??i???> + <(??????????)??i???>
#      = (1 - P) + P*(q_0*1 + ... + q_i*1) + P*(x_{i+1}*q_{i+1} + ... + x_{N-1}*q_{N-1})
#
# ??i?????????? ?_{y=0}^{i} M[y] ???
#
# ????
#  ans = ?_{t=0}^{T-1} ?_{y=0}^{t-1} M[y]
# ??????????
cur = 1 - P + P*sum(x*q for t, x, q in D)
j = 0
ans = 0.
res = 1.
for y in range(T):
    while j < N and D[j][0] <= y:
        # ??j????????? P*x_j*q_j ???? P*q_j ???
        t, x, q = D[j]
        cur += P*q*(1-x)
        j += 1
    ans += res # ans += ?_{y=0}^{i} M[y]
    res *= cur # res *= M[y]
# ?????10^-3????OK
print("%.08f" % ans)