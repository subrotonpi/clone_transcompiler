def solve(string):
    a, b = map(int, string.split())
    if b == 0:
        return "0"
    bin_a = "{:040b}".format(a)
    bin_b = "{:040b}".format(b)
    aa = [-1 if _a == "0" else int(bin_a[i + 1:] or "0", 2) for i, _a in enumerate(bin_a)]
    bb = [-1 if _b == "0" else int(bin_b[i + 1:] or "0", 2) for i, _b in enumerate(bin_b)]
    index = 0
    while True:
        if bb[index] != -1:
            break
        index += 1
    ans = []
    while index < 40:
        if aa[index] == bb[index] == -1:
            ans.append("0")
        elif aa[index] == -1:
            ans.append(str((bb[index] + 1) % 2))
        elif bb[index] == -1:
            ans.append(str(aa[index] % 2))
        else:
            ans.append(str((bb[index] + 1 - aa[index]) % 2))
        index += 1
    ans[-1] = str((b - a) // 2 % 2) if a % 2 == b % 2 == 0 else str(((b - a) // 2 + 1) % 2)
    return str(int("".join(ans), 2))


if __name__ == '__main__':
    print(solve(input()))