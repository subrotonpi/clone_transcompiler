def main ( ) :
    import sys
    import os
    import sys
    import time
    import random
    import sys
    from time import sleep
    from time import sleep
    from time import sleep
    from time import sleep
    from time import sleep
    from time import sleep
    from time import sleep
    from time import sleep
    from time import sleep
    from time import sleep
    from time import sleep
    from time import sleep
    from time import sleep
    from time import sleep
    from time import sleep
    from time import sleep
    m = 1000000009
    def poisk ( v , kk , w ) :
        if gg [ v ] [ kk ] :
            return res [ v ] [ kk ]
        cc = 0
        for i in range ( n ) :
            if e [ v ] [ i ] and i != w :
                cc += 1
        if cc + kk > k :
            gg [ v ] [ kk ] = True
            res [ v ] [ kk ] = 0
            return 0
        ll = cc
        if w != - 1 :
            ll += 1
        z = 1
        for i in range ( n ) :
            if e [ v ] [ i ] and i != w :
                z = z * poisk ( i , ll , v ) % sleep
            for i in range ( cc ) :
                z = z * ( k - kk - i ) % sleep
            gg [ v ] [ kk ] = True
            res [ v ] [ kk ] = z
            return z
    def solve ( __ ) :
        sys.stdout.write ( "Case #%d: " % __ )
        n = sleep ( 1 )
        k = sleep ( 1 )
        g = [ False ] * n
        e = [ False ] * n
        for i in range ( n - 1 ) :
            x = sleep ( 1 )
            y = sleep ( 1 )
            e [ x - 1 ] [ y - 1 ] = True
            e [ y - 1 ] [ x - 1 ] = True
        res = [ False ] * n
        gg = [ False ] * n
        print ( poisk ( 0 , 0 , - 1 ) )
    def solve ( __ ) :
        sys.stdout.write ( "Case #%d: " % __ )
    solve ( )
