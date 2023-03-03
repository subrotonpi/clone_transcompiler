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
            if self.stdin is not None :
                f.close ( )
            if self.stdout is not None :
                f.flush ( )
                self.stdout.close ( )
    def solve_a ( self ) :
        wk = next ( )
        num_i = randint ( 1 , 10000 )
        f.write ( wk [ num_i - 1 : num_i ] )
    def solve_b ( self ) :
        num_n = randint ( 1 , 10000 )
        f.write ( '' )
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
    readline.parse_and_read ( )
    readline.parse_and_read ( )
    ptr = 0
    buflen = 0
    def has_next_byte ( ) :
        if ptr < buflen :
            return True
        else :
            ptr = 0
            try :
                buflen = readline.parse_and_read ( )
            except EOFError :
                pass
            if buflen <= 0 :
                return False
        return True
    def read_and_read ( ) :
        if ptr < buflen :
            return True
        else :
            return False
    def is_printable_char ( c ) :
        return 33 <= c <= 126
    def skip_unprintable ( ) :
        while has_next_byte ( ) and not is_printable_char ( c ) :
            ptr += 1
    return False
