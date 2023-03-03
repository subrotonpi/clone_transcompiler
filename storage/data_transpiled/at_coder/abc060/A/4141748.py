def import java.util.Scanner
class Main ( object ) :
    def __init__ ( self ) :
        sc = java.util.Scanner ( )
        ar = [ sc.next ( ) for i in range ( 3 ) ]
        if ar [ 0 ] [ - 1 ] == ar [ 1 ] [ 0 ] and ar [ 1 ] [ - 1 ] == ar [ 2 ] [ 0 ] :
            print ( "YES" )
        else :
            print ( "NO" )
