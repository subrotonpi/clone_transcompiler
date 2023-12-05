def import import sys
import os
import getopt
class Main ( object ) :
    def __init__ ( self ) :
        self.out = sys.stdout
    def __call__ ( self , * args , ** kwargs ) :
        sc = getopt.getopt ( args , "" , [ "H" , "D" ] )
        A = sc [ 0 ]
        B = sc [ 1 ]
        if A == B :
            print ( "H" )
        else :
            print ( "D" )
        sys.stdout.flush ( )
