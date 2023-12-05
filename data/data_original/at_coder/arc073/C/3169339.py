N = int(input())
Ball = []
for i in range(N):
    x, y = map(int, input().split())
    x, y = min(x, y), max(x, y)
    Ball.append((x, y))

Ball.sort()  # ???????
X = [x for x, y in Ball]
Y = [y for x, y in Ball]

# ???MIN, MAX
MIN = X[0]
MAX = max(Y)

# ??2????????
ans = (max(X) - MIN) * (MAX - min(Y))

# ??2?????????

# ???MAX?MIN??????????????????????
MIN_index, MAX_index = X.index(MIN), Y.index(MAX)

# ??????????
MIN_O = X[MAX_index]
MAX_O = Y[MIN_index]
MIN_O, MAX_O = min(MIN_O, MAX_O), max(MIN_O, MAX_O)

# ???????????
Ball = [Ball[i] for i in range(N) if i not in (MIN_index, MAX_index)]

# ?????
X = [x for x, y in Ball]
Y = [y for x, y in Ball]

# ?????????????????????
B = [x for x in X] + [MAX_O, MIN_O]
B_max = max(B)

for i in range(len(Ball)):
    x, y = X[i], Y[i]
    if B_max - x > B_max - y >= 0:
        B[i] = y
    else:
        break

ans = min(ans, (MAX - MIN) * (max(B) - min(B)))
print(ans)