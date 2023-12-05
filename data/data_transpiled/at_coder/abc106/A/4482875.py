def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.input = sys.stdin
            self.A = self.input.read ( )
            self.B = self.input.read ( )
    ans = ( A - 1 ) * ( B - 1 )
    sys.stdout.write ( ans )
