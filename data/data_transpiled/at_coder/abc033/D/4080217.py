def main ( ) :
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = len ( self.arr )
            self.x = self.arr [ 0 ]
            self.y = self.arr [ 1 ]
            self.count_v = 0
            self.count = 0
            self.count2 = 0
            self.count = 0
            self.count2 = 0
            self.count = 0
            self.count = 0
            self.count2 = 0
            self.count = 0
            self.count = 0
            self.count2 = 0
            self.count = 0
            self.count = 0
            self.count = 0
            self.all = N * 1 * ( N - 1 ) * ( N - 2 ) / 6
            eps = 1e-10
            for o in range ( N ) :
                angles = [ ]
                for i in range ( N ) :
                    if o == i :
                        continue
                    angles.append ( math.atan2 ( y [ i ] - y [ o ] , x [ i ] - x [ o ] ) )
                    angles.append ( math.atan2 ( y [ i ] - y [ o ] , x [ i ] - x [ o ] ) + 2 * math.pi )
                angles.sort ( )
                for ang in angles :
                    self.count_v += self.upper_bound ( angles , ang + math.pi / 2 + eps ) - self.lower_bound ( angles , ang + math.pi / 2 - eps )
                    self.count_a += self.lower_bound ( angles , ang + math.pi - eps ) - self.upper_bound ( angles , ang + math.pi / 2 + eps )
            print ( self.all - self.count_v - self.count_a , self.count , self.count )
    def lower_bound ( self , lis , value ) :
        low = 0
        high = len ( self.lis )
        while low < high :
            mid = ( ( high - low ) >> 1 ) + low
            if self.lis [ mid ] [ 0 ] < value :
                low = mid + 1
            else :
                high = mid
        return low , mid
