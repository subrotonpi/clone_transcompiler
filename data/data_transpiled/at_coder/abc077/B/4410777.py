def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
    N = sys.argv [ 1 ]
    ans = 1
    tmp = 0
    while ( tmp + 1 ) ** 2 <= N :
        ans = ( tmp + 1 ) ** 2
        tmp += 1
    print ( ans )
