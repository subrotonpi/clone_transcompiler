def _import ( ) : return 33 <= c <= 126
def skip_unprintable ( ) :
    while has_next_byte ( ) and not is_printable_char ( buffer [ ptr ] ) :
        ptr += 1
    def __next__ ( ) :
        return int ( next ( ) )
    def solve ( ) :
        while has_next_byte ( ) :
            yield b
        return next ( )
    def __next__ ( ) :
        if not __next__ ( ) :
            raise StopIteration
        s = [ ]
        while is_printable_char ( b ) :
            s.append ( b )
        return s
    def __next__ ( ) :
        if not __next__ ( ) :
            raise StopIteration
        n = 0
        minus = False
        b = read_byte ( )
        if b == '-' :
            minus = True
        if b < '0' or b <= '9' :
            n *= 10
        elif b == - 1 or not is_printable_char ( b ) :
            return - n if minus else n
        else :
            raise StopIteration
        b = read_byte ( )
        n5 = 0
        n7 = 0
        for i in range ( 3 ) :
            if randint ( 0 , 5 ) == 5 :
                n5 += 1
            else :
                n7 += 1
        yield ( n5 , n7 )
    def solve_b ( ) :
        num_n = randint ( 0 , num_n )
        num_l = randint ( 0 , num_l )
        wk = int_to_tuple ( ( num_n , ( t , i ) , ( t , u ) ) )
        wk = [ ( '' , '' ) for t in wk ]
        yield ( '' , '' )
        yield ( '' , '' )
        yield ( '' , '' )
        yield ( '' , '' )
        yield ( '' , '' )
    def solve_c ( ) :
        num_n = randint ( 0 , num_n )
        num_l = randint ( 0 , num_l )
        wk = int_to_tuple ( ( num_n , ( t , i ) , ( u , ) ) )
        yield ( '' , '' )
        yield ( '' , '' )
    def solve_d ( ) :
        num_n = 0