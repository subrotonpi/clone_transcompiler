def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
        N = sc.nextInt ( )
        ans = 1
        while ans <= N :
            ans *= 2
        print ( ans / 2 )
