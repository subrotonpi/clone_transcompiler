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
        num_a = randint ( 0 , 10 )
        num_b = randint ( 0 , 10 )
        num_h = randint ( 0 , 10 )
        self.out.write ( ( num_a + num_b ) * num_h / 2 )
    def solve_b ( self ) :
        num_n = randint ( 0 , 10 )
        self.out.write ( '' )
    def solve_c ( self ) :
        num_n = randint ( 0 , 10 )
        self.out.write ( '' )
    def solve_d ( self ) :
        num_n = randint ( 0 , 10 )
        self.out.write ( '' )
    def solve_e ( self ) :
        num_n = randint ( 0 , 10 )
        self.out.write ( '' )
    def solve_f ( self ) :
        num_n = randint ( 0 , 10 )
        self.out.write ( '' )
    def write ( self , data ) :
        self.out.write ( data )
    def read ( self , ptr = 0 ) :
        if ptr < self.buflen :
            return True
        else :
            ptr = 0
            try :
                self.buflen = len ( data )
            except TypeError :
                pass
            if self.buflen <= 0 :
                return False
        return True
    def write ( self , data ) :
        self.out.write ( data )
    def write ( self , data ) :
        self.out.write ( data )
