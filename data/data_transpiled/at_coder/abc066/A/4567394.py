def import import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        sys.stdout = sys.__stdout__
        a = [ int ( i ) for i in sc.readline ( ).split ( ) ]
        a = [ int ( i ) for i in a ]
        print ( a [ 0 ] + a [ 1 ] )
        sys.stdout.flush ( )
