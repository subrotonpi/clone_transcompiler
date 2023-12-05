def main ( ) :
    import sys
    from sympy.utilities.misc import get_filesystem_encoding
    with open ( 'README.md' ) as f :
        n = f.read ( )
        if n % 3 == 0 :
            print ( 'YES' )
        if n % 3 != 0 :
            print ( 'NO' )
