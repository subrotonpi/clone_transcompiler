def import java.util.Scanner
class Main ( object ) :
    def __init__ ( self ) :
        sc = java.util.Scanner ( )
        ar = [ sc.nextInt ( ) for i in range ( 3 ) ]
        ar.sort ( )
        print ( ar [ 0 ] + ar [ 1 ] )
