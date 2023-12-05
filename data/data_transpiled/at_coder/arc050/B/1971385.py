def import import sys , re , time
from os import urandom
import random
class Main ( object ) :
    def __init__ ( self ) :
        self.r = sys.stdin.read ( 1 )
        s = self.r.decode ( 'utf-8' )
        sl = re.split ( '[\\s]+' , s )
        R = int ( sl [ 0 ] )
        B = int ( sl [ 1 ] )
        s = self.r.decode ( 'utf-8' )
        sl = re.split ( '[\\s]+' , s )
        x = int ( sl [ 0 ] )
        y = int ( sl [ 1 ] )
        rl = 0
        rr = min ( R , B ) + 1
        while rr - rl >= 2 :
            rm = ( rl + rr ) / 2
            if ( R - rm ) / ( x - 1 ) + ( B - rm ) / ( y - 1 ) < rm :
                rr = rm
            else :
                rl = rm
        print ( rl )
