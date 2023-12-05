def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sys = sys
    def __call__ ( self , * args , ** kwargs ) :
        try :
            sc = open ( self.sys.argv [ 0 ] , 'r' )
            s = sc.read ( )
            print ( s , 'pp' )
        except :
            print ( 'out' )
