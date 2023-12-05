def b_kindergarten(N, K):
    import math
    remain = K % N

    # ???????????????????????1?1?????????
    if K < N:
        # ???1???????????0??????????????????????
        # K????????N??????(1??????????????)????
        # H(N, K) = C(N+K-1, K) ????
        ans = math.factorial(N + K - 1) // (math.factorial(K) * math.factorial(N - 1))
    else:
        # 1???????????????????????????
        ans = math.factorial(N) // (math.factorial(remain) * math.factorial(N - remain))
    return ans % (10**9 + 7)

N, K = [int(i) for i in input().split()]
print(b_kindergarten(N, K))