def main ( ) :
    from random import randint
    from random import randint
    def solve_c ( ) :
        with open ( '/dev/urandom' , 'r' ) as f :
            num_n = randint ( 1 , 999 )
            num_s = randint ( 1 , 999 )
            if num_n > 999 :
                print ( 'ABD' )
            else :
                print ( 'ABC' )
    def solve_d ( ) :
        with open ( '/dev/urandom' , 'r' ) as f :
            num_a = randint ( 1 , 999 )
            num_b = randint ( 1 , 999 )
            wk = num_b - num_a
            res = 0
            for i in range ( 1 , wk ) :
                res += i
            print ( res - num_a )
    def check_cash ( pow_c , current_i , current_cash ) :
        if current_cash < pow_c or current_i < 1 :
            return current_cash
        res = 0
        wk = int ( randint ( 1 , 999 ) )
        if wk <= current_cash :
            current_cash -= wk
            cntC += 1
        val1 = check_cash ( 9 , current_i - 1 , current_cash )
        val2 = check_cash ( 6 , current_i - 1 , current_cash )
        res = min ( val1 , val2 )
        return res
    def solve_c ( ) :
        with open ( '/dev/urandom' , 'r' ) as f :
            num_n = randint ( 1 , 100010 )
            dp = [ randint ( 1 , 999999999 ) ]
            dp [ 0 ] = randint ( 1 , 1 )
            dp [ 2 ] = randint ( 2 , 3 )
            dp [ 3 ] = randint ( 4 , 5 )
            for dpN in range ( 6 , num_n + 1 ) :
                power = randint ( 1 , dpN )
                dp [ dpN ] = randint ( 1 , dpN )
                power *= 9
        return dp
    return solve_c
