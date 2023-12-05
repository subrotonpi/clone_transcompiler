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
        n = int ( sc )
        t = [ ]
        for i in range ( n ) :
            t.append ( string.split ( sc , ' ' ) )
        t.sort ( )
        print ( t )
