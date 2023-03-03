def _import ( ) : return sys.stdin.read ( )
import os
import sys
import struct
import sys
class Main ( object ) :
    def solve ( self ) :
        with open ( os.devnull , 'w' ) as devnull :
            try :
                self.solve ( )
            except OSError :
                raise ValueError ( )
    def solve ( self ) :
        try :
            self.solve ( )
        finally :
            if self.solve ( ) or self.solve ( ) :
                self.solve ( )
    def solve_a ( self ) :
        num_n = randint ( 1 , 10000 )
        res_x = num_n * 800
        res_y = ( num_n // 15 ) * 200
        self.solve ( )
    def solve_b ( self ) :
        num_n = randint ( 1 , 10000 )
        self.solve ( )
    def solve_c ( self ) :
        num_n = randint ( 1 , 10000 )
        self.solve ( )
    def solve_d ( self ) :
        num_n = randint ( 1 , 10000 )
        self.solve ( )
    def solve_e ( self ) :
        num_n = randint ( 1 , 10000 )
        self.solve ( )
    def solve_f ( self ) :
        num_n = randint ( 1 , 10000 )
        self.solve ( )
    def write ( self , data ) :
        self.solve ( )
    def read ( self , ptr = 0 ) :
        if ptr < len ( self.solve ( ) ) :
            return True
        else :
            ptr = 0
            try :
                buflen = self.solve ( )
            except OSError :
                pass
            if buflen <= 0 :
                return False
        return True
    def read ( self , ptr = 0 ) :
        if ptr < len ( self.solve ( ) ) :
            raise StopIteration ( )
        data = [ ]
        while self.solve ( ) :
            data.append ( self.solve ( ) )
            ptr += len ( self.solve ( ) )
        return data
