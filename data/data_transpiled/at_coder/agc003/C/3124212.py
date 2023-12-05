def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = len ( sys.argv )
    N = sys.argv [ 1 ]
    A = [ ]
    for i in range ( N ) :
        A.append ( sys.argv [ i ] )
    val_idx = { A [ i ] : i for i in range ( N ) }
    B = [ A [ i ] for i in range ( N ) ]
    B.sort ( )
    ans = 0
    for i in range ( N ) :
        if i % 2 == 1 and val_idx [ B [ i ] ] % 2 == 0 :
            ans += 1
    print ( ans )
