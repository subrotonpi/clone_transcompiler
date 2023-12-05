def import readline
import readline
import readline
import time
import sys
import random
import sys
import time
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.stdout = sys.stdout
        self.T = randint ( 1 , 10000 )
        for cases in range ( T ) :
            n , k , b , t = randint ( 1 , 10000 ) , randint ( 1 , 10000 ) , randint ( 1 , 10000 )
            x = [ randint ( 1 , 10000 ) for _ in range ( n ) ]
            v = [ randint ( 1 , 10000 ) for _ in range ( n ) ]
            min = [ ]
            for i in range ( n ) :
                if b - x [ i ] > t * v [ i ] :
                    min.append ( 10000 )
                    continue
                for j in range ( n ) :
                    if x [ j ] <= x [ i ] :
                        continue
                    if b - x [ j ] > t * v [ j ] :
                        min [ i ] += 1
            min.sort ( )
            res = 0
            for i in range ( k ) :
                res += min [ i ]
            print ( "Case #%d: %s" % ( cases + 1 , res if res < 10000 else "IMPOSSIBLE" ) , end = ' ' )
        sys.stdout.close ( )
    def seekForToken ( self ) :
        try :
            while not self.stdin :
                s = readline ( self )
                if not s :
                    return False
                self.stdin = sys.stdin
            return True
        except EOFError :
            return False
    randint ( 1 , 10000 )
    randint ( 1 , 10000 )
    randint ( 1 , 10000 )
    randint ( 1 , 10000 )
    randint ( 1 , 10000 )
    return True
