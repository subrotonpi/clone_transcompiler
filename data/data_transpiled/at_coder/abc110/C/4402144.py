def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.s = sys.stdin.read ( )
            self.t = sys.stdin.read ( )
            b = True
            for i in range ( len ( self.s ) ) and b :
                b &= self.s.index ( self.s [ i ] , i + 1 ) == self.t.index ( self.t [ i ] , i + 1 )
            if b :
                print ( "Yes" )
            else :
                print ( "No" )
