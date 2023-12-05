def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import radians
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    N = int ( sys.stdin.read ( ) )
    map = [ log ( x ) for x in range ( N ) ]
    ans = sum ( map )
    for i in range ( N ) :
        base_aoki = sum ( map )
        base_takahashi = sum ( map )
        for j in range ( N ) :
            if i == j :
                continue
            aoki = takahashi = sum ( map )
            type = True
            for s in range ( min ( i , j ) , max ( i , j ) + 1 ) :
                if type :
                    takahashi += map [ s ]
                else :
                    aoki += map [ s ]
                type = not type
            if aoki > base_aoki :
                base_aoki = aoki
                base_takahashi = takahashi
        ans = max ( base_takahashi , ans )
    print ( ans )
