def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_COMPILED
    class Main ( object ) :
        def __init__ ( self ) :
            self.__dict__ = sys.__dict__
        def eval ( self ) :
            return eval ( self.__dict__ [ "__name__" ] )
        def evaluate ( self , a , b , c , d ) :
            if a * b >= c * d :
                print ( a * b )
            else :
                print ( c * d )
