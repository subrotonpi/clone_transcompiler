def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = sys.stdin.read ( )
            self.b = sys.stdin.read ( )
            self.c = sys.stdin.read ( )
            print ( "YES" if ( self.b - a == self.c - b ) else "NO" )
