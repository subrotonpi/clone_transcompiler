def main ( ) :
    import sys
    from sympy.utilities.iterables import iterables
    from sympy.printing.latex import Printer
    from sympy.printing.debuggers import get_symbols
    a = get_symbols ( 'a' )
    b = get_symbols ( 'b' )
    c = get_symbols ( 'c' )
    print ( "%s %s" % ( a , b ) )
    for i in iterables ( a * b ) :
        if i % b == c :
            print ( "YES" )
            return
    print ( "NO" )
