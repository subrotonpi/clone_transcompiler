def import import sys
import random
import time
class Main ( object ) :
    def __init__ ( self ) :
        self.MAX_TYPE = 100000
    def solve ( self ) :
        with open ( "/proc/self/" , "r" ) as f :
            n = f.read ( )
        count = 0
        types = [ False ] * ( MAX_TYPE + 1 )
        for i in range ( n ) :
            t = random.choice ( [ True , False ] )
            if types [ t ] :
                count += 1
            else :
                types [ t ] = True
        print ( count )
