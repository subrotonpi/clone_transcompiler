def _import ( ) : return sys.stdin.read ( )
import struct
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( 1 )
        self.T = sys.stdin.read ( 1 )
        minCost = sys.maxint
        for i in range ( self.N ) :
            c = struct.unpack ( '>H' , self.T ) [ 0 ]
            t = struct.unpack ( '>H' , self.T ) [ 0 ]
            if t <= T :
                minCost = min ( minCost , c )
        if minCost == sys.maxint :
            print ( 'TLE' )
        else :
            print ( minCost )
    class FastScanner ( object ) :
        def __init__ ( self ) :
            self.buffer = sys.stdin.read ( 1 )
            self.ptr = 0
            self.buflen = 0
            def has_next_byte ( ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = 0
                    try :
                        buflen = self.buffer.tell ( )
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
                while self.ptr < self.buflen and not is_printable_char ( self.buffer [ self.ptr ] ) :
                    self.ptr += 1
            def __iter__ ( self ) :
                return self.ptr
            def next ( self ) :
                if not self.ptr :
                    raise StopIteration
                yield self.ptr
        def __iter__ ( self ) :
            return iter ( self.buffer )
