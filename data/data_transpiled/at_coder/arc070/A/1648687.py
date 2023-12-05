def import import sys , string , traceback
from os import urandom
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
    def __call__ ( self , * args , ** kwargs ) :
        x = int ( args [ 0 ] )
        sum = 0
        count = 0
        if x == 1 :
            count = 1
        for i in range ( 1 , x ) :
            if x == 2 :
                count = 2
            else :
                count += 1
                sum = sum + i
                if sum >= x :
                    break
        sys.stdout.write ( count )
