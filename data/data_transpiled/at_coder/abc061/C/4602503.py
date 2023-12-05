def import import _sum
import math
import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = _sum.__doc__
        self.N = sc.N
        self.K = sc.K
        self.dict = defaultdict ( int )
        for value , count in _sum.items ( ) :
            self.dict [ value ] = self.dict [ value ] + count if value in self.dict else count
        self.sum = 0
        for key , value in self.dict.items ( ) :
            if self.sum < K and K <= self.sum + value :
                print ( key )
            self.sum += value
