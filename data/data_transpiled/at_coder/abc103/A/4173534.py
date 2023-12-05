def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        ar = [ ]
        for i in range ( 3 ) :
            ar.append ( sc.__next__ ( ) )
        ar.sort ( )
        print ( ( ar [ 2 ] - ar [ 1 ] ) + ( ar [ 1 ] - ar [ 0 ] ) )
