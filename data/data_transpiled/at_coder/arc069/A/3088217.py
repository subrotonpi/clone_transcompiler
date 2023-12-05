def import import os
import sys
import os
import sys
import random
import time
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        N = int ( os.environ [ 'NUMBER_OF_LINES' ] )
        M = int ( os.environ [ 'NUMBER_OF_LINES' ] )
        if N * 2 > M :
            print ( M / 2 )
        else :
            print ( ( N * 2 + M ) / 4 )
