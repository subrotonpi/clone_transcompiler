def _import ( ) : return _import ( )
import sys
import os
import sys
import struct
import sys
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
    def solve ( self ) :
        try :
            self.solve_b ( )
        finally :
            if self.stdin is not None :
                self.stdin.close ( )
            if self.stdout is not None :
                self.stdout.flush ( )
                self.stdout.close ( )
    def solve_a ( self ) :
        num_n = next ( self )
        self.stdout.write ( 'Yes' if num_n == [ '-' ] else 'No' )
    def solve_b ( self ) :
        num_a = randint ( 1 , 10 )
        num_b = randint ( 1 , 10 )
        num_c = randint ( 1 , 10 )
        num_d = randint ( 1 , 10 )
        wkres = min ( num_b , num_d ) - max ( num_a , num_c )
        self.stdout.write ( wkres if wkres >= 0 else 0 )
    def solve_c ( self ) :
        num_n = randint ( 1 , 10 )
        self.stdout.write ( '' )
    def solve_d ( self ) :
        num_n = randint ( 1 , 10 )
        self.stdout.write ( '' )
    def solve_e ( self ) :
        num_n = randint ( 1 , 10 )
        self.stdout.write ( '' )
    def solve_f ( self ) :
        num_n = randint ( 1 , 10 )
        self.stdout.write ( '' )
    def f ( self ) :
        num_n = randint ( 1 , 10 )
        self.stdout.write ( '' )
    def has_next_byte ( self ) :
        if self.ptr < num_n :
            return True
        else :
            ptr = 0
            try :
                self.stdout.write ( self.read ( num_n ) )
            except EOFError :
                pass
            if self.ptr <= num_n :
                return False
        return True
    def read_byte ( self ) :
        return read_byte ( self )
