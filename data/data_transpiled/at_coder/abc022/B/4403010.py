def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.num_list = [ 0 ] * 100000 + [ 1 ]
        ans = 0
        for i in range ( self.n ) :
            a = sys.stdin.read ( )
            self.num_list [ a ] += 1
            if self.num_list [ a ] >= 2 :
                ans += 1
        print ( ans )
