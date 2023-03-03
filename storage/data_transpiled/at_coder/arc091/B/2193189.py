def import import os
import sys
import os
import math
import random
class Main ( object ) :
    def __init__ ( self ) :
        self.f = open ( os.devnull , 'r' )
        tmplist = self.f.readline ( ).split ( )
        n = int ( tmplist [ 0 ] )
        k = int ( tmplist [ 1 ] )
        result = 0
        for b in range ( 1 , n + 1 ) :
            p = n // b
            r = n % b
            result += p * max ( 0 , b - k ) + max ( 0 , r - k + 1 )
        if k == 0 :
            result -= n
        print ( result )
