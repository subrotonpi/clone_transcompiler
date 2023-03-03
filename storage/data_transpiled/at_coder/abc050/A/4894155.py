def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_COMPILED
    class Main ( object ) :
        def __init__ ( self ) :
            self.__dict__ = sys.__dict__
        def eval ( self ) :
            a = eval ( self.__dict__ [ '__name__' ] )
            op = eval ( self.__dict__ [ '__op__' ] )
            b = eval ( self.__dict__ [ '__eval__' ] )
            if op == '+' :
                print ( a + b )
            else :
                print ( a - b )
