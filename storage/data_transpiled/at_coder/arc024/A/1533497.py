def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.l = sys.stdin.readline ( ).strip ( )
        self.r = sys.stdin.readline ( ).strip ( )
        ls = [ 0 ] * 41
        rs = [ 0 ] * 41
        for i in range ( l ) :
            ls [ i ] += 1
        for i in range ( r ) :
            rs [ i ] += 1
        sum = 0
        for i in range ( 41 ) :
            sum += min ( ls [ i ] , rs [ i ] )
        print ( sum )
