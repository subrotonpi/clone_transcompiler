def import import sys , out
import string
import sys
import random
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        N = len ( sys.stdin )
        cnt = [ 0 ] * 2
        for i in range ( N ) :
            cnt [ int ( sys.stdin.readline ( ) ) % 2 ] += 1
        rest_odd = cnt [ 1 ] % 2
        cnt [ 0 ] += cnt [ 1 ] / 2
        if ( rest_odd == 0 and cnt [ 0 ] > 0 ) or ( rest_odd == 1 and cnt [ 0 ] == 0 ) :
            out.write ( 'YES' )
        else :
            out.write ( 'NO' )
