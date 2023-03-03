def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = int ( sc.readline ( ) )
        k = int ( sc.readline ( ) )
        ret = 0
        for i in range ( int ( k ) + 1 , n + 1 ) :
            ret += ( n // i ) * ( i - k ) + max ( 0 , n % i - max ( k , 1 ) + 1 )
        print ( ret )
        sc.close ( )
