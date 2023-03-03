def _import ( ) :
    from sys import stdin as stream
    from io import BytesIO
    from io import BytesIO
    from io import BytesIO
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            self.stream = stream
        def read ( self ) :
            sc = stream.read
            self.stream.seek ( 0 )
            r = sc.read ( 1 )
            g = sc.read ( 1 )
            b = sc.read ( 1 )
            min = sys.maxint
            for gl in range ( - 300 , 300 ) :
                count = 0
                gr = gl + g - 1
                for i in range ( gl , gr + 1 ) :
                    count += abs ( i )
            if '0' <= b <= '9' :
                n *= 10
                n += - n if not is_printable_char ( b ) else n
            else :
                raise ValueError ( )
            b = read_byte ( )
    def read ( self ) :
        raise StopIteration ( )
    n = 0
    minus = False
    byte = read ( )
    if byte == '-' :
        minus = True
        byte = read ( )
    if byte < '0' or not is_printable_char ( byte ) :
        return - n if minus else n
    else :
        raise ValueError ( )
    b = read_byte ( )
    if not is_printable_char ( b ) :
        return - n if minus else n
    else :
        return min ( min , count )
