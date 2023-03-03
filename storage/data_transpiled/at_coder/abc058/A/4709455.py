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
        n = False
        b = read_byte ( )
        if b == '-' :
            minus = True
            b = read_byte ( )
        else :
            if b < '0' or b <= '9' :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return - n if minus else n
            else :
                raise ValueError ( )
    def solve_a ( self ) :
        num_a = randint ( 1 , 10000 )
        num_b = randint ( 1 , 10000 )
        num_c = randint ( 1 , 10000 )
        if num_b - num_a == num_c - num_b :
            self.write ( "YES" )
        else :
            self.write ( "NO" )
        self.write ( "" )
    def solve_b ( self ) :
        num_n = randint ( 1 , 10000 )
        self.write ( "" )
    def solve_c ( self ) :
        num_n = randint ( 1 , 10000 )
        self.write ( "" )
    def solve_d ( self ) :
        num_n = randint ( 1 , 10000 )
        self.write ( "" )
    def solve_e ( self ) :
        num_n = randint ( 1 , 10000 )
        self.write ( "" )
    def solve_f ( self ) :
        num_n = randint ( 1 , 10000 )
        self.write ( "" )
    def readline ( self ) :
        if not self.hasNext ( ) : raise StopIteration
        s = [ ]
        while self.hasNext ( ) :
            s.append ( self.next ( ) )
        return s
    def readline ( self ) :
        if self.hasNext ( ) : return
        s.append ( self.next ( ) )
        return s
