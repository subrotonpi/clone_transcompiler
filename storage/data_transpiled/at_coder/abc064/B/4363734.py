def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
    def __init__ ( self ) :
        self.list_a = [ ]
        for i in range ( self.n ) :
            din = sys.stdin.read ( )
            self.list_a.append ( din )
        self.list_a.sort ( )
        ans = 0
        for i in range ( 1 , self.n ) :
            ans += self.list_a [ i ] - self.list_a [ i - 1 ]
        print ( ans )
