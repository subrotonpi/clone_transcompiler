# ??
N = int(input())

# N?????????????? (1, N), (2, N-1), ... ?????????
# N?????????????? (1, N-1), (2, N-2), ... ?????????
M = (
    N * (N - 1) // 2 - N // 2 if N % 2 == 0 else
    N * (N - 1) // 2 - (N - 1) // 2
)
s = N + 1 if N % 2 == 0 else N
ans = str(M) + '\n' + '\n'.join(
    '{} {}'.format(i, j)
    for i in range(1, N)
    for j in range(i + 1, N + 1)
    if i + j != s
)

# ??
print(ans)