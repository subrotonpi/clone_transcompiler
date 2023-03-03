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
                f.close ( )
    def solve_b ( self ) :
        res = next ( ) [ 0 ] + next ( ) [ 0 ] + next ( ) [ 0 ]
        f.write ( res )
    def solve_c ( self ) :
        num_n = randint ( 1 , 10000 )
        f.write ( '' )
    def solve_d ( self ) :
        num_n = randint ( 1 , 10000 )
        f.write ( '' )
    def solve_e ( self ) :
        num_n = randint ( 1 , 10000 )
        f.write ( '' )
    def solve_f ( self ) :
        num_n = randint ( 1 , 10000 )
        f.write ( '' )
    import readline
    readline.parse_and_read = read_and_read
    ptr = 0
    buflen = 0
    def has_next_byte ( ) :
        if ptr < buflen :
            return True
        else :
            ptr = 0
            try :
                buflen = readline.parse_and_read
            except AttributeError :
                pass
            if buflen <= 0 :
                return False
        return True
    def read_and_read ( ) :
        if not has_next_byte ( ) :
            raise StopIteration
        s = [ ]
        b = read_and_read ( )
        while is_print_char ( b ) :
            s.append ( b )
        return s
    def is_printable_char ( c ) :
        return 33 <= c <= 126
    def skip_unprintable ( ) :
        while has_next_byte ( ) and not is_printable_char ( s [ ptr ] ) :
            ptr += 1
    def read_and_read ( ) :
        return read_and_read