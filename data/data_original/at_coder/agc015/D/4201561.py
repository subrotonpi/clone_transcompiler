a = int(input())
b = int(input())

if a == b:
    print(1)
    exit()

# ???x?????????len(bin(x)) - 2????x?0???1????????????????
# ????????????????????????
def bitlen(x):
    return 1 + bitlen(x >> 1) if x else 0

t = a ^ b
n = bitlen(t)

T = 1 << (n - 1)

a = a & (T * 2 - 1)
b = b & (T * 2 - 1)

sb = b & (T - 1)
b_max = (2 ** bitlen(sb) - 1) | T

if (T + a) > b_max:
    print((b_max - a + 1) + (2 * T - 1 - (T + a) + 1))
else:
    print(2 * T - 1 - a + 1)