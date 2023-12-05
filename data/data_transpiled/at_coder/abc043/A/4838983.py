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
        num_n = randint ( 1 , 10 )
        res = 0
        for i in range ( 1 , num_n + 1 ) :
            res += i
        print ( res )
    def solve_b ( self ) :
        num_n = randint ( 1 , 10 )
        print ( '' )
    def solve_c ( self ) :
        num_n = randint ( 1 , 10 )
        print ( '' )
    def solve_d ( self ) :
        num_n = randint ( 1 , 10 )
        print ( '' )
    def solve_e ( self ) :
        num_n = randint ( 1 , 10 )
        print ( '' )
    def solve_f ( self ) :
        num_n = randint ( 1 , 10 )
        print ( '' )
    def write ( self , data ) :
        self.write ( data )
    def read ( self , ptr = 0 ) :
        if ptr < len ( self.data ) :
            return True
        else :
            ptr = 0
            try :
                buflen = self.read ( ptr )
            except AttributeError :
                pass
            if buflen <= 0 :
                return False
        return True
    def read ( self , ptr = 0 ) :
        if not self.solve ( ) :
            raise StopIteration ( )
        data = [ ]
        while self.solve ( ) :
            data.append ( self.solve ( ) )
        return data
    def write ( self , ptr = ptr ) :
        if ptr < len ( self.data ) :
            return False
        return write ( self , ptr )
