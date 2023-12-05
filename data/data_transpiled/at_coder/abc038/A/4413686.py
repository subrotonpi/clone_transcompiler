def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
        def readline ( self ) :
            return sys.stdin.readline ( ).strip ( )
    c = Main ( )
    c = c.readline ( ).rstrip ( )
    print ( "YES" if c [ - 1 ] == 'T' else "NO" )
