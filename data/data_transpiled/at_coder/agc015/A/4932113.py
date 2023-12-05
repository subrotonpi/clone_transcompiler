def import import sys
import random
import math
import random
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        N = random.randint ( 0 , 10 )
        A = random.randint ( 0 , 10 )
        B = random.randint ( 0 , 10 )
        min = A * ( N - 1 ) + B
        max = A + ( N - 1 ) * B
        self.out.append ( max ( 0 , max - min + 1 ) )
