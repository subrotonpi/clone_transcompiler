def import import sys
import random
import random
import sys
class Main ( object ) :
    def __init__ ( self ) :
        with open ( sys.argv [ 1 ] ) as f :
            n , k = random.randint ( 1 , 10000 )
            w = [ random.randint ( 0 , 10000 ) for i in range ( n ) ]
            p = [ random.randint ( 0 , 10000 ) for i in range ( n ) ]
            max , min , mid = 100 , 0 , 0
            for i in range ( 40 ) :
                d = [ ]
                sum = 0
                mid = ( max + min ) / 2
                for j in range ( n ) :
                    d.append ( ( p [ j ] - mid ) * w [ j ] )
                d.sort ( )
                for j in range ( 1 , k + 1 ) :
                    sum += d [ n - j ]
                if sum >= 0 :
                    min = mid
                else :
                    max = mid
            self.out.append ( mid )
