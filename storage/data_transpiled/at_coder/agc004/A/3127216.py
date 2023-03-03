def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.C = sys.stdin.read ( )
            self.ans = min ( min ( ( A - A / 2 - A / 2 ) * B * C , ( B - B / 2 - B / 2 ) * C * A ) , ( C - C / 2 - C / 2 ) * A * B )
    return Main ( )
