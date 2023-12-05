def _import ( ) :
    import sys
    from itertools import count
    from itertools import repeat
    from itertools import chain
    from itertools import chain
    N = len ( sys.stdin.readline ( ) )
    ans = 0
    count = 0
    watered = False
    h = chain ( [ repeat ( i ) for i in range ( N ) ] )
    while count < len ( h ) :
        for i in range ( N ) :
            if i > 0 :
                h [ i ] -= 1
                if i == 0 :
                    count += 1
                watered = True
                continue
            if watered :
                ans += 1
                watered = False
        if watered :
            ans += 1
            watered = False
    out ( ans )
