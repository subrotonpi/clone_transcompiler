def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
    def go ( self ) :
        N = self.N
        for i in range ( 2 , N - 1 ) :
            if N % i == 0 :
                print ( "NO" )
                return
        print ( "YES" )
