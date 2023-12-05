def _import ( ) : return _import ( )
import sys
import os
import sys
import struct
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
    def solve ( self ) :
        try :
            self.solve_a ( )
        finally :
            if self.in_buffer is not None :
                self.in_buffer.close ( )
            if self.out is not None :
                self.out.flush ( )
                self.out.close ( )
    def solve_a ( self ) :
        num_n = randint ( 1 , 10 )
        num_k = randint ( 1 , 10 )
        num_x = randint ( 1 , 10 )
        num_y = randint ( 1 , 10 )
        res = 0
        for i in range ( 1 , min ( num_n , num_k ) + 1 ) :
            res += num_x
        for i in range ( num_k + 1 , num_n + 1 ) :
            res += num_y
        self.out.write ( res )
    def solve_b ( self ) :
        num_n = randint ( 1 , 10 )
        self.out.write ( '' )
    def solve_c ( self ) :
        num_n = randint ( 1 , 10 )
        self.out.write ( '' )
    def solve_d ( self ) :
        num_n = randint ( 1 , 10 )
        self.out.write ( '' )
    def solve_e ( self ) :
        num_n = randint ( 1 , 10 )
        self.out.write ( '' )
    def solve_f ( self ) :
        num_n = randint ( 1 , 10 )
        self.out.write ( '' )
    def f ( self ) :
        num_n = randint ( 1 , 10 )
        self.out.write ( '' )
    def skip_unprintable ( self ) :
        return self.has_eof ( )
    def read_byte ( self ) :
        if self.has_eof ( ) :
            return self.out.read ( )
        else :
            return - 1
    def read_byte ( self ) :
        return read_byte ( self )
