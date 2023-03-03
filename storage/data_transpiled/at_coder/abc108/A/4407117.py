def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.k = self.sc.__next__ ( )
            if self.k % 2 == 0 :
                print ( self.k ** 2 / 4 )
                return
            print ( self.k / 2 * ( self.k + 1 ) / 2 )
