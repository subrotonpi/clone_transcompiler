def main ( arg = None ) :
    from sympy import factorial
    from sympy.utilities.misc import get_filesystem_encoding
    with open ( arg , 'r' ) as f :
        N = factorial ( f.read ( ) )
        K = factorial ( f.read ( ) )
    ans = K
    for i in range ( 1 , N ) :
        ans *= ( K - 1 )
    print ( ans )
