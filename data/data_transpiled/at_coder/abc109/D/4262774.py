def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            h = sc.read ( )
            w = sc.read ( )
            d = [ ]
            for i in range ( 1 , h + 1 ) :
                for j in range ( 1 , w + 1 ) :
                    d [ i ] [ j ] = sc.read ( )
    print ( len ( ans ) )
    for s in ans :
        print ( s )
