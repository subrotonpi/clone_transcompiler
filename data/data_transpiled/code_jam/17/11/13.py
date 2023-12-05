def main ( ) :
    import sys
    from string import printable
    print ( printable )
    class A ( object ) :
        def __init__ ( self ) :
            self.T = sys.stdin.read ( )
    for t in range ( 1 , T + 1 ) :
        R , C = [ line.rstrip ( ) for line in printable.split ( '\n' ) ]
        mat = [ [ ] for _ in range ( R ) ]
        for line in printable.split ( '\n' ) :
            for c in range ( C ) :
                mat [ line.rstrip ( ) ].append ( c )
        for i in range ( R ) :
            prev = '-'
            for j in range ( C ) :
                if prev != '-' and mat [ i ] [ j ] == '?' :
                    mat [ i ] [ j ] = prev
                elif mat [ i ] [ j ] != '?' :
                    prev = mat [ i ] [ j ]
            prev = '-'
            for j in range ( C - 1 , - 1 , - 1 ) :
                if prev != '-' and mat [ i ] [ j ] == '?' :
                    mat [ i ] [ j ] = prev
                elif mat [ i ] [ j ] != '?' :
                    prev = mat [ i ] [ j ]
            for i in range ( 1 , R ) :
                for j in range ( C ) :
                    if mat [ i ] [ j ] == '?' :
                        mat [ i ] [ j ] = mat [ i - 1 ] [ j ]
            for i in range ( R - 1 , - 1 , - 1 ) :
                for j in range ( C ) :
                    if mat [ i ] [ j ] == '?' :
                        mat [ i ] [ j ] = mat [ i + 1 ] [ j ]
            print ( "Case #%d:" % t )
            print ( mat )
