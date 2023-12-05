def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    from numpy.core import zeros
    from numpy.core import linalg
    from numpy.core import zeros
    from numpy.core import linalg
    from numpy.core import dot
    from numpy.core import linalg
    H , W , D = map ( int , sys.stdin.read ( ).split ( ) )
    A = zeros ( ( H , W ) )
    x = zeros ( H * W )
    y = zeros ( H * W )
    ans = zeros ( H * W )
    for i in range ( H ) :
        for j in range ( W ) :
            A [ i , j ] = randint ( 0 , H * W ) - 1
            x [ A [ i , j ] ] = j
            y [ A [ i , j ] ] = i
    Q , L , R = map ( int , sys.stdin.read ( ).split ( ) )
    for i in range ( Q ) :
        L [ i ] = randint ( 0 , Q * W )
        R [ i ] = randint ( 0 , Q * W ) - 1
    for i in range ( D ) :
        now = i
        while now < H * W - D :
            ans [ now + D ] = abs ( x [ now : now + D ] ) + abs ( y [ now : now + D ] ) + ans [ now : now + D ]
            now += D
    for i in range ( Q ) :
        print ( ans [ R [ i ] ] - ans [ L [ i ] ] )
