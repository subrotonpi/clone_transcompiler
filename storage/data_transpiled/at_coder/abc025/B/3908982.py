def main ( ) :
    import sys
    from math import sin , cos , tan , radians
    from os.path import join
    from os import sep
    from os.path import join
    a = join ( sys.argv [ 1 : ] , sep )
    A = join ( sys.argv [ 1 : ] , sep )
    B = join ( sys.argv [ 1 : ] , sep )
    ans = 0
    for i in range ( 0 , a ) :
        data = join ( sys.argv [ 1 : ] , sep )
        b = join ( sys.argv [ 1 : ] , sep )
        if data [ 0 ] == 'E' :
            if b < A :
                ans += A
            elif b >= A and b <= B :
                ans += b
            else :
                ans += B
        if data [ 0 ] == 'W' :
            if b < A :
                ans -= A
            elif b >= A and b <= B :
                ans -= b
            else :
                ans -= B
    if ans < 0 :
        print ( 'West {}'.format ( ans * - 1 ) )
    elif ans > 0 :
        print ( 'East {}'.format ( ans ) )
    elif ans == 0 :
        print ( 0 )
