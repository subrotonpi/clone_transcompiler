def _import ( ) : return ord ( 'a' )
class Main ( object ) :
    def __init__ ( self , * args ) :
        super ( Main , self ).__init__ ( * args )
        self._fastread = _fastread
    def read ( self ) :
        sc = _fastread ( )
        l = [ sc.read ( ) , sc.read ( ) , sc.read ( ) ]
        l.sort ( )
        if self._fastread != l [ 0 ] :
            yield - n if not is_printable_char ( self._fastread ) else n
        else :
            yield n if not is_printable_char ( self._fastread ) else n
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
                    buflen = self.buffer.read ( self.buflen )
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
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def skip_unprintable ( self ) :
            while self.ptr < self.buflen and not is_printable_char ( self._fastread ( self.ptr ) ) :
                self.ptr += 1
        def __next__ ( self ) :
            return self.ptr
        def __next__ ( self ) :
            if not self.hasNext ( ) :
                raise StopIteration
            yield self.__next__
    def read ( self ) :
        if self._fastread != _fastread :
            raise StopIteration
        n = 0
        minus = False
        b = read_byte ( )
        if b == '-' :
            minus = True
            b = read_byte ( )
        if b < '0' or b <= '9' :
            raise ValueError
        while True :
            yield - n if not