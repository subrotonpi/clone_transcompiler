def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    sc = iter ( sys.stdin )
    n = sc.__next__ ( )
    c = sc.__next__ ( )
    sh = [ False ] * ( n + 2 )
    for z in range ( 4 ) :
        sh [ 0 ] = ( z & 1 ) == 0
        sh [ 1 ] = ( z & 2 ) == 0
        for i in range ( 2 , n + 2 ) :
            sh [ i ] = sh [ i - 1 ] ^ sh [ i - 2 ] ^ c [ ( i - 1 ) % n ] == 'o'
        if sh [ n ] == sh [ 0 ] and sh [ n + 1 ] == sh [ 1 ] :
            put ( sh )
            return
    print ( - 1 )
    def put ( sh ) :
        for i in range ( len ( sh ) - 2 ) :
            print ( 'S' if sh [ i ] else 'W' , end = '' )
        print ( )
