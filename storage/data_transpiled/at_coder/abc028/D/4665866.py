def import import math
import sys
import math
import random
import sys
class Main ( sys.stdout ) :
    def __init__ ( self ) :
        Scanner ( )
        N = random.randint ( 0 , 1 )
        K = random.randint ( 0 , 1 )
        comb = 0
        comb += ( K - 1 ) * ( N - K ) * 6
        comb += ( K - 1 ) * 3
        comb += ( N - K ) * 3
        comb += 1
        all_carry = math.pow ( N , 3 )
        self.out.println ( float ( comb ) / all_carry )
