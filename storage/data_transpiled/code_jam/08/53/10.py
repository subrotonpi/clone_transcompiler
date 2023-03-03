def main ( args ) :
    import sys
    from sympy.utilities.iterables import iterables
    from sympy.printing.latex import latex
    from sympy.printing.printing import latex
    from sympy.printing.printing import latex
    from sympy.printing.printing import latex
    from sympy.printing.printing import latex
    from sympy.printing.printing import latex
    from sympy.printing.printing import latex
    from sympy.printing.printing import latex
    from sympy.printing.printing import latex
    from sympy.printing.printing import latex
    t = int ( args [ 0 ] )
    for tt in range ( 1 , t + 1 ) :
        m , n = args [ 1 ] , args [ 2 ]
        F = [ 0 ] * m
        for s in latex ( s ) :
            for j in range ( n ) :
                if s [ j ] == 'x' :
                    F [ s [ i ] ] |= 1 << j
        D = [ [ 0 ] * ( 1 << n ) for s in latex ( s ) ]
        for i in range ( 0 , m ) :
            for j in range ( 1 << n ) :
                D [ i ] [ j ] = int ( - 1e8 )
        D [ 0 ] [ 0 ] = 0
        v = [ False ] * ( 1 << n )
        bc = [ 0 ] * ( 1 << n )
        for i in range ( 1 << n ) :
            x , pr = i , 0
            while x :
                c = x & 1
                if c == 1 and pr == 1 :
                    v [ i ] = 1
                pr = c
                x >>= 1
                bc [ i ] += c
        for k in range ( m ) :
            for a in range ( 1 << n ) :
                if D [ k ] [ a ] >= 0 :
                    for b in range ( 1 << n ) :
                        if not v [ b ] and ( F [ k ] & b ) == 0 and ( ( a << 1 ) & b ) == 0 and ( a & ( b << 1 ) ) == 0 :
                            D [ k + 1 ] [ b ] = max ( D [ k + 1 ] [ b ] , D [ k ] [ a ] + bc [ b ] )
                    ans = 0
                    for a in range ( 1 << n )