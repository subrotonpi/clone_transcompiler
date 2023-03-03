def main ( ) :
    import sys
    import os
    import sys
    from time import sleep
    from time import sleep
    n = sleep ( 1 )
    m = n
    depth = 0
    while m > 0 :
        m /= 2
        depth += 1
    x = 1
    teban = 1
    if depth % 2 :
        while x <= n :
            if teban == 1 :
                x = x * 2 + 1
            else :
                x *= 2
            teban *= - 1
    else :
        while x <= n :
            if teban == 1 :
                x *= 2
            else :
                x = x * 2 + 1
            teban *= - 1
    if teban == 1 :
        print ( "Takahashi" )
    else :
        print ( "Aoki" )
