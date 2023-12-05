def _import ( ) :
    import os
    import sys
    import os
    import sys
    import struct
    import struct
    import struct
    import struct
    import struct
    import sys
    import struct
    import struct
    import struct
    import struct
    import sys
    MOD = 1000000007
    M , N = struct.calcsize ( 'I' )
    S = struct.unpack ( 'I' , struct.pack ( 'I' , M ) )
    def read ( ) :
        M = struct.unpack ( 'I' , struct.pack ( 'I' , M ) ) [ 0 ]
        N = struct.unpack ( 'I' , struct.pack ( 'I' , N ) ) [ 0 ]
        S = [ ]
        for i in range ( M ) :
            S.append ( struct.unpack ( 'I' , S [ i ] ) [ 0 ] )
        if len ( S ) == 0 :
            return S
        else :
            count = 1
    def solve ( ) :
        comb = struct.unpack ( 'I' , struct.pack ( 'I' , 1100 ) ) [ 0 ]
        for i in range ( 1 , len ( comb ) ) :
            comb [ i ] [ 0 ] = 1
            for j in range ( 1 , i + 1 ) :
                comb [ i ] [ j ] = ( comb [ i - 1 ] [ j - 1 ] + comb [ i - 1 ] [ j ] ) % MOD
        t = struct.unpack ( 'I' , S )
        for i in range ( M ) :
            t.add ( S [ i ] , 0 )
        res = t.rec ( )
        print ( '%d %d' % ( res [ 0 ] , res [ 1 ] ) )
    class T ( struct.Struct ) :
        has = False
        size = 0
        ts = struct.unpack ( 'I' , struct.pack ( 'I' , 26 ) )
        for i in range ( k2 ) :
            for h in range ( max ( 0 , j - k2 ) + 1 ) :
                ts [ i ] = struct.unpack ( 'I' , struct.pack ( 'I' , i ) ) [ 0 ] + ds [ i ] [ j ]
    return ( num , )
