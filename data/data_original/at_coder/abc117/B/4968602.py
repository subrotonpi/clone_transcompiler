N = int(input())
L = list(map(int, input().split()))
maxL = max(L)
L.remove(maxL)
print('Yes' if maxL < sum(L) else 'No')