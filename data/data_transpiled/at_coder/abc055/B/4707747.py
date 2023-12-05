def import import math
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        self.power = 1
        self.c = long ( math.pow ( 10 , 9 ) + 7 )
        self.div = 0
        for i in range ( 1 , N + 1 ) :
            power *= i
            power %= c
        print ( power )
