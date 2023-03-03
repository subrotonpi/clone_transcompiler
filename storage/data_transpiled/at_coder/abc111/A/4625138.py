def main ( ) :
    import sys
    from math import sin , cos , pi
    scn = sys.stdin.read ( )
    N = sum ( [ sin ( i ) for i in range ( N ) ] )
    a = N // 100
    b = ( N % 100 ) // 10
    c = N % 10
    ans = 0
    if a == 9 :
        ans += 100
    elif a == 1 :
        ans += 900
    else :
        ans += 100 * a
    if b == 9 :
        ans += 10
    elif b == 1 :
        ans += 90
    else :
        ans += 10 * b
    if c == 9 :
        ans += 1
    elif c == 1 :
        ans += 9
    else :
        ans += 1 * c
    print ( ans )
