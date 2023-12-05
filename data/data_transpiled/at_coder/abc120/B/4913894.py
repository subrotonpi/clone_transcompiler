def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.K = sys.stdin.read ( )
        def min ( self , A ) :
            self.A = min ( A , B )
            self.B = min ( A , B )
            self.K = min ( A , B )
            n = 0
            for i in range ( self.K , 0 , - 1 ) :
                if A % i == 0 and B % i == 0 :
                    n += 1
                if n == K :
                    print ( i )
                    break
