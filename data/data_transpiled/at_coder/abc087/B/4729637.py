def main ( arg = None ) :
    import sys
    class Main ( object ) :
        def __init__ ( self , arg ) :
            self.A = int ( sys.stdin.read ( ) )
            self.B = int ( sys.stdin.read ( ) )
            self.C = int ( sys.stdin.read ( ) )
            self.X = int ( sys.stdin.read ( ) )
            self.X = int ( sys.stdin.read ( ) )
        def execute ( self ) :
            count = 0
            for a in range ( 0 , A ) :
                for b in range ( 0 , B ) :
                    for c in range ( 0 , C ) :
                        if self.X == a * 500 + b * 100 + c * 50 :
                            count += 1
            print ( count )
