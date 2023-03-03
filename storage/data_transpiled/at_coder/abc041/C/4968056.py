def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        a = [ [ sc.readline ( ) , i + 1 ] for i in range ( n ) ]
        a.sort ( lambda x , y : cmp ( y [ 0 ] , x [ 0 ] ) )
        for i in range ( n ) :
            print ( a [ i ] [ 1 ] )
