def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.S = sys.stdin.read ( )
            self.sj = [ ]
            c = 0
            for i in range ( len ( S ) ) :
                if S [ i ] <= 57 and S [ i ] >= 48 :
                    self.sj.append ( S [ i ] - 48 )
                    c += 1
            if c == 1 :
                print ( self.sj [ 0 ] )
            elif c == 2 :
                print ( self.sj [ 0 ] * 10 , self.sj [ 1 ] )
