def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_PY
    from sympy.core.compatibility import builtins
    try :
        A , B , C = NUMPY_PY.symbols
    except ValueError :
        print ( "%s is not a valid Python module." % sys.argv [ 0 ] )
        return
    else :
        print ( "%s is not a valid Python module." % sys.argv [ 0 ] )
        return
    for a , b , c in zip ( A , B , C ) :
        if c == 1 :
            for i in range ( a - 1 , - 1 , - 1 ) :
                for j in range ( 0 , B ) :
                    d [ i ] [ j ] = 0
        if c == 2 :
            for i in range ( a , A ) :
                for j in range ( 0 , B ) :
                    d [ i ] [ j ] = 0
        if c == 3 :
            for i in range ( B - b , B ) :
                for j in range ( 0 , A ) :
                    d [ i ] [ j ] = 0
        if c == 4 :
            for i in range ( B - b - 1 , - 1 , - 1 ) :
                for j in range ( 0 , A ) :
                    d [ i ] [ j ] = 0
    ans = 0
    for i in range ( 0 , B ) :
        for j in range ( 0 , A ) :
            if d [ j ] == 1 :
                ans += 1
    print ( ans )
