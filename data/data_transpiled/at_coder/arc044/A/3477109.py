def import import sys , out
import os
import sys
import random
import time
import math
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        n = int ( sys.stdin.readline ( ) )
        c = 0
        for i in range ( 2 , n ) :
            if n % i == 0 :
                break
            c += 1
        if c == n - 2 and n > 1 :
            out.write ( "Prime" )
        else :
            n0 , digsum , nt = n % 10 , 0 , 0
            while n > 0 :
                digsum += n % 10
                n /= 10
            if digsum % 3 and n0 != 5 and n0 % 2 and nt > 1 :
                out.write ( "Prime" )
            else :
                out.write ( "Not Prime" )
