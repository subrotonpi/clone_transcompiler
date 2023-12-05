def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = sys.stdin.read ( )
            self.b = sys.stdin.read ( )
            self.c = sys.stdin.read ( )
        def __str__ ( self ) :
            return str ( self.a ).upper ( ) + '' + str ( self.b ).upper ( ) + '' + str ( self.c ).upper ( )
