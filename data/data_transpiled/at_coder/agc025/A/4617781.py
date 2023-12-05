def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.N = self.sc.__next__ ( )
            self.sum = 0
            while self.N > 0 :
                self.sum += self.N % 10
                self.N /= 10
            print ( self.sum == 1 )
