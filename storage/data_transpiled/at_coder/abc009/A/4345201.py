def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        try :
            sc = sys.stdin
        except :
            print ( 'out' )
        else :
            n = int ( sc.read ( ) )
            if n % 2 == 0 :
                print ( n / 2 )
            else :
                print ( n / 2 + 1 )
