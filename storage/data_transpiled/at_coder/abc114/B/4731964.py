def import import sys
import string
import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = string.split ( sys.stdin.read ( ) )
        s = sc.split ( )
        min = 753
        for num in s [ - 2 : ] :
            n = int ( num )
            min = min ( min , abs ( 753 - n ) )
        print ( min )
