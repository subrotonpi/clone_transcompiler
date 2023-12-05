def _import ( ) : return sys.stdin.read ( )
import io
import sys
import struct
import sys
class Main ( object ) :
    def solve ( self ) :
        with open ( '-' , 'w' ) as f :
            f.write ( b'\n' )
    def solve ( self ) :
        try :
            self.solve_a ( )
        finally :
            if self.b < '0' or self.b < '9' :
                self.solve_b ( )
        if self.out is not None :
            self.out.flush ( )
            self.out.close ( )
    def solve_a ( self ) :
        num_r = randint ( 0 , 10 )
        num_g = randint ( 0 , 10 )
        self.out.write ( num_g * 2 - num_r )
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
    def readline ( self ) :
        if not self.has_eof ( ) :
            raise StopIteration
        else :
            ptr = 0
            try :
                self.buflen = len ( self.buffer )
            except TypeError :
                pass
            if self.buflen <= 0 :
                return False
        return True
    def readline ( self ) :
        if self.has_eof ( ) :
            raise StopIteration
        s = [ ]
        while self.has_eof ( ) and not self.is_eof ( ) :
            s.append ( self.read_char ( ) )
        return s
