def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_COMPILED
    class Main ( object ) :
        def __getattr__ ( self , attr ) :
            return getattr ( sys.modules [ __name__ ] , attr )
    a = Main ( )
    b = Main ( )
    c = Main ( )
    if a == b :
        print ( c )
    elif a == c :
        print ( b )
    else :
        print ( a )
