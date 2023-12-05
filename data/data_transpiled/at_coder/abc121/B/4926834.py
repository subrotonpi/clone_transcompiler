def import import sys
import string
import sys
import itertools
class Main ( object ) :
    def __init__ ( self ) :
        try :
            with open ( sys.argv [ 1 ] ) as f :
                n = int ( f.read ( ) )
                m = int ( f.read ( ) )
                c = int ( f.read ( ) )
        except :
            print ( sys.exc_info ( ) [ 0 ] )
            return
    def main ( ) :
        b = [ ]
        def foo ( ) :
            b.append ( sys.stdin.read ( ) )
        print ( sum ( b ) )
        return ( sum ( b ) > 0 )
