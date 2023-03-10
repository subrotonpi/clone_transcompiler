def c_the_melancholy_of_taro_heikinchi(S):
    """
    ?????????
    (1) (1+2+...+N-M)/N=X/Y
    ??????????1+2+...+N=N(N+1)/2 ????????????????
    ????M????????m_numerator, m_denominator???(?????)

    for?????N?????M=1, M=N????N???(1)?????????????
    """
    X, Y = [int(i) for i in S.split('/')]
    ans_tmp = []
    for N in range(2 * X // Y - 1, 2 * X // Y + 2):
        if N <= 0:
            continue

        m_numerator = N * (Y * (N + 1) - 2 * X)
        m_denominator = 2 * Y

        if m_numerator % m_denominator != 0:
            continue  # M ????????

        M = m_numerator // m_denominator
        if 1 <= M <= N:
            ans_tmp.append([N, M])
    if ans_tmp:
        ans = '\n'.join([' '.join(map(str, s)) for s in ans_tmp])
    else:
        ans = 'Impossible'
    return ans

S = input()
print(c_the_melancholy_of_taro_heikinchi(S))