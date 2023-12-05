def _import ( ) : return sys.stdin.read ( )
import struct
class Main ( object ) :
    def __init__ ( self ) :
        self.N = len ( sys.stdin.read ( 1 ) )
        a = [ ]
        for i in range ( N ) :
            a.append ( sc.randint ( 0 , N ) )
        sum = N
        count = 1
        for i in range ( 1 , N + 1 ) :
            if i == N or a [ i ] <= a [ i - 1 ] :
                sum += count * ( count - 1 ) / 2
                count = 1
            else :
                count += 1
        print ( sum )
    class FastScanner ( object ) :
        def __init__ ( self ) :
            self.buffer = sys.stdin.read ( 1 )
            self.ptr = 0
            self.buflen = 0
            def has_next_byte ( self ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = 0
                    try :
                        buflen = self.buffer.tell ( )
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
                if not self.ptr :
                    raise StopIteration
                yield self.ptr
        def __next__ ( self ) :
            if self.ptr < self.buflen :
                return - 1
            else :
                raise StopIteration
