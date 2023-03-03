def _import ( ) :
    from sys import stdin as stream
    from struct import Struct
    class Main ( object ) :
        def __init__ ( self , * args ) :
            super ( Main , self ).__init__ ( * args )
            self.K = [ ]
        def read ( self ) :
            sc = stream.read ( self.K )
            H , W = sc.unpack ( '>H' )
            print ( H * ( W - 1 ) + ( H - 1 ) * W )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
            self._buffer = [ ]
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
            def read ( self ) :
                if self.ptr < self.buflen :
                    return self._buffer [ self.ptr ]
                else :
                    return - 1
            def is_printable_char ( self ) :
                return 33 <= self.ptr <= 126
            def skip_unprintable ( self ) :
                while self.ptr < self.buflen and not is_printable_char ( self.ptr ) :
                    self.ptr += 1
            def __iter__ ( self ) :
                return self.ptr
        def readline ( self ) :
            if not self.hasNext :
                raise StopIteration
            s = [ ]
            b = self.read_byte ( )
            while self.is_printable_char ( b ) :
                s.append ( b )
                b = self.read_byte ( )
            return s
        def readline ( self ) :
            if not self.hasNext :
                raise StopIteration
            n = 0
            minus = False
            b = self.read_byte ( )
            if b == '-' :
                minus = True
                b = self.read_byte ( )
            if b < '0' or b < '9' :
                raise ValueError
            while self.hasNext :
                if self.hasNext :
                    n *=