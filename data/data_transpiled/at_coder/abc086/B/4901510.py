def import import sys
import math
import os
import sys
import math
import math
class Main ( object ) :
    def __init__ ( self ) :
        input = sys.stdin.read ( )
        args = input.split ( )
        number = int ( args [ 0 ] + args [ 1 ] )
        result = math.sqrt ( number )
        round = int ( result )
        print ( "Yes" if result == round else "No" )
