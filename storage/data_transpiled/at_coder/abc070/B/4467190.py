def main ( * args ) :
    import sys
    import os
    import random
    import sys
    x = random.randrange ( 0 , 101 )
    tl = [ 0 ] * 101
    for i in range ( 101 ) :
        if i >= x [ 0 ] and i < x [ 1 ] :
            tl [ i ] += 1
        if i >= x [ 2 ] and i < x [ 3 ] :
            tl [ i ] += 1
    ans = 0
    for i in range ( 101 ) :
        if tl [ i ] == 2 :
            ans += 1
    print ( ans )
