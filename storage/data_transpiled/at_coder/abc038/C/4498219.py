def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.index = 1
        ans = 0
        p = sys.stdin.read ( )
        for i in range ( 1 , n ) :
            po = sys.stdin.read ( )
            if po > p :
                self.index += 1
            else :
                ans += long ( self.index * ( self.index + 1 ) / 2 )
                self.index = 1
            p = po
        self.ans += long ( self.index * ( self.index + 1 ) / 2 )
        print ( ans )
