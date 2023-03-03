def _import ( ) :
    import sys
    import struct
    import struct
    import os
    import sys
    import struct
    import struct
    import sys
    import StopIteration
    class Main ( object ) :
        def solve ( self ) :
            return True
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def is_printable_char ( c ) :
            while is_printable_char ( c ) and not is_printable_char ( c ) :
                ptr += 1
        def __next__ ( self ) :
            return int ( next ( self ) )
        def write ( self , data ) :
            if not is_printable_char ( data ) :
                raise StopIteration
            data = [ ]
            b = read_int ( data )
            while is_printable_char ( b ) :
                data.append ( b )
                b = read_int ( data )
            return data
        def __next__ ( self ) :
            if not is_printable_char ( data ) :
                raise StopIteration
            n = 0
            minus = False
            b = read_int ( data )
            if b == '-' :
                minus = True
                b = read_int ( data )
            if b < '0' or '9' < b :
                raise ValueError
            while True :
                if '0' <= b <= '9' :
                    n *= 10
                    n += b - '0'
                elif b == - 1 or not is_printable_char ( b ) :
                    return - n if n else n
                else :
                    raise ValueError
                b = read_int ( data ) * 0.006
                if abs ( num_a - wk [ 1 ] ) < sabun :
                    sabun = abs ( num_a - wk [ 1 ] )
                    index = i
            write ( self , index + 1 )
    class Longcompare ( struct.Struct ) :
        def __init__ ( self ) :
            self.wk = [ ]
        def __init__ ( self ) :
            self.wk = [ ]
        def __iter__ ( self ) :
            self.wk.append ( Longcompare ( self.wk ) )
            return iter ( self.wk )
    return Main ( )
