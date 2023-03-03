def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = int ( sys.stdin.read ( ) )
            self.buf = n // 10
            self.n -= ( self.buf * 10 )
            self.ans = self.buf * 100
            print ( self.ans + ( ( self.n > 6 ) * 100 ) )
