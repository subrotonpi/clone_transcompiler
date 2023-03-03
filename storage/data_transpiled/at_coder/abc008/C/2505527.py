def main ( ) :
    import sys
    from math import sin
    from math import ceil
    from math import sin
    from math import cos
    from math import sin
    from math import cos
    from math import sin
    from math import cos
    n = int ( sys.stdin.readline ( ) )
    c = sin ( sys.stdin.readline ( ) )
    ans = 0.0
    for i in range ( n ) :
        cnt = 0.0
        for j in range ( n ) :
            if i != j and c [ i ] % c [ j ] == 0 :
                cnt += 1.0
        if cnt % 2 == 0 :
            ans += ( cnt + 2 ) / ( cnt * 2 + 2 )
        else :
            ans += 0.5
    print ( ans )
