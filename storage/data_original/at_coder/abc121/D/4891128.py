A, B = map(int, input().split())

# (2n)^(2n+1) == 1.
# ??????????? XOR ??????0?????1
count1 = max(0, (B + 1) // 2 - (A + 1) // 2)
res = count1 % 2

# ???
if A % 2 == 1:
    res ^= A
if B % 2 == 0:
    res ^= B

print(res)