def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.out = sys.stdout
    def __call__ ( self , * args , ** kwargs ) :
        try :
            sc = sys.stdin
        except :
            print ( 'out' )
        else :
            a = sc.read ( )
            if a == 'a' :
                print ( - 1 )
            else :
                print ( 'a' )
