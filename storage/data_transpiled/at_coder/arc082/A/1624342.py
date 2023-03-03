def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
    def __init__ ( self ) :
        self.nums = [ 0 ] * 100000
        max = 0
        for i in range ( self.N ) :
            tmp = int ( self.nums [ i ] )
            self.nums [ tmp ] += 1
        for i in range ( self.nums [ 1 : - 1 ] ) :
            max = max ( max , self.nums [ i - 1 ] + self.nums [ i ] + self.nums [ i + 1 ] )
        print ( max )
