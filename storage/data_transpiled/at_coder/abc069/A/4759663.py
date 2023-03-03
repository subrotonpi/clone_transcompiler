def _import ( ) : return sys.stdin.read ( )
import os
import sys
import struct
import sys
class Main ( object ) :
    def solve ( self ) :
        with open ( '-' , 'w' ) as f :
            f.write ( b'\n' )
        if b < '0' or '9' < b :
            raise ValueError ( )
        while True :
            if '0' <= b <= '9' :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return - n if n else n
            else :
                raise ValueError ( )
    def solve_a ( self ) :
        num_n = randint ( 1 , 10000 )
        num_m = randint ( 1 , 10000 )
        f.write ( ( num_n - 1 ) * ( num_m - 1 ) )
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
    def read_bytes ( ) :
        ptr = 0
        buflen = 0
        def has_next_byte ( ) :
            if ptr < buflen :
                return True
            else :
                ptr = 0
                try :
                    buflen = f.read ( ptr )
                except TypeError :
                    pass
                if buflen <= 0 :
                    return False
            return True
        def read_byte ( ) :
            if ptr :
                return ptr
            else :
                return ptr
    def is_printable_char ( c ) :
        return 33 <= c <= 126
    def skip_unprintable ( ) :
        while has_next_byte ( ) and not is_printable_char ( c ) :
            ptr += 1
    def next ( self ) :
        return next