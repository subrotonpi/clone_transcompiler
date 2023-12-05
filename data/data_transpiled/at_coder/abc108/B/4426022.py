def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.out = sys.stdout
    def __call__ ( self , * args ) :
        try :
            sc = sys.stdin
        except :
            print ( "out" )
        x1 , y1 , x2 , y2 = map ( int , args )
        x1 , y1 , x2 , y2 = map ( int , sc.stdout.split ( "\n" ) )
        print ( ( x2 + y1 - y2 ) , y2 - x1 + x2 , x1 + y1 - y2 , y1 - x1 + x2 )
