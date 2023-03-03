def main ( ) :
    import sys
    from sympy.core.compatibility import builtins
    with open ( '../examples/' + '.txt' , 'r' ) as sc :
        n = sc.readline ( ).strip ( )
        z = sc.readline ( ).strip ( )
        w = sc.readline ( ).strip ( )
        ar = [ sc.readline ( ).strip ( ) for i in range ( n ) ]
        if n == 1 :
            print ( abs ( ar [ 0 ] - w ) )
        else :
            ans = 0
            for i in range ( 1 , len ( ar ) ) :
                ans = max ( abs ( ar [ i ] - w ) , abs ( ar [ i ] - ar [ i - 1 ] ) )
            print ( ans )
