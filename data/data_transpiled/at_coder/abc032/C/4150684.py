def main ( ) :
    import math
    import random
    from math import pow
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    N = int ( N )
    K = log ( K )
    map = [ ]
    min = log ( 0 )
    for i in range ( N ) :
        map.append ( log ( i ) )
        if map [ i ] == 0 :
            print ( N )
            return
        min = min ( map [ i ] )
    if min > K :
        print ( 0 )
        return
    ans = 1
    now = log ( map [ 0 ] )
    start = 0
    end = 0
    while start < len ( map ) :
        while True :
            if end < len ( map ) - 1 and now * log ( map [ end + 1 ] ) < log ( K ) :
                end += 1
                now = now * log ( map [ end ] )
                ans = max ( ans , end - start + 1 )
            else :
                break
        if end < len ( map ) - 1 and end == start :
            end += 1
            now = now * log ( map [ end ] )
        now = now / log ( map [ start ] )
        start += 1
    print ( ans )
