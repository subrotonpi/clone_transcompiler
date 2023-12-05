def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import log
    with open ( sys.argv [ 1 ] , 'r' ) as sc :
        T = randint ( 1 , T )
        for t in range ( 1 , T + 1 ) :
            N = randint ( 1 , T )
            nums = [ [ randint ( 1 , N ) for _ in range ( 3 ) ] for _ in range ( N ) ]
            ans = 0
            for i in range ( N ) :
                low = [ ]
                high = [ ]
                cur = 0
                A = nums [ i ] [ 0 ]
                for j in range ( N ) :
                    if A < nums [ j ] [ 0 ] :
                        continue
                    if nums [ j ] [ 1 ] <= 10000 - A - nums [ j ] [ 2 ] :
                        low.append ( nums [ j ] [ 1 ] )
                        high.append ( 10000 - A - nums [ j ] [ 2 ] )
                if len ( low ) == 0 :
                    continue
                low.sort ( )
                high.sort ( )
                lc , hc , lcur , hcur = 0 , 0 , low [ 0 ] , high [ 0 ]
                while lc < len ( low ) :
                    if lcur <= hcur :
                        cur += 1
                        ans = max ( ans , cur )
                        lc += 1
                        if lc < len ( low ) :
                            lcur = low [ lc ]
                    else :
                        cur -= 1
                        hc += 1
                        if hc < len ( high ) :
                            hcur = high [ hc ]
            print ( "Case #%d: %d" % ( t , ans ) )
