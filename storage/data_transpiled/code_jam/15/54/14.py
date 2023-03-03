def round3 ( ) :
    import os
    import sys
    import collections
    import os
    import sys
    class D ( object ) :
        def __init__ ( self ) :
            self.case = 1
    for caze in range ( 1 , cases + 1 ) :
        P = sys.stdin.readline ( ).split ( ) [ 1 ]
        vals , freqs = [ ] , [ ]
        pos = { }
        for v in vals :
            pos [ v ] = i
        total = 0
        for v in vals :
            freqs.append ( sc.randint ( 0 , P ) )
            total += freqs [ v ]
        cant = 0
        tmp = total
        while tmp > 1 :
            tmp /= 2
            cant += 1
        ans = [ ]
        sum_idx , set_idx = 0 , 0
        for set_idx in range ( cant ) :
            for m in range ( ( 1 , set_idx ) ) :
                if set_idx != 0 and ( m & ( 1 << ( set_idx - 1 ) ) ) == 0 :
                    continue
                val = 0
                for i in range ( set_idx ) :
                    if ( m & ( 1 << i ) ) != 0 :
                        val += ans [ i ]
                freqs [ pos [ val ] ] -= 1
            while freqs [ sum_idx ] == 0 :
                sum_idx += 1
            ans.append ( vals [ sum_idx ] )
        sys.stdout.write ( "Case #%d:" % caze )
        for i in ans :
            sys.stdout.write ( " " + str ( i ) )
        sys.stdout.write ( "\n" )
