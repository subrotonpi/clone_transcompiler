def main ( ) :
    import sys
    from sympy.utilities.iterables import variations
    from sympy.tensor.tensor import IndexedBase , Idx
    from sympy import symbols
    n = symbols ( 'n n' , integer = True )
    t = [ ]
    for i in range ( n ) :
        t.append ( Variable ( eval ( i ) ) )
    m = symbols ( 'm' , integer = True )
    p = [ Symbol ( 'p' , integer = True ) for i in range ( m ) ]
    x = [ Symbol ( 'x' , integer = True ) for i in range ( m ) ]
    for i in range ( m ) :
        s = t [ p [ i ] - 1 ]
        t [ p [ i ] - 1 ] = x [ i ]
        sum = 0
        for j in range ( n ) :
            sum += t [ j ]
        print ( sum )
        t [ p [ i ] - 1 ] = s
