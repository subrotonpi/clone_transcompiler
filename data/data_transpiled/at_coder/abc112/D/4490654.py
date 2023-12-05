def _import ( ) : return _fasta_read ( )
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.recv_bytes ( )
        M = sc.recv_bytes ( )
        max = M // N
        gcd = 0
        for i in range ( max , 1 , - 1 ) :
            if M % i == 0 :
                gcd = i
                break
        print ( gcd )
    def gcd ( a , b ) :
        if not b :
            return a
        return gcd ( b , a % b )
    class FastScanner ( object ) :
        def __init__ ( self ) :
            self.buffer = sys.stdin
            self.ptr = 0
            self.buflen = 0
            def has_next_byte ( ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = 0
                    try :
                        buflen = self.buffer.read ( self.ptr )
                    except AttributeError :
                        pass
                    if buflen <= 0 :
                        return False
                return True
            def read_byte ( ) :
                if self.ptr < self.buflen :
                    return self.buffer [ self.ptr ]
                else :
                    return - 1
            def is_printable_char ( c ) :
                return 33 <= c <= 126
            def skip_unprintable ( ) :
                while self.ptr < self.buflen and not is_printable_char ( self.buffer [ self.ptr ] ) :
                    self.ptr += 1
            def __iter__ ( self ) :
                return self.ptr
            def next ( self ) :
                if not self.ptr :
                    raise StopIteration
                yield self.ptr
        def read ( self ) :
            return next ( self.buffer )
    return FastScanner ( )
