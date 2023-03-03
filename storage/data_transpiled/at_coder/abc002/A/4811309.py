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
        num_a = randint ( 0 , 10 )
        num_b = randint ( 0 , 10 )
        self.out_stream.write ( num_a > num_b )
    def solve_b ( self ) :
        num_n = randint ( 0 , 10 )
        self.out_stream.write ( "" )
    def solve_c ( self ) :
        num_n = randint ( 0 , 10 )
        self.out_stream.write ( "" )
    def solve_d ( self ) :
        num_n = randint ( 0 , 10 )
        self.out_stream.write ( "" )
    def solve_e ( self ) :
        num_n = randint ( 0 , 10 )
        self.out_stream.write ( "" )
    def solve_f ( self ) :
        num_n = randint ( 0 , 10 )
        self.out_stream.write ( "" )
    def read_bytes ( self ) :
        if not self.has_next_bytes :
            return "".join ( [ chr ( i ) for i in self.read_bytes ( ) ] )
        else :
            return "".join ( [ chr ( i ) for i in self.read_bytes ( ) ] )
    def read_bytes ( self ) :
        if self.has_next_bytes :
            return "".join ( [ chr ( i ) for i in self.read_bytes ( ) ] )
        else :
            return "".join ( [ chr ( i ) for i in self.read_bytes ( ) ] )
    def read_bytes ( self ) :
        return "".join ( [ chr ( i ) for i in self.read_bytes ( ) ] )
