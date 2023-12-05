def main ( ) :
    import os
    from sympy.core.compatibility import builtins
    from sympy.core.compatibility import builtins
    with open ( 'B-large.in' , 'r' ) as sc :
        with open ( 'B-large.out' , 'w' ) as f :
            nt = sc.count ( 'n' )
            for tn in range ( 1 , nt + 1 ) :
                print ( 'Case #%d: ' % tn , end = ' ' )
                n = sc.count ( 'n' )
                a = [ ]
                for i in range ( n ) :
                    a.append ( sc.choice ( range ( n ) ) )
                a.sort ( )
                res = a [ 1 ] - a [ 0 ]
                for i in range ( n ) :
                    for j in range ( i + 1 , n ) :
                        res = res.gcd ( a [ j ] - a [ i ] )
                a [ 0 ] = a [ 0 ] % res
                a [ 0 ] = res - a [ 0 ] % res
                print ( a [ 0 ] , end = ' ' )
