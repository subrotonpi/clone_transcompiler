def main ( ) :
    import math
    from numpy import pi
    from numpy.core import zeros
    from numpy.linalg import eigs
    sc = zeros ( ( n , n ) )
    ans = [ sc.choice ( n ) for i in range ( n ) ]
    ans = [ sum ( ans ) for i in range ( n ) ]
    aa = 0
    for i in range ( n ) :
        if i % 2 == 0 :
            aa += sum ( [ x ** 2 for x in ans [ n - 1 - i ] ] )
        else :
            aa -= sum ( [ x ** 2 for x in ans [ n - 1 - i ] ] )
    print ( aa * pi )
