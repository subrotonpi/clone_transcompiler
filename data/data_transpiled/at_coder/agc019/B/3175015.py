def main ( ) :
    import sys
    import string
    INF = int ( sys.maxint )
    class Main ( object ) :
        INF = int ( sys.maxint )
        INF = int ( sys.maxint )
    def __init__ ( self ) :
        sc = sys.stdin
        A = sc.read ( )
        a = A.split ( ' ' )
        a.sort ( )
        c = 1
        ans = 0
        for i in range ( 1 , long ( len ( A ) ) ) :
            if a [ i ] != a [ i - 1 ] :
                ans += ( c * ( c - 1 ) ) / 2
                c = 1
            else :
                c += 1
        ans += ( c * ( c - 1 ) ) / 2
        print ( ( long ( len ( A ) ) * ( long ( len ( A ) - 1 ) ) / 2 - ans + 1 ) )
