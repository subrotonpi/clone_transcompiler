def main ( ) :
    import sys
    from math import fabs
    from math import pi
    from math import log
    from math import log
    from math import pi
    from math import log
    from math import pi
    N = pi.find ( '.' )
    ans = ''
    while True :
        ans += chr ( abs ( N ) % 2 + '0' )
        if N < 0 :
            N = ( N - 1 ) / ( - 2 )
        else :
            N = N / ( - 2 )
        ans = ans.replace ( '.' , '' )
        ans = ans.replace ( '.' , '' )
        print ( ans )
