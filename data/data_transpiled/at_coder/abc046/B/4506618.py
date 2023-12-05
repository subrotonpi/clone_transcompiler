def import math
class Main ( object ) :
    def __init__ ( self , n , k ) :
        self.n = n
        self.k = k
        cnt = self.k
        cnt *= math.pow ( self.k - 1 , n - 1 )
        print ( cnt )
