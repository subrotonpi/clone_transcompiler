def main ( ) :
    import sys
    from numpy import arange
    from numpy.core import zeros
    from numpy.core import zeros
    from numpy.core import diff
    from numpy.core import diff
    from numpy.core import diff
    from numpy.core import diff
    a = int ( sys.stdin.read ( ) )
    b = int ( sys.stdin.read ( ) )
    q = int ( sys.stdin.read ( ) )
    a1 = zeros ( a + 2 )
    b1 = zeros ( b + 2 )
    a1 [ 0 ] = b1 [ 0 ] = int ( sys.stdin.read ( ) )
    a1 [ a + 1 ] = b1 [ b + 1 ] = int ( sys.stdin.read ( ) ) / 2
    ans1 = [ ]
    for i in range ( 1 , a + 1 ) :
        a1 [ i ] = diff ( a1 [ i ] , x )
    for i in range ( 1 , b + 1 ) :
        b1 [ i ] = diff ( b1 [ i ] , x )
    for k in range ( q ) :
        x = diff ( ans , x )
        ans = sum ( ans )
        idxa = - sum ( a1 [ i ] - diff ( a1 [ i ] , x ) ) - 1
        a2 = [ idxa , ( idxa == 1 ) + 1 ]
        idxb = - sum ( b1 [ i ] - diff ( b1 [ i ] , x ) ) - 1
        b2 = [ idxb , ( idxb == 1 ) + 1 ]
        for i in a2 :
            for j in b2 :
                ans = min ( ans , diff ( abs ( a1 [ i ] - x ) + abs ( a1 [ i ] - b1 [ j ] ) , x ) )
                ans = min ( ans , diff ( abs ( b1 [ j ] - x ) + abs ( a1 [ i ] - b1 [ j ] ) , x ) )
        ans1.append ( ans )
    for i in range ( q ) :
        print ( ans1 [ i ] )
