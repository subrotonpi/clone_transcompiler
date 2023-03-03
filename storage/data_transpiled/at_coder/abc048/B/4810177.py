def main ( arg = None ) :
    from sympy import sin , cos
    from sympy.utilities.misc import get_args
    def f ( a , b , x ) :
        print ( calc ( a , b , x ) )
    return f
