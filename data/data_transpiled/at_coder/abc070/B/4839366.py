def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.C = sys.stdin.read ( )
            self.D = sys.stdin.read ( )
            self.count = 0
            self.hairetu = [ ]
            self.hairetu2 = [ ]
            for i in range ( A + 1 , B + 1 ) :
                self.hairetu.append ( i )
            for i in range ( C + 1 , D + 1 ) :
                self.hairetu2.append ( i )
            for i in range ( B - A ) :
                for j in range ( D - C ) :
                    if self.hairetu [ i ] == self.hairetu2 [ j ] :
                        self.count += 1
        print ( self.count )
