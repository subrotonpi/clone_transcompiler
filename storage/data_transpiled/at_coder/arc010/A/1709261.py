def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
    def run ( self ) :
        N = self.N
        M = self.M
        A = self.A
        B = self.B
        for i in range ( M ) :
            c = self.c
            if N <= A :
                N += B
            N -= c
            if N < 0 :
                print ( i + 1 )
                return
        print ( "complete" )
