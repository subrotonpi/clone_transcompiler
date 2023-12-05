def _import ( ) :
    from math import sin , cos , tan
    from os.path import join
    from os import getenv
    from os import sep
    from math import sin , cos , tan
    MODULO = 1_000_000_000 + 7
    def tr ( * args ) :
        with open ( join ( getenv ( ) , sep ) , 'r' ) as f :
            n = int ( f.read ( ) )
            m = int ( f.read ( ) )
            dp = [ [ 0 , 0 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] , [ 0 , 1 , 0 ] ]
    tr ( * args )
    return tr ( * args )
