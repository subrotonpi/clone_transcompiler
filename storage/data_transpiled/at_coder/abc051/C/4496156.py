def main ( ) :
    import sys
    from sympy.utilities.iterables import iterables
    from sympy.printing.latex import Printer
    from sympy.printing.debuggers import get_symbols
    sx , sy , tx , ty = get_symbols ( 'sx sy tx ty' )
    dx = tx - sx
    dy = ty - sy
    symbols = [ ]
    go ( symbols , 'R' , dx )
    go ( symbols , 'U' , dy )
    go ( symbols , 'L' , dx )
    go ( symbols , 'D' , dy + 1 )
    go ( symbols , 'R' , dx + 1 )
    go ( symbols , 'U' , dy + 1 )
    go ( symbols , 'L' , 1 )
    go ( symbols , 'R' , dx + 1 )
    print ( Printer ( )._print_success_message ( ) )
