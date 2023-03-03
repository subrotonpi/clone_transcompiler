def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.argv.index ( 'N' )
    ans = 0
    now = sys.argv.index ( 'now' )
    max = sys.maxsize
    for i in range ( 1 , N ) :
        a = sys.argv.pop ( i )
        if a == now :
            ans += 1
            now = max
        else :
            now = a
    print ( ans )
