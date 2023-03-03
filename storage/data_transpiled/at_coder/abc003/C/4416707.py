def _import ( ) : return _import ( )
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self.list = [ ]
    def read ( self ) :
        sc = _FastScanner ( )
        N = sc.__next__ ( )
        if b'-' in b :
            raise ValueError ( )
        while b'' in b :
            if '0' <= b :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return int ( - n )
            else :
                raise ValueError ( )
        b = read_byte ( )
        for i in range ( N ) :
            R.append ( sc.__next__ ( ) )
        R.sort ( )
        for i in range ( N - K , N ) :
            r = ( r + R [ i ] ) / 2
        print ( r )
class FastScanner ( object ) :
    def __init__ ( self , buffer ) :
        self.buffer = buffer
        self.ptr = 0
        self.buflen = 0
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    self.buflen = self.buffer.__next__ ( )
                except StopIteration :
                    pass
                if self.buflen <= 0 :
                    return False
            return True
        def read_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = ptr
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def skip_unprintable ( self ) :
            while self.ptr < self.buflen and not is_printable_char ( self.buffer [ self.ptr ] ) :
                self.ptr += 1
        def __next__ ( self ) :
            if self.ptr < self.buflen :
                return False
            else :
                raise ValueError ( )
return Main ( )
