def main ( ) :
    import sys
    from sympy.utilities.iterables import iterables
    from sympy.printing.latex import Printer
    from sympy.printing.debuggers import get_symbols
    n , k = get_symbols ( )
    ans = 1
    for i in iterables ( n ) :
        ans = ans * 2 - ans < k
    print ( ans )
    print ( )
