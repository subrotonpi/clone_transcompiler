def import import sys
import math
import math
import string
import math
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        input = sys.stdin
        min = 0
        n = int ( input.readline ( ) )
        input = input.split ( )
        value = [ int ( i ) for i in input ]
        state = True
        while state :
            for i in range ( n ) and state :
                if value [ i ] & 1 == 0 :
                    value [ i ] /= 2
                else :
                    state = False
            if state :
                min += 1
        print ( min )
    def log ( x , base = math.log ) :
        return int ( math.log ( x ) / math.log ( base ) )
