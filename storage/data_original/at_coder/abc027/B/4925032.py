def island_and_bridge(N: int, A: list) -> int:
    if sum(A) % N > 0:
        return - 1

    # s ??????????????????????????
    # ??? 0 ??????????????????
    s = 0
    goal = sum(A) // N
    bridges = 0
    for a in A:
        s += a - goal
        if s != 0:
            bridges += 1
    return bridges


if __name__ == "__main__":
    N = int(input())
    A = [int(s) for s in input().split()]
    ans = island_and_bridge(N, A)
    print(ans)