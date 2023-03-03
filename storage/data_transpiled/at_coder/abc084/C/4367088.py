def Main ( ) :
    global _sys
    global _sys
    n = _sys.getrecursionlimit ( )
    c , s , f = [ _sys.getrecursionlimit ( ) for _ in range ( n - 1 ) ]
    for i , time in enumerate ( [ 0 , 1 ] ) :
        for j in range ( i , n - 1 ) :
            time = max ( s [ j ] , time % f [ j ] or time + f [ j ] - time % f [ j ] ) + c [ j ]
        print ( time )
    print ( 0 )
