def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            if self.A % 2 == 0 :
                print ( ( self.A // 2 ) ** 2 )
            else :
                print ( ( self.A // 2 ) ** 2 + 1 )
