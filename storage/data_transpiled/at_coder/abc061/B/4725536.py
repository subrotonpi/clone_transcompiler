def _import ( ) : return sys.stdin.read ( )
def main ( ) :
    def solve ( ) :
        while is_printable_char ( b ) :
            yield ord ( b )
        return
    def solve ( ) :
        try :
            yield solve ( )
        finally :
            if sys.stdin.read ( 1 ) == '-' :
                minus = True
                b = read_byte ( )
            if b < '0' or b < '9' :
                raise ValueError ( )
            while True :
                if '0' <= b <= '9' :
                    n *= 10
                    n += b - '0'
                elif b == - 1 or not is_printable_char ( b ) :
                    return - n
                else :
                    raise ValueError ( )
            b = read_byte ( )
    def solve_a ( ) :
        num_a = randint ( 0 , 10 )
        num_b = randint ( 0 , 10 )
        num_c = randint ( 0 , 10 )
        print ( 'Yes' if num_c >= num_a and num_c <= num_b else 'No' )
    def solve_b ( ) :
        num_n = randint ( 0 , 10 )
        num_m = randint ( 0 , 10 )
        wk = [ ]
        for i in range ( num_m ) :
            a , b = randint ( 0 , 10 )
            wk.append ( a )
            wk.append ( b )
        [ i for i in wk ]
    def solve_c ( ) :
        num_n = randint ( 0 , 10 )
        print ( '' )
    def solve_d ( ) :
        num_n = randint ( 0 , 10 )
        num_n = randint ( 0 , 10 )
        wk = [ ]
        for i in range ( num_n ) :
            a , b = randint ( 0 , 10 )
            wk.append ( a )
            wk.append ( b )
        [ i for i in range ( num_n ) ]
    def solve_c ( ) :
        num_n = randint ( 0 , 10 )
    def solve_e ( ) :
        num_n = randint ( 0 , 10 )
    def solve_f ( ) :
        while has_next_byte ( ) and not is_printable_char ( ) :
            ptr += 1
        return ptr
        