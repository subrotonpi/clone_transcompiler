def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.var ( 'N' )
        va = sc.var ( 'va' )
        vb = sc.var ( 'vb' )
        L = sc.var ( 'L' )
        y = L
        for i in range ( N ) :
            y = y / va
            y = vb * y
        print ( float ( y ) )
