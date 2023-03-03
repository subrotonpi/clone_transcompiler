def main ( ) :
    import sys
    from math import ceil
    from math import sin , cos , exp
    from math import gcd
    from math import sin , cos , exp
    from math import log
    from math import log
    n = int ( sys.stdin.readline ( ) )
    ans = 1
    for i in range ( n ) :
        t = sin ( n )
        ans = lcm ( max ( t , ans ) , min ( t , ans ) )
    print ( ans )
    sys.stdout.flush ( )
    def gcd ( a , b ) :
        if a < b :
            return gcd ( b , a )
        if b == 0 :
            return a
        return gcd ( b , a % b )
    def lcm ( a , b ) :
        c = a // gcd ( a , b )
        return b * c
    return gcd ( a , b )
