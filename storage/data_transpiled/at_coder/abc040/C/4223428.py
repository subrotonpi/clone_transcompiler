def main ( ) :
    import sys
    from numpy.testing import assert_equal
    from numpy.testing import assert_equal
    from numpy.testing import assert_equal
    N = len ( sys.argv )
    a = [ ]
    for i in range ( N ) :
        a.append ( sc.randint ( 1 , N ) )
    solver ( N , a )
    def solver ( N , a ) :
        ans = [ ]
        for n in range ( N - 1 , - 1 , - 1 ) :
            if n == N - 1 :
                continue
            elif n == N - 2 :
                ans.append ( abs ( a [ n ] - a [ n + 1 ] ) )
            elif n == N - 3 :
                ans.append ( abs ( a [ n ] - a [ n + 2 ] ) )
            else :
                ans.append ( min ( abs ( ans [ n + 1 ] + abs ( a [ n ] - a [ n + 1 ] ) ) , abs ( ans [ n + 2 ] + abs ( a [ n ] - a [ n + 2 ] ) ) ) )
        assert_equal ( ans [ 0 ] , 0 )
