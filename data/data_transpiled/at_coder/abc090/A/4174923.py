def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            for i in range ( 3 ) :
                sys.stdout.write ( sc.read ( ) [ i ] )
    return Main
