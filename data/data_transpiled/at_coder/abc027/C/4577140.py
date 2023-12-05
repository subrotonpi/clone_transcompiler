def _import ( ) : return _import ( )
from sys import stdin
from io import BytesIO
import readline
from io import BytesIO
import readline
class Main ( ) :
    def __init__ ( self ) :
        self.fastread = readline
        self.n = len ( self.fastread )
        cnt = 0
        for i in range ( n ) :
            self.n += 1
        if self.n % 2 == 0 :
            x = 1
            for i in range ( 0 ) :
                if i % 2 == 0 :
                    x *= 2
                else :
                    x = x * 2 + 1
                if x > n :
                    print ( "Takahashi" if self.n % 2 == 1 else "Aoki" )
                    return
        else :
            x = 1
            for i in range ( 0 ) :
                if i % 2 == 1 :
                    x *= 2
                else :
                    x = x * 2 + 1
                if x > n :
                    print ( "Takahashi" if self.n % 2 == 1 else "Aoki" )
                    return
    class FastScanner ( object ) :
        def __init__ ( self , stream = sys.stdin ) :
            self.stream = sys.stdin
            self.data = BytesIO ( stream )
            self.ptr = 0
            self.buflen = 0
            def has_next_byte ( self ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = 0
                    try :
                        self.buflen = len ( self.data )
                    except TypeError :
                        pass
                    if self.buflen <= 0 :
                        return False
                return True
            def read_byte ( self ) :
                if self.ptr < self.buflen :
                    return self.data [ self.ptr ]
                else :
                    return - 1
            def is_printable_char ( c ) :
                return 33 <= c <= 126
            def __iter__ ( self ) :
                if self.ptr < self.len :
                    return True
                return "".join ( [ chr ( c ) for c in self.data [ ptr : self.ptr + 1 ] ] )
    return Main
