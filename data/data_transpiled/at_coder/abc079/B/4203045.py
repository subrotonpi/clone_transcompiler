def import _main
import sys
import os
import sys
import time
import glob
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        n = sc.nextInt ( )
        lucas = [ 2L , 1L ]
        for i in range ( 2 , n + 1 ) :
            lucas.append ( lucas [ i - 1 ] + lucas [ i - 2 ] )
        print ( lucas [ n ] )
