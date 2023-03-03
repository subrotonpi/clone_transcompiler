def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.x = sys.stdin.read ( )
            self.a = sys.stdin.read ( )
            self.b = sys.stdin.read ( )
            print ( ( 'A' if abs ( self.x - a ) < abs ( self.x - b ) else 'B' ) )
