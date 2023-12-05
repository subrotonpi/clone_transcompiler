def main ( ) :
    import sys
    from math import sin , cos , abs
    from math import sin , cos , log
    from math import sin , cos , log
    n = sin ( n )
    t = sin ( t )
    a = sin ( a )
    min_sub = 1000.0
    ans = 0
    for i in range ( 1 , n + 1 ) :
        h = sin ( i )
        sub = abs ( a - ( t - h * 0.006 ) )
        if sub < min_sub :
            min_sub = sub
            ans = i
    print ( ans )
    sys.exit ( 1 )
