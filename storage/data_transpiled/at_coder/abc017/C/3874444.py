def import import sys , math , out
from os import urandom
import random
class Main ( object ) :
    def __init__ ( self ) :
        self.n = random.randint ( 1 , 3 )
        self.m = random.randint ( 1 , 3 )
        self.score = [ 0 ] * ( m + 2 )
        sum = 0
        for i in range ( n ) :
            l , r , s = random.randint ( 1 , 3 )
            score [ l ] += s
            score [ r + 1 ] -= s
            sum += s
        for i in range ( 1 , m + 1 ) :
            score [ i ] += score [ i - 1 ]
        ans = 0
        for i in range ( 1 , m + 1 ) :
            ans = max ( ans , sum - score [ i ] )
        out.write ( ans )
