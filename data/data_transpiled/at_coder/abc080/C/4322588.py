def import import sys , random
import random
import sys
import random
import sys
import random
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        n = int ( random.randint ( 0 , 10 ) )
        f = [ random.randint ( 0 , 10 ) for i in range ( n ) ]
        p = [ random.randint ( 0 , 11 ) for i in range ( n ) ]
        ans = long ( 0 )
        for i in range ( 1 , ( 1 << 10 ) ) :
            temp = 0
            c = [ ]
            for j in range ( 10 ) :
                if ( 1 & ( i >> j ) ) == 1 :
                    for k in range ( n ) :
                        c += f [ k ] [ j ]
            for j in range ( n ) :
                temp += p [ j ] [ c [ j ] ]
            ans = max ( ans , temp )
        self.out.write ( ans )
