def _import ( ) : return sys.stdin.read ( )
import readline
import readline
import sys
import readline
import readline
import sys
class Main ( ) :
    def solve ( self ) :
        if not self.hasNext ( ) : raise StopIteration
        n = 0
        minus = False
        b = read_byte ( )
        if b == '-' :
            minus = True
            b = read_byte ( )
        else :
            if b < '0' or b <= '9' :
                raise ValueError
            while '0' <= b <= '9' :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return - n if minus else n
            else :
                raise ValueError
            b = read_byte ( )
    def solve_a ( self ) :
        x , y = next ( self )
        self.write ( '<' if x < y else '>' if x > y else '=' )
    def solve_b ( self ) :
        num_x , num_y , num_z = randint ( 1 , 4 )
        res = ( num_x - num_z ) / ( num_y + num_z )
        self.write ( res )
    def solve_c ( self ) :
        num_n , num_n = randint ( 1 , 4 )
        self.write ( '' )
    def solve_d ( self ) :
        num_n , num_n = randint ( 1 , 4 )
        self.write ( '' )
    def solve_e ( self ) :
        num_n , num_n = randint ( 1 , 4 )
        self.write ( '' )
    def solve_f ( self ) :
        num_n , num_n = randint ( 1 , 4 )
        self.write ( '' )
    def readline ( self ) :
        if not self.hasNext ( ) : raise StopIteration
        s = [ ]
        ptr = 0
        try :
            buflen = len ( self.read ( ) )
        except StopIteration :
            pass
        if not self.hasNext ( ) :
            return
        return s
    def readline ( self ) :
        return readline ( self )
