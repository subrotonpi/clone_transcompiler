def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n , m , x , y = sc.__next__ ( )
        max , min = x , y
        for i in range ( n ) :
            max = max ( max , sc.__next__ ( ) )
        for i in range ( m ) :
            min = min ( min , sc.__next__ ( ) )
        print ( 'War' if max >= min else 'No War' )
