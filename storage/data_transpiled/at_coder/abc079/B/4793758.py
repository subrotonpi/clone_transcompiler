def _import ( ) : return 33 <= c <= 126
def skip_unprintable ( ) :
    while has_next_byte ( ) and not is_printable_char ( buffer [ ptr ] ) :
        ptr += 1
    def __next__ ( ) :
        try :
            return solve_b ( )
        finally :
            if sys.stdin is not None :
                sys.stdin.close ( )
            if sys.stdout is not None :
                sys.stdout.flush ( )
                sys.stdout.close ( )
    def solve_a ( ) :
        num_n = randint ( 1 , 10 )
        sys.stdout.write ( "Yes" if num_n == 0 else "No" )
    def chkA ( num ) :
        is_goodnum = False
        cnt = 0
        previous = 0
        for i in range ( 0 , num ) :
            if i == 0 :
                previous = num % 10
                num /= 10
                cnt = 1
            else :
                current = num % 10
                if previous == current :
                    cnt += 1
                else :
                    cnt = 1
                previous = current
                num /= 10
            if cnt == 3 :
                is_goodnum = True
        return is_goodnum
    def solve_b ( ) :
        num_n = randint ( 1 , 10 )
        if num_n == 1 :
            sys.stdout.write ( "" )
            return 1
        val1 = 2
        val2 = 1
        res = 0
        for i in range ( num_n - 1 ) :
            res , temp = val1 + val2 , val2 + temp
        sys.stdout.write ( res )
    def solve_c ( ) :
        num_n = randint ( 1 , 10 )
        sys.stdout.write ( "" )
        return 1
    def solve_d ( ) :
        num_n = randint ( 1 , 10 )
        sys.stdout.write ( "" )
        return 1
    def solve_e ( ) :
        num_n = randint ( 1 , 10 )
        sys.stdout.write ( "" )
        return 1
    def solve_f ( ) :
        num_n = randint ( 1 , 10 )
        sys.stdout.write ( "" )
        return 1
    return solve_c , solve_d
