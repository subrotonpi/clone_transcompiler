def _import ( * os ) :
    import time
    import sys
    import time
    import sys
    import time
    import sys
    import sys
    import time
    import time
    import sys
    import sys
    import struct
    import struct
    import struct
    import struct
    import struct
    import time
    M = 10009
    def solve ( ) :
        ss = struct.unpack ( '+' , struct.pack ( '<H' , struct.calcsize ( 'H' ) ) )
        m = len ( ss )
        css = [ [ c.encode ( 'utf-8' ) for c in ss ] for s in ss ]
        k = struct.unpack ( '<H' , struct.pack ( '<H' , struct.calcsize ( 'H' ) ) ) [ 0 ]
        n = struct.unpack ( '<H' , struct.pack ( '<H' , struct.calcsize ( 'H' ) ) ) [ 0 ]
        is = [ [ ] for i in range ( n ) ]
        for i in range ( 1 , k + 1 ) :
            for c in struct.unpack ( '<H' , struct.pack ( '<H' , struct.pack ( '>H' , i ) ) ) :
                is [ i ] [ c - 'a' ] += 1
        for i in range ( 1 , k + 1 ) :
            if i > 1 :
                print ( " " , end = '' )
            print ( rec ( [ i ] , i ) , end = '' )
        print ( )
    css = [ ]
    for i in range ( n ) :
        js = [ ]
        for c in css :
            tmp = 1
            for c in cs :
                tmp = tmp * js [ c - 'a' ] % M
            res = ( res + tmp ) % M
    res = 0
    for j in range ( n ) :
        for k in range ( 26 ) :
            js [ k ] += is [ j ] [ k ]
        res = ( res + rec ( js , i - 1 ) ) % M
        for k in range ( 26 ) :
            js [ k ] -= is [ j ] [ k ]
    return res
