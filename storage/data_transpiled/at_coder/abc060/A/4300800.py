def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self , * args ) :
            sc = sys.stdin
            A = sc.readline ( )
            B = sc.readline ( )
            C = sc.readline ( )
            if A [ - 1 ] == B [ 0 ] :
                if B [ - 1 ] == C [ 0 ] :
                    print ( "YES" )
                    return
            print ( "NO" )
    return Main ( )
