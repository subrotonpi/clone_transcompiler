def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = [ sc.randint ( 0 , 5 ) for i in range ( 5 ) ]
        a = n [ 4 ] + n [ 3 ] + n [ 0 ]
        b = n [ 4 ] + n [ 2 ] + n [ 1 ]
        print ( a > b )
