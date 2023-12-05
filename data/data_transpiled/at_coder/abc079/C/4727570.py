def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            N = sc.readline ( )
            sc.close ( )
    S = N.split ( '' )
    n = [ int ( i ) for i in S ]
    if n [ 0 ] + n [ 1 ] + n [ 2 ] + n [ 3 ] == 7 :
        print ( n [ 0 ] , n [ 1 ] , n [ 2 ] , n [ 3 ] , '=7' )
        sys.exit ( 0 )
    if n [ 0 ] + n [ 1 ] + n [ 2 ] - n [ 3 ] == 7 :
        print ( n [ 0 ] , n [ 1 ] , n [ 2 ] , '-' , n [ 3 ] , '=7' )
        sys.exit ( 0 )
    if n [ 0 ] + n [ 1 ] - n [ 2 ] + n [ 3 ] == 7 :
        print ( n [ 0 ] , n [ 1 ] , n [ 2 ] , '-' , n [ 3 ] , '=7' )
        sys.exit ( 0 )
    if n [ 0 ] - n [ 1 ] + n [ 2 ] - n [ 3 ] == 7 :
        print ( n [ 0 ] , n [ 1 ] , n [ 2 ] , '-' , n [ 3 ] , '=7' )
        sys.exit ( 0 )
    if n [ 0 ] - n [ 2 ] + n [ 3 ] == 7 :
        print ( n [ 0 ] , n [ 1 ] , n [ 2 ] , '-' , n [ 3 ] , '=7' )
        sys.exit ( 0 )
