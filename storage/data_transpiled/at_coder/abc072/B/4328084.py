def import import sys
import string
import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = string
        str = sc.read ( )
        for i in range ( 0 , len ( str ) , 2 ) :
            sys.stdout.write ( str [ i : i + 2 ] )
        print ( )
