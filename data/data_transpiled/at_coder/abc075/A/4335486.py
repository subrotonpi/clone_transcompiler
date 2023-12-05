def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = [ sc.randint ( 0 , 3 ) for _ in range ( 3 ) ]
        a.sort ( )
        print ( a [ 0 ] == a [ 1 ] )
