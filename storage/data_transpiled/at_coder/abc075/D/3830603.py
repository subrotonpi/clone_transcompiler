def main ( ) :
    import sys
    from math import fabs
    from math import pi
    from math import pi
    from math import pi
    from math import pi
    from math import pi
    from math import pi
    from math import pi
    from math import pi
    from math import pi
    from math import pi
    N = pi.count ( 'N' )
    K = pi.count ( 'K' )
    x = pi.sort ( )
    y = pi.sort ( )
    ans = float ( 'inf' )
    for left in range ( N ) :
        for right in range ( N ) :
            for up in range ( N ) :
                for down in range ( N ) :
                    cnt = 0
                    for i in range ( pi ) :
                        if x [ left ] <= x [ i ] <= x [ right ] and y [ i ] <= y [ up ] and y [ down ] <= y [ i ] :
                            cnt += 1
                    if cnt >= K :
                        ans = min ( ans , fabs ( x [ left ] - x [ right ] ) * abs ( y [ up ] - y [ down ] ) )
    print ( ans )
