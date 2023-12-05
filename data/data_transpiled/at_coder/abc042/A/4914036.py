def import import *
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        ar = [ sc.randint ( 0 , 3 ) for _ in range ( 3 ) ]
        ar.sort ( )
        if ar [ 0 ] == 5 and ar [ 1 ] == 5 and ar [ 2 ] == 7 :
            print ( "YES" )
        else :
            print ( "NO" )
