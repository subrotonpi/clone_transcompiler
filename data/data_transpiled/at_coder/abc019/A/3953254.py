def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        A = [ sc.randint ( 0 , 3 ) for i in range ( 3 ) ]
        A.sort ( )
        print ( A [ 1 ] )
