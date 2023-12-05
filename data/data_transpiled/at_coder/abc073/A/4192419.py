def import import string
import sys
import string
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = string.split ( sys.argv [ 1 ] )
        n = [ x.strip ( ) for x in sc.split ( '' ) ]
        for x in n :
            if x == '9' :
                print ( 'Yes' )
                return
        print ( 'No' )
