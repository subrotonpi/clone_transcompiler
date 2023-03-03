def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = [ sc.randint ( 0 , 3 ) for i in range ( 3 ) ]
        a.sort ( )
        print ( a [ 2 ] * 10 + a [ 1 ] + a [ 0 ] )
