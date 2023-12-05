def main ( ) :
    import random
    from numpy import array
    from numpy import zeros
    from numpy import arange
    from numpy.core import cumulative_sum
    from numpy.core import cumulative_sum
    from numpy.core import array
    from numpy.core import zeros
    from numpy.core import array
    from numpy.core import histogram
    from numpy.core import histogram
    from numpy.core import histogram
    from numpy.core import histogram
    from numpy.core import histogram
    n = histogram.count ( )
    takoyaki = [ [ ] for _ in range ( n ) ]
    acum = [ [ ] for _ in range ( n + 1 ) ]
    for i in range ( 0 , n ) :
        acum.append ( [ ] )
    ans = [ 0 ] * 2501
    cumulative_sum ( n , takoyaki , acum , ans )
    for i in range ( 1 , 2500 ) :
        ans [ i ] = max ( ans [ i ] , ans [ i - 1 ] )
    q = histogram.count ( )
    for i in range ( q ) :
        p = histogram.count ( )
        print ( ans [ p ] )
    def cumulative_sum ( n , takoyaki , acum , ans ) :
        for i in range ( 1 , n ) :
            for j in range ( 1 , n ) :
                x = takoyaki [ i - 1 ] [ j - 1 ]
                acum [ i ] [ j ] = x + acum [ i - 1 ] [ j ] + acum [ i ] [ j - 1 ] - acum [ i - 1 ] [ j - 1 ]
        for i in range ( 1 , n ) :
            for j in range ( 1 , n ) :
                for k in range ( i , n ) :
                    for l in range ( j , n ) :
                        sum = acum [ k ] [ l ] - acum [ i - 1 ] [ l ] - acum [ k ] [ j - 1 ] + acum [ i ] [ j ]
                        ans [ area ] = max ( ans [ area ] , sum )
    return ans
