def _import ( ) :
    from os import getenv
    from os import getenv
    from os import getenv
    class B :
        def get_int ( f ) :
            return int ( getenv ( 'FILE' ) )
        def get_ins ( f ) :
            words = getenv ( 'FILE' ).split ( '' )
            ret = [ ]
            for i in range ( 1 , len ( words ) ) :
                w = getenv ( 'FILE' ).split ( '' )
                out.write ( 'Case #%d: %s\n' % ( t , compute ( w [ 0 ] , w [ 1 ] ) ) )
            return ret
        def rep ( A , i , c , d ) :
            res = A + [ c ]
            for j in range ( i + 1 , len ( A ) ) :
                if res [ j ] == '?' :
                    res [ j ] = d
            return ''.join ( res )
        def compute ( a , b ) :
            N = len ( a )
            A = a [ : N ]
            B = b [ : N ]
            sol = [ ]
            for i in range ( N ) :
                if A [ i ] == '?' :
                    if B [ i ] == '?' :
                        sol.append ( rep ( A , i , '1' , '0' ) )
                        sol.append ( rep ( B , i , '0' , '9' ) )
                        sol.append ( rep ( A , i , '0' , '9' ) )
                        A [ i ] = B [ i ] = '0'
                    else :
                        if B [ i ] < '9' :
                            sol.append ( rep ( A , i , ord ( B [ i ] ) + 1 , '0' ) )
                        if B [ i ] > '0' :
                            sol.append ( rep ( A , i , ord ( B [ i ] ) - 1 , '9' ) )
                        A [ i ] = B [ i ]
                else :
                    if B [ i ] == '?' :
                        if A [ i ] < '9' :
                            sol.append ( rep ( A , i , ord ( A [ i ] ) , '0' ) )
                        A [ i ] = '0'
            return sol
    return B
