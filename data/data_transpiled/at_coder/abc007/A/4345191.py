def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.name = sys.argv [ 0 ]
    def __call__ ( self , * args , ** kwargs ) :
        try :
            sc = sys.stdin
        except :
            print ( "out" )
        else :
            n = int ( sc.read ( ) )
            print ( n - 1 )
