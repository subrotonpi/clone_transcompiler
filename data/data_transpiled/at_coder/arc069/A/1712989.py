def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
    def run ( self ) :
        N = int ( self.n )
        M = int ( self.m )
        if M >= 2 * N :
            print ( N , ( M - 2 * N ) / 4 )
        else :
            print ( M / 2 )
