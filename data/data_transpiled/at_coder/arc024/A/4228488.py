def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.l = sys.stdin.readline ( ).strip ( )
        self.r = sys.stdin.readline ( ).strip ( )
    def __init__ ( self ) :
        self.l = sys.stdin.readline ( ).strip ( )
        self.r = sys.stdin.readline ( ).strip ( )
        self.arr_l = [ 0 ] * 41
        self.arr_r = [ 0 ] * 41
        for i in range ( self.l ) :
            self.arr_l [ self.l [ i ] ] += 1
        for i in range ( self.r ) :
            self.arr_r [ self.r [ i ] ] += 1
        self.sum = 0
        for i in range ( 10 , 40 ) :
            self.sum += min ( self.arr_l [ i ] , self.arr_r [ i ] )
        print ( self.sum )
