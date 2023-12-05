def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
        self.N = self.N
        self.A = self.A
        self.B = self.B
    def __str__ ( self ) :
        if long ( self.A * self.B ) < N or N < long ( self.A + B - 1 ) :
            self.s = [ - 1 ]
        else :
            n = 0
            for i in range ( 1 , A + 1 ) :
                while n + B + ( A - i ) > N :
                    B -= 1
                for j in range ( n + B , n - 1 , - 1 ) :
                    self.s.append ( "%s " % j )
                n += B
            self.s = "\n".join ( self.s )
        print ( self.s )
