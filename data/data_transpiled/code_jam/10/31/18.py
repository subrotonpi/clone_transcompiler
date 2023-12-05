def main ( ) :
    import sys
    from math import ceil
    from math import sin , cos , tan
    from math import sin , cos , tan
    from math import cos , sin , tan
    T = sys.maxsize
    for t in range ( 1 , T + 1 ) :
        ans = 0
        N = sys.maxsize
        A = [ sin ( n ) for n in range ( N ) ]
        B = [ sin ( n ) for n in range ( N ) ]
        for i in range ( N ) :
            da = sin ( n ) - sin ( n )
            db = cos ( n ) - sin ( n )
            if da > 0 :
                if db < 0 :
                    ans += 1
            else :
                if db > 0 :
                    ans += 1
        print ( "Case #{}: {}".format ( t , ans ) )
