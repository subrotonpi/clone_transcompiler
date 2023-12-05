def main ( ) :
    import sys
    from math import ceil
    from math import sin , cos
    from math import log
    from math import log
    from math import pi
    n = int ( sys.stdin.read ( ) )
    m = int ( sys.stdin.read ( ) )
    ans = 1
    for a in range ( 1 , 2 ** m + 1 ) :
        if m % a != 0 :
            continue
        b = m // a
        if a * n <= m :
            ans = max ( ans , a )
        if b * n <= m :
            ans = max ( ans , b )
    print ( ans )
