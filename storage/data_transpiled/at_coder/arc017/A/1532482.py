def import math
class Main ( object ) :
    def __init__ ( self , n ) :
        self.n = n
    def run ( self ) :
        for i in range ( 2 , int ( math.sqrt ( n ) + 1 ) ) :
            if n % i == 0 :
                self.print ( "NO" )
                return
        self.print ( "YES" )
