#!/usr/bin/env python3
import sys
import collections


def solve(N: int, M: int, A: "List[int]"):
    a = [i % M for i in A]
    b = [0]
    nums = collections.defaultdict(int)
    for i in range(len(a)):
        n = (b[i] + a[i]) % M
        b.append(n)
    for i in b:
        nums[i] += 1
    sum = 0
    for k in nums:
        c = nums[k]
        if c > 1:
            sum += c * (c - 1) // 2
    # print(nums)
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
    M = int(next(tokens))  # type: int
    A = [int(next(tokens)) for _ in range(N)]  # type: "List[int]"
    solve(N, M, A)


if __name__ == '__main__':
    main()