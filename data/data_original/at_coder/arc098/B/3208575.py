N = int(input())
A = list(map(int, input().split()))

ans, r = 0, 0
XOR, SUM = 0, 0
for l in range(N):
    while r < N and XOR ^ A[r] == SUM + A[r]:
        XOR ^= A[r]
        SUM += A[r]
        r += 1

    ans += r - l
    XOR ^= A[l]
    SUM -= A[l]

print(ans)