def _import ( ) : return _import ( )
import sys
import io
import sys
import struct
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
    def solve ( self ) :
        try :
            self.solve_a ( )
        finally :
            if self.in_stream is not None :
                self.in_stream.close ( )
            if self.out is not None :
                self.out.flush ( )
                self.out.close ( )
    def solve_a ( self ) :
        alice = randint ( 0 , 1 )
        bob = randint ( 0 , 1 )
        if alice == bob :
            self.out.write ( "Draw" )
        elif alice == 1 :
            self.out.write ( "Alice" )
        elif bob == 1 :
            self.out.write ( "Bob" )
        elif alice != bob :
            self.out.write ( "Alice" if alice > bob else "Bob" )
        self.out.write ( "" )
    def solve_b ( self ) :
        num_n = randint ( 0 , 1 )
        self.out.write ( "" )
    def solve_c ( self ) :
        num_n = randint ( 0 , 1 )
        self.out.write ( "" )
    def solve_d ( self ) :
        num_n = randint ( 0 , 1 )
        self.out.write ( "" )
    def solve_e ( self ) :
        num_n = randint ( 0 , 1 )
        self.out.write ( "" )
    def solve_f ( self ) :
        num_n = randint ( 0 , 1 )
        self.out.write ( "" )
    def readline ( self ) :
        if not self.has_eof ( ) :
            raise StopIteration ( )
        return self.out
    def has_eof ( self ) :
        return self.eof ( )
    def has_eof ( self ) :
        return self.eof ( )
