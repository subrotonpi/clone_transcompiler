def _import ( ) : return int ( next ( ) )
import sys
import os
import sys
import struct
import sys
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
    def __call__ ( self , * args ) :
        if not self.hasNext ( ) : raise StopIteration
        n = False
        if self.read ( 1 ) == '-' :
            minus = True
        if self.read ( 1 ) < '0' or self.read ( 1 ) == '0' :
            raise ValueError ( )
        while True :
            if self.read ( 1 ) <= '9' :
                n *= 10
            elif self.read ( 1 ) == - 1 or not is_printable_char ( self.read ( 1 ) ) :
                return - n if minus else n
            else :
                raise ValueError ( )
        self.read ( 1 )
    def solve_a ( self ) :
        num_r = randint ( 0 , 10 )
        num_g = randint ( 0 , 10 )
        self.write ( num_g * 2 - num_r )
    def solve_b ( self ) :
        ( num_n , num_k ) = randint ( 0 , 10 )
        res = intbv ( )
        if self.read ( 1 ) == num_n :
            if self.read ( 1 ) * 2 > self.read ( 1 ) + num_k :
                self.write ( num_k )
            else :
                self.write ( "" )
        return res
    def solve_c ( self ) :
        num_n , num_k = randint ( 0 , 10 )
        res = intbv ( )
        if self.read ( 1 ) == num_n :
            return res
        else :
            return res
    def solve_d ( self ) :
        num_n , num_k = randint ( 0 , 10 )
        res = intbv ( )
        if self.read ( 1 ) == num_n :
            return res
        else :
            return res
    def solve_f ( self ) :
        return int ( next ( ) )
    def read_bytes ( ) :
        return sys.stdin.read ( read_bytes ( ) )
