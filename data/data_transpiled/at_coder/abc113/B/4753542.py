def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.T = sys.stdin.read ( )
        self.A = sys.stdin.read ( )
        self.b = 1000
        best = 0
        for i in range ( 1 , self.N + 1 ) :
            H = sys.stdin.read ( )
            a = abs ( A - ( self.T - H * 0.006 ) )
            if a < self.b :
                self.b = a
                best = i
        print ( best )
