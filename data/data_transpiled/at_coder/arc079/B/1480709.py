def main ( ) :
    from math import ceil
    solve ( )
    from math import sin , cos , solve
    sc = Scanner ( )
    K = int ( sc.next ( ) )
    N = 50
    m = K // N
    r = K % N
    a = [ m + N - r - 1 for i in range ( N - int ( r ) ) ]
    for i in range ( N - int ( r ) , N ) :
        a [ i ] = m + 2 * N - r
    answer ( N , a )
    sc.close ( )
    def answer ( N , a ) :
        print ( N )
        print ( a [ 0 ] , end = ' ' )
        for i in range ( 1 , N ) :
            print ( ' ' , a [ i ] , end = ' ' )
        print ( )
    return answer
