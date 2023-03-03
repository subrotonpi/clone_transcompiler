def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    n = len ( sys.stdin )
    m = len ( sys.stdin )
    a = [ ]
    b = [ ]
    for i in range ( n ) :
        a.append ( sys.stdin.read ( ) )
    for i in range ( m ) :
        b.append ( sys.stdin.read ( ) )
    for i in range ( 0 , n - m ) :
        outer :
            for j in range ( 0 , n - m ) :
                for k in range ( m ) :
                    for l in range ( m ) :
                        if a [ i + k ] [ j + l ] != b [ k ] [ l ] :
                            continue outer
            print ( "Yes" )
            return
    print ( "No" )
    sys.exit ( 1 )
