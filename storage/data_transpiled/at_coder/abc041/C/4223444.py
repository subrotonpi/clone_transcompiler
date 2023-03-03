def _import ( ) : return _import ( )
from itertools import repeat
class Main ( object ) :
    def __init__ ( self , f , args ) :
        super ( Main , self ).__init__ ( f , args )
        sc = _fast_import ( )
        N = sc.__next__ ( )
        d = defaultdict ( cmp )
        for i in range ( 1 , N + 1 ) :
            d [ sc.__next__ ( ) ].append ( i )
        for e in d :
            print ( d [ e ] )
class FastScanner ( object ) :
    def __init__ ( self , f , args ) :
        self.f = f
        self.buffer = f
        self.ptr = 0
        self.buflen = 0
        def has_next_byte ( ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = self.buffer.__next__ ( )
                except StopIteration :
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
            while self.ptr < self.buflen and not is_printable_char ( self.buffer [ self.ptr ] ) :
                self.ptr += 1
            return False
        def __next__ ( self ) :
            return self.ptr
        def read_byte ( self ) :
            if not self.ptr :
                raise StopIteration
            s = [ ]
            b = self.read_byte ( )
            while self.is_printable_char ( b ) :
                s.append ( b )
                b = self.read_byte ( )
            return s
    def __next__ ( self ) :
        if not self.ptr :
            raise StopIteration
        n = 0
        minus = False
        b = self.__next__ ( )
        if b == "-" :
            minus = True
            b = self.__next__ ( )
        if self.ptr < self.buflen :
            n *= 10
    