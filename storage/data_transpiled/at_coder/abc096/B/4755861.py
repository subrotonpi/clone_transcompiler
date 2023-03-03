def _import ( * args ) : return _import ( * args )
import sys
import random
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a , b , c , k = random.randint ( 1 , 10 ) , random.randint ( 1 , 10 ) , random.randint ( 1 , 10 )
        total = a + b + c
        max = max ( a , b , c )
        pow = int ( random.randrange ( 2 , k ) )
        self.out.write ( ( total - max ) + max * pow )
    def max ( self , * ar ) :
        ar.sort ( )
        return ar [ - 1 ]
