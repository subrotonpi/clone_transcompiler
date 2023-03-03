def _import ( ) :
    import os
    import sys
    import os
    import os
    import sys
    import os
    import sys
    import os
    import subprocess
    class Main ( object ) :
        _ReadFromFile = os.environ.get ( 'ONLINE_PYGE' ) is None
        _WriteToFile = True
    def __next__ ( ) :
        return int ( __next__ )
    def nextDouble ( ) :
        return float ( __next__ )
    def __next__ ( ) :
        while not os.path.isfile ( os.path.join ( os.path.dirname ( __file__ ) , '..' , '..' , '..' , '..' ) ) :
            os.remove ( os.path.join ( os.path.dirname ( __file__ ) , '..' , '..' , '..' , '..' , '..' ) )
        return next ( )
    def core ( ) :
        ntest = randint ( 1 , 10000 )
        for test in range ( ntest ) :
            tot = randint ( 1 , 10000 )
            n = randint ( 1 , 10000 )
            have = [ randint ( 1 , 10000 ) for _ in range ( n ) ]
            have.sort ( )
            best = [ 0 ] * 1000000
            best [ 0 ] = 0
            for len in have [ 1 : ] :
                for i in range ( len ( have ) ) :
                    if len ( have [ i ] ) >= len ( have [ i ] ) and best [ len ( have [ i ] ) - len ( have [ i ] ) ] != len ( have [ i ] ) :
                        best [ i ] = min ( best [ i ] , 1 + len ( have [ i ] ) )
            res = sum ( best )
            for i in range ( len ( best ) ) :
                if best [ i ] != len ( have [ i ] ) :
                    rem = tot - i
                    for j in range ( len ( have ) ) :
                        if rem % have [ j ] == 0 :
                            now = best [ i ] + rem / have [ j ]
                            if now < res :
                                res = now
    write_case ( next ( ) )
    if res == sum ( map ( lambda x : x [