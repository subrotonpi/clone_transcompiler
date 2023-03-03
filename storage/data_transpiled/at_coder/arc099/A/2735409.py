def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.nums = [ ]
    def __init__ ( self ) :
        self.nums = [ ]
    def num_0 ( self ) :
        self.nums = [ ]
    def num1 ( self ) :
        self.nums = [ ]
    def list ( self ) :
        list = [ ]
        min = 0
        for i in range ( self.nums ) :
            list.append ( self.nums [ i ] )
            if list [ i ] == 1 :
                min = i
        ans = ( self.nums [ 0 ] - 1 ) / ( self.nums [ 1 ] - 1 ) + 1
        if ( self.nums [ 0 ] - 1 ) % ( self.nums [ 1 ] - 1 ) == 0 :
            ans -= 1
        print ( ans )
