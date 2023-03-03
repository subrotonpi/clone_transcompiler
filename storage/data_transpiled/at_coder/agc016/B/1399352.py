def _import ( ) :
    import time
    import sys
    import math
    import os
    import os
    import sys
    import time
    import time
    import sys
    import os
    import sys
    import time
    import time
    import sys
    import struct
    import math
    import time
    import time
    import time
    import sys
    debug = False
    elapsed = False
    _out = sys.stdout
    _err = sys.stderr
    def solve ( sc ) :
        N = sc.recv_handle ( )
        a = [ ]
        max = int ( a [ 0 ] )
        min = int ( a [ 1 ] )
        for i in range ( N ) :
            a.append ( sc.recv_handle ( ) )
            if a [ i ] > max :
                max = a [ i ]
            if a [ i ] < min :
                min = a [ i ]
        if max - min > 1 :
            _out.write ( 'No\n' )
        elif max - min == 0 :
            if max == N - 1 or 2 * max <= N :
                _out.write ( 'Yes\n' )
            else :
                _out.write ( 'No\n' )
        else :
            x = y = 0
            for i in range ( N ) :
                if a [ i ] == min :
                    x += 1
                elif a [ i ] == max :
                    y += 1
            if x < max and 2 * ( max - x ) <= y :
                _out.write ( 'Yes\n' )
            else :
                _out.write ( 'No\n' )
    def C ( n , r ) :
        res = 1
        for i in range ( n , n - r , - 1 , - 1 ) :
            res = res * math.log ( i , 2 )
        for i in range ( r , 1 , - 1 , - 1 ) :
            res = res // math.log ( i , 2 )
        return res
    def P ( n , r ) :
        res = 1
        for i in range ( n , n - r , - 1 , - 1 ) :
            res = res * math.log ( i , 2 )
        return res
    return C , P
