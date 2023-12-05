def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        self.k = sys.maxint
        self.number = [ ]
        min_idx = 0
        for i in range ( self.n ) :
            self.number.append ( self.number [ i ] )
            if self.number [ i ] == 1 :
                min_idx = i
        if self.k >= self.n :
            print ( 1 )
            return
        if self.n == 1 :
            print ( 0 )
            return
        min_count = sys.maxint
        for left in range ( 1 , self.k + 1 ) :
            left_count = ( min_idx + 1 - left ) % ( self.k - 1 ) or ( min_idx + 1 - left ) / ( self.k - 1 ) + 1
            right = self.k - left
            right_count = ( self.n - 1 - min_idx - right ) % ( self.k - 1 ) or ( self.n - 1 - min_idx - right ) / ( self.k - 1 ) + 1
            current_count = left_count + right_count
            if current_count < min_count :
                min_count = current_count
        print ( min_count )
