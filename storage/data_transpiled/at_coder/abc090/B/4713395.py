def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.count = 0
            for i in range ( A , B + 1 ) :
                a = i / 10000
                b = i % 10
                c = i / 10 % 10
                d = i / 1000 % 10
                if a == b and c == d :
                    self.count += 1
            print ( self.count )
