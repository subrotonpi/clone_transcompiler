def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        try :
            sc = sys.stdin
        except :
            print ( "out" )
        else :
            k = int ( sc.read ( ) )
            if k % 2 == 0 :
                print ( ( k / 2 ) * ( k / 2 ) )
            else :
                print ( ( k / 2 ) * ( k / 2 + 1 ) )
