def _import ( ) : return _import ( )
import sys
import os
import sys
import struct
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
    def __call__ ( self , * args ) :
        if not self.hasNext ( ) :
            raise StopIteration
        n = False
        b = self.read_byte ( )
        if b == '-' :
            minus = True
        else :
            if b < '0' :
                raise ValueError
            while True :
                if '0' <= b <= '9' :
                    n *= 10
                    n += b - '0'
                elif b == - 1 or not is_printable_char ( b ) :
                    return - n
                else :
                    raise ValueError
            b = self.read_byte ( )
    def solve_a ( self ) :
        wk = next ( self )
        num_i = randint ( 0 , num_a )
        self.write ( wk [ - 1 : ] )
    def solve_b ( self ) :
        num_a = randint ( 0 , num_a )
        num_b = randint ( 0 , num_b )
        num_c = randint ( 0 , num_b )
        CONST_MOD = int ( pow ( 10 , 9 ) + 7 )
        res = num_a * num_b % CONST_MOD * num_c % CONST_MOD
        self.write ( res )
    def solve_c ( self ) :
        num_n = randint ( 0 , num_a )
        self.write ( '' )
    def solve_d ( self ) :
        num_n = randint ( 0 , num_b )
        self.write ( '' )
    def solve_e ( self ) :
        num_n = randint ( 0 , num_b )
        self.write ( '' )
    def solve_f ( self ) :
        num_n = randint ( 0 , num_b )
        self.write ( '' )
    def skip_unprintable ( self ) :
        while self.hasNext ( ) :
            self.write ( '' )
        return True
    def read_byte ( self ) :
        if self.hasNext ( ) :
            return self.read ( )
        else :
            return - 1
    return Main ( )
