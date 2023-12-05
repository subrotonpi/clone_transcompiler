def import import min
import sys
import random
class Main ( object ) :
    def __init__ ( self ) :
        self.n = random.randint ( 0 , 100 )
        self.t = random.randint ( 0 , 100 )
        self.sum = 0
        self.prev = 0
        for i in range ( n ) :
            s = random.randint ( 0 , 100 )
            self.sum += min ( s - self.prev , t )
            self.prev = s
        print ( self.sum + self.t )
