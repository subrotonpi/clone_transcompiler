#!/usr/bin/env python3
import sys
import collections

YES = "Yes"  # type: str
NO = "No"  # type: str


def solve(S: str, T: str):
    wcS = collections.defaultdict(int)
    wcT = collections.defaultdict(int)
    for c in S:
        wcS[c] += 1
    for c in T:
        wcT[c] += 1
    cS = collections.defaultdict(int)
    cT = collections.defaultdict(int)
    for key in wcS:
        cS[wcS[key]] += 1
    for key in wcT:
        cT[wcT[key]] += 1
    representable = True
    if len(cT.keys()) > len(cS.keys()):
        temp = cT
        cT = cS
        cS = temp
    for key in cS:
        if cT[key] != cS[key]:
            representable = False
    print(YES if representable else NO)
    return


# Generated by 1.1.4 https://github.com/kyuridenamida/atcoder-tools  (tips: You use the default template now. You can remove this line by using your custom template)
def main():
    def iterate_tokens():
        for line in sys.stdin:
            for word in line.split():
                yield word
    tokens = iterate_tokens()
    S = next(tokens)  # type: str
    T = next(tokens)  # type: str
    solve(S, T)


if __name__ == '__main__':
    main()