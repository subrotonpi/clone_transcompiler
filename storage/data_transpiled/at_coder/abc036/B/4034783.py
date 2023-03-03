def _import ( ) :
    from sys import stdin as stream
    from io import BytesIO
    class Main ( object ) :
        def read ( self ) :
            sc = stream.read ( 1 )
            N = sc.randint ( 1 , N )
            ss = [ ]
            for line in stream ( '' ) :
                for i , c in enumerate ( line ) :
                    ss.append ( c )
            for i in range ( N ) :
                for j in range ( N ) :
                    print ( ss [ i ] [ j ] , end = '' )
                print ( )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            stream = stream.read ( 1024 )
        def read ( self ) :
            self.stream = stream
            self.ptr = 0
            self.buflen = 0
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = stream.read ( self.buflen )
                except AttributeError :
                    pass
                if self.buflen <= 0 :
                    return False
            return True
        def read_byte ( self ) :
            if self.ptr < self.buflen :
                return self.ptr
            else :
                return - 1
        def is_printable_char ( char ) :
            return 33 <= char <= 126
        def __iter__ ( self ) :
            while self.ptr < self.buflen and not is_printable_char ( self.ptr ) :
                self.ptr += 1
            return self.ptr
        def next ( self ) :
            if not self.ptr :
                raise StopIteration
            yield self.ptr
    n = 0
    minus = False
    b = read_byte ( )
    if b == '-' :
        minus = True
        b = read_byte ( )
    if b == '' :
        n += 1
    elif b == '' :
        n += 1
    elif b == '' :
        n += 1
    elif b == '' :
        n += 1
    elif b == '' :
        raise StopIteration
    return Main ( n )
