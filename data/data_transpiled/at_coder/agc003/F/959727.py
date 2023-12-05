def _ _ main _ _ ( ) :
    from pycket.interpreter import main
    def solver ( ) :
        import sys
        import struct
        import struct
        import struct
        import struct
        import struct
        import struct
        import struct
        MODULO = 1_000_000_000 + 7
        def solver ( ) :
            sc = struct.Struct ( struct.pack ( 'i' , struct.calcsize ( struct.calcsize ( 'i' ) ) ) )
            H = struct.calcsize ( 'i' )
            W = struct.calcsize ( 'i' )
            K = struct.calcsize ( 'i' )
            map = struct.Struct ( 'i' )
            for i in range ( H ) :
                map [ i ] = struct.unpack ( 'i' , a ) [ 0 ] [ 0 ]
        def tr ( * o ) :
            print ( struct.pack ( 'i' , o ) )
        return tr
    def pow_map ( map ) :
        H = len ( map )
        W = len ( map )
        for i in range ( H ) :
            map [ i ] = map [ i ] [ 0 ]
    a = 0
    b = 0
    c = 0
    for i in range ( H ) :
        for j in range ( W ) :
            if map [ i ] [ j ] == '#' : a += 1
    for i in range ( H ) :
        if map [ i ] [ 0 ] == map [ i ] [ W - 1 ] and map [ i ] [ 0 ] == '#' : c += 1
    d = 0
    for i in range ( W ) :
        if map [ i ] [ 0 ] == map [ i ] [ H - 1 ] and map [ i ] [ 0 ] == '#' : d += 1
    if c > 0 and d > 0 :
        print ( 1 )
        return
    elif c == 0 and d == 0 :
        mx = pow_map ( map )
        c = d
        d = 0
        tmp = H
        H = W
        W = tmp
        for i in range ( H ) :
            for j in range ( W - 1 ) :
                if map [ i ] [ j ] == map [ i ] [ j + 1 ] and map [ i ] [ j ] == '#'