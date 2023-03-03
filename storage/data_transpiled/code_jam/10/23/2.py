def round1 ( ) :
    import os
    import sys
    import os
    import sys
    import math
    import os
    import math
    import os
    import os
    import sys
    import time
    import time
    import random
    import time
    import time
    import sys
    import os
    import sys
    import os
    import sys
    import time
    import time
    MOD = 100003
    def solve ( f ) :
        for ints in m :
            [ int ( i ) for i in ints ]
        with open ( os.path.join ( sys.__path__ [ 0 ] , 'in.py' ) , 'w' ) as f :
            f.write ( 'Case #%d: %s\n' % ( i + 1 , C ( ).solve ( f ) ) )
    def solve ( f ) :
        n = time.time ( )
        s = 0
        for i in range ( 1 , n ) :
            s += get ( n , i )
            s %= MOD
        return s
    def get ( n , k ) :
        if m [ n ] [ k ] >= 0 :
            return m [ n ] [ k ]
        if k == 1 :
            m [ n ] [ k ] = 1
        else :
            s = 0
            for i in range ( 1 , k ) :
                s += ( 1 * get ( k , i ) * c [ n - k - 1 ] [ k - i - 1 ] ) % MOD
                s %= MOD
            m [ n ] [ k ] = s
        return m [ n ] [ k ]
    return solve
