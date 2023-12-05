def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = [ sc.randint ( 0 , 3 ) for _ in range ( 3 ) ]
        a.append ( sc.randint ( 0 , 3 ) )
        a.append ( sc.randint ( 1 , 3 ) )
        a.append ( sc.randint ( 2 , 3 ) )
        a.sort ( )
        print ( a [ 2 ] - a [ 1 ] + a [ 1 ] - a [ 0 ] )
