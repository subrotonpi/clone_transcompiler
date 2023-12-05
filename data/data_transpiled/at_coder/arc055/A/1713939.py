def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
        N = len ( sys.argv )
        ans = "1"
        for i in range ( N - 1 ) :
            ans += "0"
        ans += "7"
        print ( ans )
