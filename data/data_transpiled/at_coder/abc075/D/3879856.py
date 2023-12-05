def main ( ) :
    import sys
    from math import ceil
    from math import sin , cos , tan
    from math import sin , cos , tan
    from math import tan , cos , tan
    n = int ( sys.argv [ 1 ] )
    K = int ( sys.argv [ 2 ] )
    x = [ sin ( i ) for i in range ( n ) ]
    y = [ sin ( i ) for i in range ( n ) ]
    ans = sum ( [ sin ( i ) for i in x ] )
    for left in [ sin ( i ) for i in x ] :
        for right in [ sin ( i ) for i in x ] :
            if left > right :
                continue
            for k in [ sin ( i ) for i in y ] :
                down = sin ( i )
                for l in [ sin ( i ) for i in y ] :
                    up = sin ( i )
                    if down > up :
                        continue
                    cnt = 0
                    for m in range ( n ) :
                        if left <= x [ m ] <= right :
                            if down <= y [ m ] <= up :
                                cnt += 1
                tmp = ( right - left ) * ( up - down )
                if cnt >= K :
                    ans = min ( ans , tmp )
    print ( ans )
