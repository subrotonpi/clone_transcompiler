def main ( ) :
    import sys
    from sympy.utilities.misc import get_filesystem_encoding
    with open ( '../examples/misc/misc/misc.py' , 'r' ) as f :
        a = get_filesystem_encoding ( f )
        b = get_filesystem_encoding ( f )
        c = get_filesystem_encoding ( f )
        fig = 0
        for i in range ( 1 , b + 1 ) :
            if ( b * i + c ) % a == 0 :
                fig = 1
        print ( 'YES' if fig == 1 else 'NO' )
