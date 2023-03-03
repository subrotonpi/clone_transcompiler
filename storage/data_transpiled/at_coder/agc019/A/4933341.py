def import import sys
import random
import math
import random
import sys
class Main ( sys.stdout ) :
    def __init__ ( self ) :
        Scanner ( )
        Q , H , S , D , N = random.randint ( 0 , 2 )
        one_price = min ( min ( Q * 4 , H * 2 ) , S )
        if float ( one_price ) <= float ( D ) / 2 :
            self.out.append ( N * one_price )
        else :
            self.out.append ( ( N / 2 ) * D + ( N % 2 ) * one_price )
