def _import ( ) : return float ( next ( ) )
def _import ( ) : return int ( next ( ) )
def _import ( ) : return sys.maxsize
def _import ( ) :
    import os
    import os
    import sys
    import random
    import time
    from ..utils import get_locale
    import locale
    import sys
    import os
    import random
    import sys
    import os
    import locale
    import os
    import sys
    import os
    import random
    import random
    import time
    from ..utils import get_locale
    try :
        from ..utils import get_locale
    except :
        import locale
    try :
        f = open ( '%s.in' % os.path.basename ( sys.argv [ 0 ] ) , 'r' )
    except :
        open ( '%s.out' % os.path.basename ( sys.argv [ 0 ] ) , 'w' )
    else :
        f = open ( '%s.out' % os.path.basename ( sys.argv [ 0 ] ) , 'w' )
    def _eval ( ) :
        low = 0
        high = sys.maxsize
        while 1 :
            m = ( low + high ) / 2
            if m <= eps or m == low or m == high :
                break
            if _intersect ( m , a ) :
                low = m
            else :
                high = m
        start = high
        answer = start + math.sqrt ( 2 * d / a )
        return answer
    def _intersect ( start , a ) :
        for i in range ( 0 , len ( t ) ) :
            if t [ i ] < start or x [ i ] >= d :
                continue
            tm = t [ i ] - start
            y = a * tm ** 2 / 2
            if y > x [ i ] :
                return True
        tf = start + math.sqrt ( 2 * d / a )
        for i in range ( 0 , len ( t ) ) :
            if t [ i ] < tf and tf < t [ i + 1 ] :
                xx = x [ i ] + ( x [ i + 1 ] - x [ i ] ) * ( tf - t [ i ] ) / ( t [ i ] - t [ i ]