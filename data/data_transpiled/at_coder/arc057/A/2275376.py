def import math
class Main ( object ) :
    def __init__ ( self , a , k ) :
        self.a = a
        self.k = k
        if not k :
            print ( 2000000000000l - a )
        else :
            for i in range ( 1 ) :
                if a * math.pow ( k + 1 , i ) + ( math.pow ( k + 1 , i ) - 1 ) / k >= 2 * math.pow ( 10 , 12 ) :
                    print ( i )
                    break
