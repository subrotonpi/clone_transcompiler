def main ( * args ) :
    import sys
    from sympy.utilities.misc import get_filesystem_encoding
    with open ( 'README.rst' , 'r' ) as f :
        a = f.read ( )
        b = f.read ( )
        x = None
        if a % 2 == 1 :
            a = a - 1
            x = a
        sub = b - a
        if sub % 4 == 0 :
            print ( b ^ x )
        elif sub % 4 == 1 :
            print ( b ^ ( b - 1 ) ^ x )
        elif sub % 4 == 2 :
            print ( b ^ 1 ^ x )
        elif sub % 4 == 3 :
            print ( b ^ ( b - 1 ) ^ 1 ^ x )
