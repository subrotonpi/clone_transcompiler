def _import ( ) :
    from math import sin , cos , cos , solve
    global bestk
    global a , tp , ty , tp , bestk
    if bestk >= 3 :
        return 'IMPOSSIBLE'
    sc = sys.stdin
    f = open ( 'Blarge.out' , 'w' )
    ntest = sc.randint ( 1 , len ( a ) )
    for test in range ( 1 , ntest + 1 ) :
        m = sc.randint ( 1 , len ( a ) )
        n = sc.randint ( 1 , len ( a [ 0 ] ) )
        tp = [ ]
        for i in range ( m ) :
            tx = [ ]
            ty = [ ]
            for j in range ( n ) :
                ty.append ( a [ i ] [ j ] - '0' )
            res = Bai2 ( ).solve ( h )
            f.write ( 'Case #' + str ( test ) + ': ' )
            f.write ( res )
            f.write ( '\n' )
        f.close ( )
        sc.close ( )
    bestk = 2
    for i in range ( m ) :
        for j in range ( n ) :
            maxk = min ( i , j ) + 1
            for k in range ( maxk , bestk + 1 , - 1 ) :
                tx = Tx [ i ] [ j ] - ( Tx [ i - k ] [ j ] )
                ty = Ty [ i ] [ j ] - ( Ty [ i - k ] [ j ] )
                if tx [ i ] >= k and ty [ j ] >= k :
                    bestk = k
                    break
    return bestk
