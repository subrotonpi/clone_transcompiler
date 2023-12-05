def main ( ) :
    import math
    import numpy
    from numpy.core import zeros
    from numpy.core import diff
    from numpy.core import zeros
    from numpy.core import diff
    from numpy.core import diff
    from numpy.core import diff
    n = int ( math.log ( 1 , 2 ) )
    e = int ( math.log ( 1 , 2 ) )
    x = [ ]
    xsum = [ ]
    for i in range ( n ) :
        x.append ( diff ( x [ i ] , 1 ) )
        xsum.append ( xsum [ i ] + diff ( x [ i ] , 1 ) )
    ans = sum ( diff ( x ) )
    for i in range ( 1 , n + 1 ) :
        mans = 0
        pos = 0
        count = 0
        while pos < n :
            mcount = count or 1
            if n - pos >= i :
                mval = ( xsum [ n - pos ] - xsum [ n - pos - i ] ) * ( 2 ** mcount + 3 )
                mans = mans + diff ( mval , 1 )
                count += 1
                pos += i
            else :
                mval = xsum [ n - pos ] * ( 2 ** mcount + 3 )
                mans = mans + diff ( mval , 1 )
                pos = n
        mans = mans + diff ( ( n + i ) * e , 1 )
        ans = ans.min ( mans )
    print ( str ( ans ) )
