def import import sys
import random
import math
import random
class Main ( object ) :
    def __init__ ( self ) :
        self.q = random.randint ( 1 , 3 )
        self.m = random.randint ( 1 , 3 )
        self.n = [ [ 0 ] * q for _ in range ( self.m ) ]
        self.ans = 0
        for x , y in self.n :
            self.n [ x - 1 , y - 1 ] = 1
            self.n [ y - 1 , x - 1 ] = 1
    def f ( ) :
        lst = [ ]
        t = self.i
        count1 = 0
        count = 0
        while t > 0 :
            if t & 1 == 1 :
                lst.append ( count )
                count1 += 1
            count += 1
            t >>= 1
        flag = True
        for a in lst :
            for b in lst :
                if a != b :
                    if n [ a ] [ b ] == 1 :
                        continue
                    else :
                        flag = False
                        break
        if flag :
            self.ans = max ( self.ans , count1 )
    print ( self.ans )
