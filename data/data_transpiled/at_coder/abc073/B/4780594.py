def _import ( ) : return 33 <= c <= 126
def skip_unprintable ( ) :
    while has_next_byte ( ) and not is_printable_char ( buffer [ ptr ] ) :
        ptr += 1
    def __next__ ( ) :
        return int ( next ( ) )
    def solve ( ) :
        try :
            solve_b ( )
        finally :
            if f :
                f.close ( )
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
            raise StopIteration
        while True :
            if b == '-' :
                n *= 10
            elif b == - 1 or not is_printable_char ( b ) :
                return - n
            else :
                raise StopIteration
        b = read_byte ( )
        while b != '' :
            wk = num_n % 10
            if wk == 9 :
                print ( 'Yes' )
                return
            num_n /= 10
        print ( 'No' )
    def solve_b ( ) :
        num_n = randint ( 1 , num_n )
        wk = int_to_tuple ( [ ( t , i ) for i in range ( num_n ) ] )
        res = sum ( [ ( i [ 1 ] - i [ 0 ] ) + 1 for i in range ( num_n ) ] )
        print ( res )
    def solve_c ( ) :
        num_n = randint ( 1 , num_n )
        print ( '' )
        return True
    def solve_d ( ) :
        num_n = randint ( 1 , num_n )
        print ( '' )
        return True
    def solve_e ( ) :
        num_n = randint ( 1 , num_n )
        print ( '' )
        return False
    def solve_f ( ) :
        num_n = randint ( 1 , num_n )
        print ( '' )
        return True
