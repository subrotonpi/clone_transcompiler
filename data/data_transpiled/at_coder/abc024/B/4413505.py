def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.t = sys.stdin.read ( )
        self.po = [ ]
        for i in range ( self.n ) :
            self.po.append ( i )
    ans = 0
    for i in range ( 1 , n ) :
        ans += min ( po [ i ] - po [ i - 1 ] , t )
    print ( ans , t )
