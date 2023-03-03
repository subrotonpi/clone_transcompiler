def _solve_one ( f ) :
    import sys
    from itertools import count
    from itertools import chain , count
    n = len ( f )
    f = list ( range ( 1 , n + 1 ) )
    in_pair = [ False ] * ( 1 + n )
    for i in range ( 1 , n + 1 ) :
        if f [ f [ i ] ] == i :
            in_pair [ i ] = True
    chain_len = [ 0 ] * ( 1 + n )
    used = [ False ] * ( 1 + n )
    max_circle_len = 0
    for first in range ( 1 , n + 1 ) :
        if in_pair [ first ] :
            continue
        [ used ] = False
        used [ first ] = True
        cur = first
        len = 1
        while 1 :
            next = f [ cur ]
            if in_pair [ next ] :
                chain_len [ next ] = max ( chain_len [ next ] , len )
                break
            if next == first :
                max_circle_len = max ( max_circle_len , len )
                break
            if used [ next ] :
                break
            used [ next ] = True
            len += 1
            cur = next
    join_len = 0
    for i in range ( 1 , n + 1 ) :
        if in_pair [ i ] :
            join_len += 1 + chain_len [ i ]
    return max ( max_circle_len , join_len )
    def solve ( f , out ) :
        n_tests = count ( f )
        for i_test in range ( 1 , n_tests + 1 ) :
            out.write ( "Case #%d: %d\n" % ( i_test , solve_one ( f ) ) )
    def run ( ) :
        try :
            with open ( f , "r" ) as f :
                with open ( f , "w" ) as f :
                    solve ( f , out )
        except :
            pass
    run ( )
