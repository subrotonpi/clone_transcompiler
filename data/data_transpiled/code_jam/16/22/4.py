def _import ( * os ) :
    import sys
    import os
    import sys
    import io
    import sys
    class B :
        def read ( ) :
            A , B = os.read ( ).split ( '.' )
            n = len ( A )
        def get ( i , A , c ) :
            res = ''
            for j in range ( i , len ( A ) ) :
                if A [ j ] == '?' :
                    res += c
                else :
                    res += A [ j ]
            return res
        def run ( ) :
            caseN = sc.randint ( 1 , n )
            for i in range ( 0 , caseN ) :
                print ( 'Case #%d: ' % ( caseN ) )
                solve ( )
    def update ( a , b ) :
        diff = abs ( int ( a ) - int ( b ) )
        if min > diff or min == diff and ( ra > a or ra == a and rb > b ) :
            min = diff
            ra = a
            rb = b
    def solve ( ) :
        min = int ( a )
        a , b = '' , ''
        for i in range ( 0 , n ) :
            if i == n :
                ra = a
                rb = b
                break
            if A [ i ] == '?' and B [ i ] == '?' :
                update ( a + '1' + get ( i + 1 , A , '0' ) , b + '0' + get ( i + 1 , B , '9' ) )
                update ( a + '0' + get ( i + 1 , A , '9' ) , b + '1' + get ( i + 1 , B , '0' ) )
                a += '0'
                b += '0'
            elif A [ i ] == '?' :
                if B [ i ] != '9' :
                    update ( a + chr ( B [ i ] + 1 ) + get ( i + 1 , A , '0' ) , b + B [ i ] + get ( i + 1 , B , '9' ) )
                if B [ i ] != '0' :
                    update ( a + chr ( B [ i ] - 1 ) + get ( i + 1 , A , '9' ) , b + B [ i ] + get (