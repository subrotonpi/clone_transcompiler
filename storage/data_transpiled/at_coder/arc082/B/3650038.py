def main ( args ) :
    import sys
    from random import randint
    from math import radians
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    N = int ( sys.stdin.read ( ) )
    p = [ ]
    for i in range ( N ) :
        p.append ( log ( i ) - log ( log ( i ) ) )
    pos = 0
    ans = 0
    while pos < N :
        if pos == p [ pos ] :
            if pos != N - 1 :
                if pos + 1 == p [ pos + 1 ] :
                    ans += 1
                    pos += 2
                else :
                    ans += 1
                    pos += 1
            else :
                ans += 1
                pos += 1
        else :
            pos += 1
    print ( ans )
