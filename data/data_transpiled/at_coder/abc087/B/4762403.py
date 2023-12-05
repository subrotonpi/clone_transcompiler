def main ( arg ) :
    import sys
    class Main ( object ) :
        def __init__ ( self , arg ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.C = sys.stdin.read ( )
            self.X = sys.stdin.read ( )
            self.print ( self.calc ( A , B , C , X ) )
        def calc ( A , B , C , X ) :
            count = 0
            for i in range ( 0 , A ) :
                for j in range ( 0 , B ) :
                    for k in range ( 0 , C ) :
                        if X == 500 * i + 100 * j + 50 * k :
                            count += 1
            return count
    return Main ( )
