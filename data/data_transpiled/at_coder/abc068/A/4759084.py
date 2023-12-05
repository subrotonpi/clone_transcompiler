def _import ( ) : return sys.stdin.read ( )
import io
import sys
import struct
import sys
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
    def solve ( self ) :
        try :
            self.solve_a ( )
        finally :
            if self.in_stream is not None :
                self.in_stream.close ( )
            if self.out_stream is not None :
                self.out_stream.flush ( )
                self.out_stream.close ( )
    def solve_a ( self ) :
        num_n = randint ( 1 , 10000 )
        self.out_stream.write ( "ABC" + str ( num_n ) )
    def solve_b ( self ) :
        num_n = randint ( 1 , 10000 )
        self.out_stream.write ( "" )
    def solve_c ( self ) :
        num_n = randint ( 1 , 10000 )
        self.out_stream.write ( "" )
    def solve_d ( self ) :
        num_n = randint ( 1 , 10000 )
        self.out_stream.write ( "" )
    def solve_e ( self ) :
        num_n = randint ( 1 , 10000 )
        self.out_stream.write ( "" )
    def solve_f ( self ) :
        num_n = randint ( 1 , 10000 )
        self.out_stream.flush ( )
    def read_bytes ( self ) :
        if not self.has_next_byte ( ) :
            raise StopIteration ( )
        else :
            ptr = 0
            try :
                buflen = self.read_bytes ( self.out_stream )
            except StopIteration :
                pass
            if self.has_next_byte ( ) :
                return ptr
            else :
                return - 1
        return ptr
    def read_bytes ( self ) :
        if self.has_next_byte ( ) :
            return self.out_stream.read ( self.out_stream.tell ( ) )
        else :
            return ptr
    def read_bytes ( self ) :
        return bytes ( self.out_stream.read ( self.out_stream.tell ( ) ) )
