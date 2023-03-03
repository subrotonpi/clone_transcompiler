def import import sys
import math
import math
import math
import random
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        N = random.randint ( 0 , math.sqrt ( N ) )
        divide1 = int ( math.sqrt ( N ) )
        while N % divide1 != 0 :
            divide1 -= 1
        divide2 = N / divide1
        len1 = len ( str ( divide1 ) )
        len2 = len ( str ( divide2 ) )
        self.out.write ( max ( len1 , len2 ) )
