def import import math
class Main ( object ) :
    def __init__ ( self ) :
        self.num = int ( self.num )
        self.sum = math.sum ( self.num )
        for i in range ( int ( math.floor ( self.sum / num ) ) , 1 , - 1 ) :
            if self.sum % i == 0 :
                print ( i )
                break
