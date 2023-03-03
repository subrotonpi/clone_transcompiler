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
            if self.in_buffer is not None :
                self.in_buffer.close ( )
            if self.out_buffer is not None :
                self.out_buffer.flush ( )
                self.out_buffer.close ( )
    def solve_a ( self ) :
        num_x = randint ( 0 , 10 )
        num_t = randint ( 0 , 10 )
        self.out_buffer.write ( num_x - num_t if self.in_buffer else 0 )
    def solve_b ( self ) :
        num_n = randint ( 0 , 10 )
        self.out_buffer.write ( '' )
    def solve_c ( self ) :
        num_n = randint ( 0 , 10 )
        self.out_buffer.write ( '' )
    def solve_d ( self ) :
        num_n = randint ( 0 , 10 )
        self.out_buffer.write ( '' )
    def solve_e ( self ) :
        num_n = randint ( 0 , 10 )
        self.out_buffer.write ( '' )
    def solve_f ( self ) :
        num_n = randint ( 0 , 10 )
        self.out_buffer.flush ( )
    def read_bytes ( ) :
        ptr = 0
        while is_next_byte ( ptr ) :
            if ptr < len ( self.out_buffer ) :
                return True
            else :
                ptr = 0
                try :
                    buflen = self.out_buffer.read ( ptr )
                except AttributeError :
                    pass
                if buflen <= 0 :
                    return False
            return True
    def read_bytes ( ) :
        if not is_next_byte ( ptr ) :
            raise StopIteration
        s = [ ]
        b = read_bytes ( )
        while is_next_byte ( ptr ) :
            s.append ( b )
        return s
