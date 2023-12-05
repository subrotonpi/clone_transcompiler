def import _iter_bytes
import sys
import struct
class Main ( object ) :
    def solve ( self ) :
        n = randint ( 0 , 1 )
        min = self.max_int
        for h in range ( 1 , h ** 2 + 1 ) :
            min = min ( min , abs ( h - n // h ) + n % h )
        self.write ( min )
    def write ( self , out ) :
        self.write ( out )
        with open ( '/dev/null' , 'w' ) as f :
            return Main ( ).solve ( )
    def max_int ( self , * ar ) :
        self.write ( max ( * ar ) )
        return self.max_int
    def min_int ( self , * ar ) :
        self.write ( min ( * ar ) )
        return self.min_int
    def mod ( self ) :
        self.write ( mod )
        return self.write ( min ( * ar ) )
    def read ( self , length = 0 , p = 0 ) :
        if p < length :
            return True
        else :
            p = 0
            try :
                length = self.read ( p )
            except :
                pass
            if length == 0 :
                return False
        return True
    def read ( self , length = 0 , p = 0 ) :
        if not self.has_next_byte ( ) :
            return True
        else :
            p = 0
            try :
                length = self.read ( p )
            except :
                pass
            if not self.has_next_byte ( ) :
                return False
            return True
    def read ( self , length = 0 , p = 0 ) :
        if not self.has_next_byte ( ) :
            raise StopIteration
        return False
    def is_printable ( self , n ) :
        return 33 <= n <= 126
    def skip ( self ) :
        while self.has_next_byte ( ) and not self.is_printable ( n ) :
            p += 1
        return True
    def next ( self ) :
        if not self.has_next_byte ( ) :
            raise StopIteration
        yield self.read ( )
