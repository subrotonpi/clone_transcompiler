def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_COMPILED
    with open ( '../../../api/python/num3.py' , 'r' ) as f :
        A = eval ( f.read ( ) )
        op = eval ( f.read ( ) )
        B = eval ( f.read ( ) )
        if op == '+' :
            print ( A + B )
        else :
            print ( A - B )
