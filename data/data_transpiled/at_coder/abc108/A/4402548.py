def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.i = int ( self.sc )
            if self.i % 2 == 0 :
                print ( ( self.i // 2 ) ** 2 )
            else :
                print ( ( self.i // 2 ) ** 2 + 1 )
