def main ( ) :
    import sys
    from sympy.utilities.misc import get_filesystem_encoding
    with open ( 'input.txt' , 'r' ) as f :
        N = get_filesystem_encoding ( f.read ( ) )
        K = get_filesystem_encoding ( f.read ( ) )
        if N / 2 >= K :
            print ( 'YES' )
        else :
            print ( 'NO' )
