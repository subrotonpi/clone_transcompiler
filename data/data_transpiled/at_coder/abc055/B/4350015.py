def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
    N = sys.argv [ 1 ]
    ans = 1
    for i in range ( 1 , N + 1 ) :
        ans = ans * i % 1000000007
    print ( ans )
