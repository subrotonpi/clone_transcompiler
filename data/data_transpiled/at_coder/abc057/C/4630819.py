def main ( ) :
    import math
    from math import sqrt
    scn = Scanner ( )
    N = scn.next ( )
    ans = 0
    A = 1
    for i in range ( int ( math.sqrt ( N ) ) , 0 , - 1 ) :
        if N % i == 0 :
            A = N / i
            break
    while A > 0 :
        ans += 1
        A /= 10
    print ( ans )
