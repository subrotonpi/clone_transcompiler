def main ( data ) :
    import sys
    from numpy import zeros , array
    from numpy.linalg import norm
    from numpy.random import rand
    N = rand ( )
    arr = [ ]
    for i in range ( N ) :
        arr.append ( rand ( ) )
    arr.sort ( )
    max , min = sum ( arr ) , sum ( arr )
    for i in arr :
        max , min = max ( max , i ) , min ( min , i )
    mincost = sum ( arr )
    for i in range ( min , max + 1 ) :
        total = 0
        for j in arr :
            total += norm ( i - j ) * ( i - j )
        if total > mincost :
            break
        mincost = total
    print ( mincost )
