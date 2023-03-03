def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            if self.A * self.B % 2 == 1 :
                print ( "Yes" )
            else :
                print ( "No" )
