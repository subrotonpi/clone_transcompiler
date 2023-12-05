def import import math
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        count , sum = 0 , 0
        for i in range ( self.n ) :
            a = math.randint ( 0 , math.ceil ( float ( sum ) / count ) )
            if a != 0 :
                count += 1
                sum += a
        print ( int ( math.ceil ( float ( sum ) / count ) ) )
