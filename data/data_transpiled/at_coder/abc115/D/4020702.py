def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import sin , cos , log
    from math import log
    from math import log
    from math import log
    from math import log
    N = randint ( 1 , N + 1 )
    X = log ( X )
    An = [ ]
    Bn = [ ]
    A = 5
    B = 3
    for i in range ( 1 , N + 1 ) :
        An.append ( A )
        A = A * 2 + 3
    for i in range ( 1 , N + 1 ) :
        Bn.append ( B )
        B = B * 2 + 1
    print ( f ( N , X , An , Bn ) )
    def f ( n , x , an , bn ) :
        if n == 1 :
            if x >= 5 :
                return 3
            else :
                return max ( 0 , x - float ( 1 ) )
        elif an [ n ] - float ( 1 ) <= x :
            return bn [ n ]
        elif an [ n - 1 ] + float ( 2 ) <= x :
            return bn [ n - 1 ] + float ( 1 ) + f ( n - 1 , x - float ( 2 ) - an [ n - 1 ] , an , bn )
        else :
            return f ( n - 1 , x - float ( 1 ) , an , bn )
    return f
