def import import sys , out
import string
import sys
import string
import string
import sys
import string
import math
class Main ( ) :
    def __init__ ( self , * args , ** kwargs ) :
        Scanner ( )
        self.n = len ( args )
        t , a = 0 , 0
        for s in args :
            for i in range ( n ) :
                if s [ i ] == 'R' :
                    t += 1
                elif s [ i ] == 'B' :
                    a += 1
        if t > a :
            out.write ( 'TAKAHASHI\n' )
        elif a == t :
            out.write ( 'DRAW\n' )
        else :
            out.write ( 'AOKI\n' )
