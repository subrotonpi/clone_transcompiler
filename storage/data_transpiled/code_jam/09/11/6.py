def main ( args ) :
    import sys
    import os
    import getopt
    f = open ( 'test.txt' , 'r' )
    t = int ( f.readline ( ) )
    isL = [ [ False for j in range ( 2 , 10 ) ] for i in range ( 1 , 11 ) ]
    for i in range ( 2 , 20000000 ) :
        if not i & 1048575 :
            print ( i )
        for j in range ( 2 , 10 ) :
            if i < 100 :
                h = set ( )
                c = i
                for _ in range ( 1 , 11 ) :
                    h.add ( c )
                    q = 0
                    while c > 0 :
                        d = c % j
                        q = q + d * d
                        c //= j
                    c = q
                    if c < i or c in h :
                        break
                isL [ j ] [ i ] = isL [ j ] [ c ]
            else :
                c = i
                q = 0
                while c > 0 :
                    d = c % j
                    q = q + d * d
                    c //= j
                c = q
                assert c < i
                isL [ j ] [ i ] = isL [ j ] [ c ]
    for tt in range ( 1 , t + 1 ) :
        f = [ False for _ in range ( 11 ) ]
        for a in f :
            ans = - 1
            for i in range ( 2 , 20000000 ) :
                ok = 1
                for j in range ( 2 , 10 ) :
                    if f [ j ] :
                        ok &= isL [ j ] [ i ]
                if ok :
                    ans = i
                    break
            print ( 'Case #%d: %d' % ( tt , ans ) )
