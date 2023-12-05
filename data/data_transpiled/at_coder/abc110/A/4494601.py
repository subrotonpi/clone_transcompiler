def _import ( ) : return sys.stdin.read ( )
import struct
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = FastScanner ( )
    def read ( self ) :
        n = [ ]
        max_index = None
        for i in range ( 3 ) :
            n.append ( self.sc.randint ( ) )
            if n [ i ] > n [ max_index ] :
                max_index = i
        self.sum = 0
        for i in range ( 3 ) :
            if i == max_index :
                self.sum += 10 ** i
            else :
                self.sum += n [ i ]
        print ( self.sum )
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
                    if buflen <= 0 :
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
            def __iter__ ( self ) :
                return self.ptr
            def next ( self ) :
                if not self.hasNext ( ) :
                    raise StopIteration
                yield self.ptr
        def __iter__ ( self ) :
            return iter ( self.buffer )
return Main
