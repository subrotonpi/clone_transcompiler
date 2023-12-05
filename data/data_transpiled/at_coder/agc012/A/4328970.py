def import import sys
import time
import random
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        sc = sys.stdin
        n = sc.randint ( 1 , 3 )
        a = [ random.randint ( 0 , 3 * n ) for i in range ( n * 3 ) ]
        a.sort ( )
        ans = 0
        for i in range ( n * 3 - 2 , n - 2 , 2 ) :
            ans += a [ i ]
        out.write ( ans )
