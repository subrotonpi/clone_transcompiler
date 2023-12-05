#!/usr/bin/env python3
import sys
import math

def dfs(N: int, digit: int,cur: str):
    if len(cur) < digit:
        return dfs(N,digit,cur+"3") + dfs(N,digit,cur+"7") + dfs(N,digit,cur+"5")
    else:
        if int(cur) > N:
            return 0
        if cur.count("3") > 0 and cur.count("7") > 0 and cur.count("5"):
            return 1
        else:
            return 0


def solve(N: int):
    digit = math.ceil(math.log10(N))
    sum = 0
    for i in range(3,digit+1):
        sum += dfs(N,i,"")
    print(sum)
    return


# Generated by 1.1.4 https://github.com/kyuridenamida/atcoder-tools  (tips: You use the default template now. You can remove this line by using your custom template)
def main():
    def iterate_tokens():
        for line in sys.stdin:
            for word in line.split():
                yield word
    tokens = iterate_tokens()
    N = int(next(tokens))  # type: int
    solve(N)

if __name__ == '__main__':
    main()