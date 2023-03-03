def _import ( ) : return sys.stdin.read ( )
import readline
import readline
import readline
import readline
import sys
class Main ( ) :
    def solve ( self ) :
        try :
            self.solve ( )
        except EOFError :
            raise EOFError
    def solve ( self ) :
        try :
            self.solve ( )
        finally :
            if self.solve ( ) or self.solve ( ) :
                self.solve ( )
    def solve_a ( self ) :
        num_n = next ( )
        self.solve ( )
        self.solve ( )
    def solve_b ( self ) :
        num_n = randint ( 1 , 4 )
        self.solve ( )
        self.solve ( )
    def solve_c ( self ) :
        num_n = randint ( 1 , 4 )
        self.solve ( )
    def solve_d ( self ) :
        num_n = randint ( 1 , 4 )
        self.solve ( )
    def solve_e ( self ) :
        num_n = randint ( 1 , 4 )
        self.solve ( )
    def solve_f ( self ) :
        num_n = randint ( 1 , 4 )
        self.solve ( )
    import readline
    readline.write_eof ( )
    readline.write_eof ( )
    readline.write_eof ( )
    ptr = 0
    buflen = 0
    def has_next_byte ( ) :
        if ptr < buflen :
            return True
        else :
            ptr = 0
            try :
                buflen = readline.read_eof ( )
            except EOFError :
                pass
            if buflen <= 0 :
                return False
        return True
    def read_byte ( ) :
        if ptr < len ( self.solve ( ) ) :
            raise EOFError
        s = [ ]
        b = read_byte ( )
        while is_printable_char ( b ) :
            s.append ( b )
            b = read_byte ( )
        return s
    def read_byte ( ) :
        if ptr < len ( self.solve ( ) ) :
            raise EOFError
        s.append ( read_byte ( ) )
        return s
    def read_byte ( ) :
        return read_byte ( )
