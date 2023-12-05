def _import ( ) : return True
import StringIO
import configparser
import configparser
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import sys
import sys
class Main ( object ) :
    def main ( self ) :
        def solve ( ) :
            self._import ( )
            return self._import ( )
        def __next__ ( self ) :
            return int ( self._next )
        def __next__ ( self ) :
            raise StopIteration
        def write ( self , buf ) :
            while self._next :
                self._next = read_byte ( )
            return write ( self._next )
        def __next__ ( self ) :
            if not self._next :
                raise StopIteration
            b = read_byte ( )
            while is_printable_char ( b ) :
                self._next = read_byte ( )
            return b
        def __next__ ( self ) :
            if not self._next :
                raise StopIteration
            n = 0
            if b == '-' :
                minus = True
                b = read_byte ( )
            if b < '0' or b <= '9' :
                n *= 10
                n += b - '0'
            elif b == '-' or not is_printable_char ( b ) :
                return - n
            else :
                raise StopIteration
            b = read_byte ( )
        def solve_a ( ) :
            num_r = randint ( 0 , num_r )
            num_g = randint ( 0 , num_r )
            num_b = randint ( 0 , num_r )
            num = ( num_r * 100 + num_g * 10 + num_b )
            print ( 'YES' if num % 4 == 0 else 'NO' )
        def solve_b ( ) :
            num_n = randint ( 0 , num_r )
            wk = configparser.ConfigParser ( )
            wk.merge ( read_byte ( ) , 1 , lambda old_v , new_v : old_v + new_v )
            min = [ min ( key , new_v ) for key , value in wk.items ( ) ]
            max = [ max ( key , new_v ) for key , value in wk.items ( ) ]
            print ( max ( min ( max ( key , value ) ) ) )