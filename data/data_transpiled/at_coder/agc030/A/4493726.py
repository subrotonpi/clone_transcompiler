def main ( arg = None ) :
    import sys
    class Main ( object ) :
        def __init__ ( self , * args , ** kwargs ) :
            scn = args [ 0 ]
            cookie = [ scn.index ( 'cookie' ) for i in range ( 3 ) ]
            if cookie [ 0 ] + cookie [ 1 ] >= cookie [ 2 ] - 1 :
                print ( cookie [ 1 ] + cookie [ 2 ] )
            else :
                print ( cookie [ 1 ] + cookie [ 1 ] + cookie [ 0 ] + 1 )
