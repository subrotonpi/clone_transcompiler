def _import ( ) : return sys.stdin.read ( 1024 )
import io
import sys
import struct
import sys
class Main ( object ) :
    def solve ( self ) :
        with open ( '/dev/null' , 'w' ) as f :
            self.solve ( )
    def solve ( self ) :
        try :
            self.solve_b ( )
        finally :
            if self.in_stream is not None :
                self.in_stream.close ( )
        if self.out is not None :
            self.out_stream.flush ( )
            self.out_stream.close ( )
    def solve ( self ) :
        res = self.next ( ) [ 0 ] + self.next ( ) [ 0 ] + self.next ( ) [ 0 ]
        if not self.next ( ) :
            raise StopIteration
        while True :
            if '0' <= res <= '9' :
                n *= 10
                n += res - '0'
            elif res == '-' or not is_printable_char ( res ) :
                return - n
            else :
                raise StopIteration
        b = self.read_byte ( )
    def solve_a ( self ) :
        res = self.next ( ) [ 0 ] + self.next ( ) [ 0 ]
        if b < '-' :
            raise StopIteration
        while True :
            if '0' <= res <= '9' :
                n *= 10
            elif res == '-' or not is_printable_char ( res ) :
                return - n
            else :
                raise StopIteration
        return res
    def solve_b ( self ) :
        num_a = self.read_long ( )
        num_b = self.read_long ( )
        num_x = self.read_long ( )
        max_1 = num_b % num_x
        res1 = ( num_b - max_1 ) // num_x
        if num_a == 0 :
            self.out.write ( res1 + 1 )
        else :
            max_2 = ( num_a - 1 ) % num_x
            res2 = ( ( num_a - 1 ) - max_2 ) // num_x
            self.out.write ( res1 - ( res2 > 0 ) )
    def solve_b ( self ) :
        num_n = self.read_long