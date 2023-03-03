def main ( args ) :
    import sys
    from numpy.core import zeros
    from numpy.linalg import eigs
    sc = zeros ( ( n , n ) )
    arr = [ ]
    for i in range ( n ) :
        arr.append ( sc.choice ( range ( n ) ) )
    org = [ i for i in arr if i < n ]
    arr.sort ( )
    midx = ( len ( arr ) - 1 ) // 2
    for i in org :
        if i > arr [ midx ] :
            print ( arr [ midx ] )
        else :
            print ( arr [ midx + 1 ] )
