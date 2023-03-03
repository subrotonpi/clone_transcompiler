def _import ( ) :
    import math
    import random
    class C ( int ) :
        def p ( self , s ) :
            print ( s )
    def main ( ) :
        with open ( '/proc/' ) as sc :
            T = sc.read ( )
            for zz in range ( 1 , T + 1 ) :
                C = sc.read ( )
                N = sc.read ( )
                dp = [ - 1.0 ] * ( C + 1 )
                print ( 'Case #%d: %f' % ( zz , dp ( 0 ) ) )
    C , N = C , N
    def dp ( num_diff ) :
        if num_diff >= C :
            return 0.0
        if dp [ num_diff ] != - 1.0 :
            return dp [ num_diff ]
        pr0 = ( float ( choose ( num_diff , N ) ) / choose ( C , N ) )
        ev = 0.0
        for i in range ( 1 , N + 1 ) :
            ev += ( 1.0 + dp ( num_diff + i ) ) * ( ( float ( choose ( num_diff , N - i ) ) * choose ( C - num_diff , i ) ) / ( choose ( C , N ) ) )
        ans = ( pr0 + ev ) / ( 1 - pr0 )
        dp [ num_diff ] = ans
        return ans
    def choose ( n , k ) :
        ans = 1
        to_div = [ ]
        for i in range ( 2 , k + 1 ) :
            to_div.append ( i )
        for i in range ( n , n - k + 1 , - 1 ) :
            ans *= i
            for j in to_div :
                if ans % j == 0 :
                    ans /= j
                    del to_div [ j ]
                    del to_div [ j ]
        return ans
    return main
