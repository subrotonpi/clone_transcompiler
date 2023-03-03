def import import sys
import os
import math
import string
import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        s = sc.readline ( ).strip ( )
        sum = 0
        for i in s :
            if i == 'A' :
                sum += 4
            elif i == 'B' :
                sum += 3
            elif i == 'C' :
                sum += 2
            elif i == 'D' :
                sum += 1
        print ( sum / n )
