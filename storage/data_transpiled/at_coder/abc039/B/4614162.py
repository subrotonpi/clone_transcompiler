def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_COMPILED
    class Main ( object ) :
        def __getattr__ ( self , attr ) :
            return getattr ( sys , attr )
    x = Main ( )
    ans = 1
    for i in range ( 1 , x ) :
        tmp = i ** 2
        if tmp == x :
            ans = i
            break
        elif tmp > x :
            break
    print ( ans )
