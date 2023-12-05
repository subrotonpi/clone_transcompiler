def _import ( ) : return sys.stdin.read ( )
import io
import math
import random
import sys
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self._skip_unprintable = True
    def __iter__ ( self ) :
        return self._skip_unprintable
    def __next__ ( self ) :
        try :
            self._solve_b2 ( )
        finally :
            if self._in_buffer :
                self._in_buffer.seek ( 0 )
        if self._out_buffer :
            self._out_buffer.seek ( 0 )
    def __next__ ( self ) :
        raise StopIteration
    n = False
    b = read_byte ( )
    if b == '-' :
        minus = True
        b = read_byte ( )
    if b < '0' or b <= '9' :
        raise ValueError ( )
    while True :
        if '0' <= b <= '9' :
            n *= 10
            n += b - '0'
        elif b == - 1 or not is_printable_char ( b ) :
            return - n
        else :
            raise ValueError ( )
    def solve_a ( self ) :
        num_n = randint ( 0 , 10 )
        CONST = decimal.Decimal ( pow ( 10 , 9 ) ) + decimal.Decimal ( '7' )
        res = 1
        for i in range ( 1 , num_n + 1 ) :
            res = res * decimal.Decimal ( str ( i ) )
        out.write ( res.remainder ( CONST ) )
    def solve_b ( self ) :
        num_n = randint ( 0 , 10 )
        CONST = long ( pow ( 10 , 9 ) + 7 )
        res = 1
        for i in range ( 1 , num_n + 1 ) :
            res = ( res * i ) % CONST
        out.write ( res )
    def solve_c ( self ) :
        num_n = randint ( 0 , 10 )
        out.write ( '' )
    def solve_d ( self ) :
        num_n = randint ( 0 , 10 )
        out.write ( '' )
    def solve_e ( self ) :
        num_n = randint ( 0 , 126 )
        out.write ( ''