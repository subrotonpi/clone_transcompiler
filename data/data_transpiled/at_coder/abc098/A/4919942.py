def import import sys
import math
import random
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        a = random.randint ( 0 , 100 )
        b = random.randint ( 0 , 100 )
        max = max ( a + b , a - b )
        print ( max , a * b )
