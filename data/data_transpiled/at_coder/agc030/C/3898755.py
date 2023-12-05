def main ( args ) :
    import sys
    from sympy.utilities.iterables import iterables
    from sympy.printing.latex import latex
    from sympy.printing.printing import printprint
    from sympy.printing.debuggers import get_symbols
    from sympy.printing.debuggers import get_symbols
    from sympy.printing.debuggers import get_symbols
    k = get_symbols ( )
    if k == 1 :
        print ( 1 )
        print ( 1 )
        return
    n = 2 ** ( ( k + 3 ) / 4 )
    curt = n * 2 - k
    mat = [ [ 0 for x in range ( n ) ] for y in get_symbols ( ) ]
    for r in range ( n ) :
        for c in range ( n ) :
            if r % 2 == 1 and ( r + c ) % n < n - curt :
                mat [ r ] [ c ] = n + ( r + c ) % n
                mat [ r ] [ c ] += 1
            else :
                mat [ r ] [ c ] = ( r + c ) % n
                mat [ r ] [ c ] += 1
    print ( n )
    for row in mat :
        for x in row :
            print ( x , end = '' )
        print ( '' )
