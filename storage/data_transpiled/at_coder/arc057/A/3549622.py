def _import ( ) : return _import ( )
from sys import stdin
from struct import calcsize , unpack , unpack , unpack , unpack
class Main ( ) :
    def __init__ ( self , f ) :
        self.f = f
        self.a = unpack ( '<q' , f.read ( 4 ) ) [ 0 ]
        self.k = unpack ( '<q' , f.read ( 4 ) ) [ 0 ]
        cnt = 0
        if self.k == 0 :
            print ( 2 * long ( unpack ( '<q' , f.read ( 4 ) ) [ 0 ] - a ) )
            return
        while True :
            if self.a >= 2 * pow ( 10 , 12 ) :
                break
            self.a = calc ( self.a , self.k )
            cnt += 1
        print ( cnt )
    def calc ( self , a , k ) :
        return self.a + 1 + k * a
class FastScanner ( object ) :
    def __init__ ( self , f ) :
        self.f = f
        self.data = ''
        self.ptr = 0
        self.buflen = 0
        def has_next_byte ( ) :
            if self.ptr < buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = unpack ( '<H' , self.data [ ptr : buflen ] ) [ 0 ]
                except IndexError :
                    pass
                if buflen <= 0 :
                    return False
            return True
        def read_byte ( ) :
            if self.ptr < buflen :
                return self.data [ ptr ]
            else :
                return - 1
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def __iter__ ( self ) :
            while self.ptr < buflen and not is_printable_char ( self.data [ ptr ] ) :
                self.ptr += 1
            return self.ptr
        def __next__ ( self ) :
            if not self.ptr :
                raise StopIteration
            yield self.ptr
return Main ( )
