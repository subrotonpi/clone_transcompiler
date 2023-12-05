def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.read ( )
        min = sys.maxint
        for i in range ( 1 , n + 1 ) :
            x = int ( abs ( ( n // i ) - i ) + n % i )
            min = min ( x , min )
        print ( min )
