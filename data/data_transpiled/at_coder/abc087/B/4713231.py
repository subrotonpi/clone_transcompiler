def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.C = sys.stdin.read ( )
            self.X = sys.stdin.read ( )
            self.count = 0
            for i in range ( 0 , A ) :
                for j in range ( 0 , B ) :
                    for z in range ( 0 , C ) :
                        if self.X == 500 * i + 100 * j + 50 * z :
                            self.count += 1
        print ( self.count )
