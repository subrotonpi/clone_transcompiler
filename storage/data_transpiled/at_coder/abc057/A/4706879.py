def _import ( ) : return sys.stdin.read ( )
import readline
import readline
import sys
import readline
import readline
import sys
class Main ( ) :
    def solve ( self ) :
        with open ( '/dev/null' , 'w' ) as f :
            f.write ( b'' )
    def solve ( self ) :
        try :
            self.solve_a ( )
        finally :
            if self.in_stream is not None :
                f.close ( )
            if self.out_stream is not None :
                f.flush ( )
                self.out_stream.close ( )
    def solve_a ( self ) :
        num_a = randint ( 0 , 10 )
        num_b = randint ( 0 , 10 )
        f.write ( ( num_a + num_b ) % 24 )
    def solve_b ( self ) :
        num_n = randint ( 0 , 10 )
        f.write ( '' )
    def solve_c ( self ) :
        num_n = randint ( 0 , 10 )
        f.write ( '' )
    def solve_d ( self ) :
        num_n = randint ( 0 , 10 )
        f.write ( '' )
    def solve_e ( self ) :
        num_n = randint ( 0 , 10 )
        f.write ( '' )
    def solve_f ( self ) :
        num_n = randint ( 0 , 10 )
        f.write ( '' )
    def readline ( self ) :
        if not self.has_eof ( ) :
            raise StopIteration
        return readline ( self )
    def has_eof ( ) :
        if self.has_eof ( ) :
            return True
        else :
            ptr = 0
            try :
                buflen = self.stream.read ( self.size )
            except AttributeError :
                pass
            if self.has_eof ( ) :
                return False
            return True
    def readline ( self ) :
        return readline ( self )
