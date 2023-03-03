def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.name = "Main"
    def __call__ ( self , * args ) :
        N = int ( self.name )
        if N % 10 <= 6 :
            print ( ( N / 10 ) * 100 + ( N - ( N / 10 ) * 10 ) * 15 )
        else :
            print ( ( ( N / 10 ) + 1 ) * 100 )
