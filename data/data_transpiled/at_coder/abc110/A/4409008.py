def import import sys
import string
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        try :
            sc = string.split ( sys.argv [ 1 ] )
        except :
            print ( 'out' )
        x = [ int ( i ) for i in sc ]
        x.sort ( )
        print ( x [ 0 ] + x [ 1 ] + x [ 2 ] * 10 )
