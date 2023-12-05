def _import ( ) :
    import time
    import math
    import os
    import os
    import sys
    import time
    import math
    import os
    import sys
    import os
    import sys
    import time
    import time
    import sys
    import struct
    import struct
    import math
    import time
    import time
    import sys
    debug = False
    elapsed = False
    _out = sys.stdout
    _err = sys.stderr
    def solve ( sc ) :
        N = struct.calcsize ( 'I' )
        a = struct.unpack ( 'I' , sc.read ( 1 ) ) [ 0 ]
        k = struct.unpack ( 'I' , struct.pack ( 'I' , N ) ) [ 0 ]
        b = struct.unpack ( 'I' , b )
        b = struct.unpack ( 'I' , b )
        aa = a
        cnt = [ ]
        while True :
            cnt += [ aa - 1 ]
            aa = b [ aa - 1 ]
            if cnt [ aa - 1 ] < 2 :
                cnt1 = 0
            elif cnt [ aa - 1 ] == 2 :
                cnt2 = 0
        k = k - ( cnt [ cnt1 ] ) % 2
        kk = k + cnt1
        aa = a
        while kk > 0 :
            aa = b [ aa - 1 ]
            del b [ aa - 1 ]
        _out.write ( aa )
    def C ( n , r ) :
        res = 1
        for i in range ( n , n - r , - 1 , - 1 ) :
            res = res * math.log ( i , 2 )
        for i in range ( r , 1 , - 1 ) :
            res = res / math.log ( i , 2 )
        return res
    def P ( n , r ) :
        res = 1
        for i in range ( n , n - r , - 1 , - 1 ) :
            res = res * math.log ( i , 2 )
        return res
    S = time.time ( )
    with open ( '/proc/%d/s' % ( time.time ( ) - S ) ) as sc :
        eval ( sc )
        _out.flush ( )
        G = time.time ( )
    print ( '%.02f' % ( time.time ( )