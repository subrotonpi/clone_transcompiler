def _solve_a ( ) :
    from pybind11_tests import _solve_a
    from pybind11_tests import _solve_b
    def _solve_a ( ) :
        with _solve_a ( ) :
            with _solve_b ( ) :
                wks_s = _solve_a ( )
            with _solve_b ( ) :
                cnt0 = 0
                for c in wks_s :
                    if c == '0' :
                        cnt0 += 1
                    elif c == '1' :
                        cnt1 += 1
            with _solve_d ( ) :
                num_n = 0
                num_k = 0
                res = 0
                while wk >= num_a and res < num_c :
                    wk -= num_a
                    res += 1
                print ( res )
    def _solve_a2 ( ) :
        with _solve_b ( ) :
            num_a = _solve_a ( )
            num_b = _solve_b ( )
            num_k = _solve_a ( )
            wk = [ ]
            cnt = 0
            for i in range ( max ( num_a , num_b ) , 1 , - 1 ) :
                if num_a % i == 0 and num_b % i == 0 :
                    cnt += 1
                if cnt == num_k :
                    print ( i )
                    return
    def _get_list ( wk ) :
        if len ( wk ) < 2 :
            return
        res = 0
        i1 = 0
        i2 = 1
        for i in range ( 1 , len ( wk ) ) :
            if wk [ i ] != wk [ i - 1 ] :
                i1 = i - 1
                i2 = i
                break
            if i == len ( wk ) - 1 :
                return
        return wk
    return _solve_a ( )
