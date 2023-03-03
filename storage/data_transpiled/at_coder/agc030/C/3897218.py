def main ( ) :
    import sys
    from sympy.utilities.iterables import iterables
    from sympy.printing.latex import latex
    from sympy.printing.printing import print_platex
    from sympy.printing.latex import latex
    from sympy.printing.printing.latex import latex
    from sympy.printing.printing import print_platex
    from sympy.printing.printing import print_platex
    from sympy.printing.pprint_util import get_terminal_size
    k = int ( sys.stdin.readline ( ) )
    if k == 1 :
        print ( 1 )
        print ( 1 )
        return
    n = 2 ** ( ( k + 3 ) / 4 )
    curt = n * 2 - k
    mat = [ [ 0 , 1 ] for _ in range ( n ) ]
    for r in range ( n ) :
        for c in range ( n ) :
            if r % 2 == 1 and ( r + c ) % n < n - curt :
                mat [ r ] [ c ] = n + ( r + c ) % n
                mat [ r ] [ c ] += 1
            else :
                mat [ r ] [ c ] = ( r + c ) % n
                mat [ r ] [ c ] += 1
    rr = 1
    print ( n )
    for row in mat :
        cc = 1
        for x in row :
            print ( x , end = "" )
            if cc < n :
                print ( "" , end = "" )
            cc += 1
        if rr < n :
            print ( "" )
        rr += 1
