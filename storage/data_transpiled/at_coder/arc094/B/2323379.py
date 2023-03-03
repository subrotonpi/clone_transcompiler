def _ import _ , os , sys , buf , has_next_byte = False ) :
    import struct
    import sys
    import struct
    import os
    import sys , sys
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            self.__readwrite = buf
        def read ( self ) :
            if not hasNext ( self ) :
                raise StopIteration
            n = False
            if self.__readwrite ( ) == '-' :
                minus = True
            if self.__readwrite ( ) == '0' or self.__readwrite ( ) == '0' :
                raise ValueError
            while True :
                if self.__readwrite ( ) == '0' :
                    n *= 10
                elif self.__readwrite ( ) == - 1 or not is_printable_char ( self.__readwrite ( ) ) :
                    return - n
                else :
                    raise ValueError
            self.__readwrite ( )
        def read ( self ) :
            return struct.unpack ( "<d" , self.__readwrite ( ) ) [ 0 ]
    def tr ( * objects ) :
        print ( "".join ( objects ) )
    def tr ( * objects ) :
        print ( * objects )
    A = [ ]
    B = [ ]
    for i in range ( Q ) :
        A.append ( i )
        B.append ( i )
        if A [ i ] > B [ i ] :
            A [ i ] ^= B [ i ]
            B [ i ] ^= A [ i ]
            A [ i ] ^= B [ i ]
        if A [ i ] == B [ i ] or A [ i ] + 1 == B [ i ] :
            print ( 2 * A [ i ] - 2 )
            continue
        prd = A [ i ] * B [ i ]
        ok , ng = 0 , max ( A [ i ] , B [ i ] )
        while ng - ok > 1 :
            m = ( ok + ng ) // 2
            if m * m < prd :
                ok = m
            else :
                ng = m
        x = ok
        if x * ( x + 1 ) >= prd :
            print ( 2 * x - 2 )
    return