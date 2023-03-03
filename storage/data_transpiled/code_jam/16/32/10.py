def pymavtushenko.Gcj1C ( ) :
    import os
    import math
    import tempfile
    import tempfile
    import tempfile
    import tempfile
    import tempfile
    import time
    import math
    import random
    import random
    import math
    import random
    import subprocess
    import tempfile
    import tempfile
    import os
    fname = 'B-large.in'
    with open ( fname , 'r' ) as f :
        with open ( fname + '.out' , 'w' ) as f :
            tests = int ( f.readline ( ) )
            for test in range ( 1 , tests + 1 ) :
                with tempfile.NamedTemporaryFile ( 'r' , delete = False ) as f :
                    b = random.randint ( 1 , b )
                    m = random.randint ( 1 , b )
                    init_m = m
                    f.write ( 'Case #%d: ' % test )
                    tt = [ [ 0 ] * b ]
                    max = ( long ( random.randint ( 2 , b - 2 ) ) )
                    if m > max :
                        f.write ( 'IMPOSSIBLE\n' )
                    else :
                        f.write ( 'POSSIBLE\n' )
                        res = ''
                        if m == max :
                            res += '1'
                            tt [ 0 ] [ b - 1 ] = 1
                            m -= 1
                        else :
                            res += '0'
                            tt [ 0 ] [ b - 1 ] = 0
                        for i in range ( 1 , b ) :
                            set = ( m & 1 ) != 0
                            res += '1' if set else '0'
                            tt [ 0 ] [ b - 1 - i ] = 1 if set else 0
                            m = m >> 1
                        f.write ( res.reverse ( ).ljust ( b ) + '\n' )
                        for i in range ( 2 , b + 1 ) :
                            res = ''
                            for j in range ( i ) :
                                res += '0'
                                tt [ i - 1 ] [ j ] = 0
                            for j in range ( b - i ) :
                                res += '1'
                                tt [ i - 1 ] [ j + i ] = 1
                            f.write ( res )
                        val = [ 0 ] * b
                        f.write ( val )
