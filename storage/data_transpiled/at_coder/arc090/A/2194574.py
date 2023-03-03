def main ( ) :
    import sys
    from os.path import join
    from os import sep
    from os import sep
    from os import sep
    from os import chdir
    from os import sep
    from os import chdir
    from sys import stdin
    from os import chdir
    from os import sep
    from os import chdir
    N = int ( sep.join ( [ sep.join ( [ '' , '' ] ) , '' ] ) )
    grid = [ [ ] for i in range ( 2 ) ]
    for line in stdin :
        temp = line.split ( '[ ]' )
        for j in range ( N ) :
            grid [ i ] [ j ] = int ( temp [ j ] )
    print ( solution ( grid , N ) )
    def solution ( grid , N ) :
        for i in range ( 1 , - 1 , - 1 ) :
            for j in range ( N - 1 , - 1 , - 1 ) :
                current = 0
                if j + 1 < N :
                    current = max ( current , grid [ i ] [ j + 1 ] )
                if i + 1 < 2 :
                    current = max ( current , grid [ i + 1 ] [ j ] )
                grid [ i ] [ j ] += current
        return grid [ 0 ] [ 0 ]
    return solution
