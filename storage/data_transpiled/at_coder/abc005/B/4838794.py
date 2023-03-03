def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        a = int ( sc.readline ( ) )
        arr = [ ]
        for i in range ( a ) :
            arr.append ( sc.readline ( ) )
        arr.sort ( )
        print ( arr [ 0 ] )
