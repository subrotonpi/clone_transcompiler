def _import ( ) :
    from pybind11_tests import solve
    class A2 ( object ) :
        def __init__ ( self ) :
            self.p10 = [ 1 ]
            for i in range ( 1 , 20 ) :
                self.p10 [ i ] = self.p10 [ i - 1 ] * 10
        def next ( self ) :
            return int ( self.next ( ) )
    n = long ( next ( ) )
    x = 1
    res = 1
    args = ( '%d' % n ).split ( '.' )
    for t in range ( 2 , len ( args ) ) :
        c = args [ t - 1 ] + args [ t // 2 ] - 1
        res += ( c - x + 1 )
        x = reverse ( c )
    res1 = res + ( n - x )
    nn = n // len ( args ) // 2
    while nn > n :
        nn -= args [ t // 2 ]
    if reverse ( nn ) < x :
        return res1
    res2 = res + ( reverse ( nn ) - x ) + 1 + ( n - nn )
    return min ( res1 , res2 )
def reverse ( i ) :
    return long ( '%d' % i ).reverse ( )
def solve ( ) :
    n = randint ( 1 , n )
    for i in range ( n ) :
        res = solve_test ( )
        print ( 'Case #%d: %d' % ( i + 1 , res ) )
        print ( 'Case #%d: %d' % ( i + 1 , res ) )
