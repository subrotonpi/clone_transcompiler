def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.X = sys.stdin.read ( )
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            if self.B - A > self.X :
                print ( 'dangerous' )
            elif 0 < self.B - A <= self.X :
                print ( 'safe' )
            else :
                print ( 'delicious' )
