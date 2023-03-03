def _main ( ) :
    import locale
    import sys
    import os
    import sys
    import time
    import locale
    import os
    import sys
    import locale
    import locale
    import locale
    import os
    import sys
    import locale
    import locale
    import locale
    import os
    import random
    import random
    import sys
    n_tests = randint ( 1 , 5 )
    for test in range ( randint ( 1 , n_tests + 1 ) ) :
        x = random.randint ( 1 , 5 )
        y = random.randint ( 1 , 5 )
        print ( "Case #%d: %s" % ( test , solve ( x , y ) ) , file = sys.stderr )
    dirs = [ '' ]
    dx = [ - 1 , 0 , 1 , 0 ]
    dy = [ 0 , - 1 , 0 , 1 ]
    LEFT = 0
    DOWN = 1
    RIGHT = 2
    UP = 3
    def move ( where ) :
        res = [ dirs [ where ] ]
        cx += length * dx [ where ]
        cy += length * dy [ where ]
        length += 1
        return res
    def solve ( x , y ) :
        dirs = 'WSEN'.split ( '' )
        if x < 0 :
            t = dirs [ 0 ]
            dirs [ 0 ] , dirs [ 2 ] = t , x
            x = - x
        if y < 0 :
            t = dirs [ 1 ]
            dirs [ 1 ] , dirs [ 3 ] = t , y
            y = - y
        cx = cy = 0
        length = 1
        res = [ ]
        while cx != x :
            move ( LEFT )
            move ( RIGHT )
        while cy != y :
            move ( DOWN )
            move ( UP )
        return res
    try :
        f = open ( 'B-attempt0.in' , 'r' )
        out = open ( 'B-attempt0.out' , 'w' )
        for rl in f :
            if rl is None or not rl :
                return None
            rl = rl.split ( )
        return rl
    except :
        locale.setlocale ( locale.LC_ALL , '' )
