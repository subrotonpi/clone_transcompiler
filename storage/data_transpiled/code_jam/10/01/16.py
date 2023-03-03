def _import ( ) :
    import sys
    with open ( 'A.txt' , 'r' ) as f :
        T = len ( f.readlines ( ) )
        for t in range ( T ) :
            N , k = len ( f.readlines ( ) ) , len ( f.readlines ( ) )
            stat = ( ( k + 1 ) & ( ( 1 << N ) - 1 ) ) == 0
            print ( 'Case #%d: %s' % ( 1 + t , 'ON' if stat else 'OFF' ) )
