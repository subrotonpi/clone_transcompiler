def __main ( ) :
    from os import getenv
    from os.path import join
    from os import sep
    from os.path import join
    from os.path import expanduser
    from os.path import join
    from os.path import join
    n = int ( join ( getenv ( 'PATH' , '' ) , '' ) )
    goal = join ( join ( expanduser ( 'PATH' ) , '' ) , join ( expanduser ( 'PATH' ) , '' ) )
    generate ( 'SS' , goal )
    generate ( 'WS' , goal )
    generate ( 'SW' , goal )
    generate ( 'WW' , goal )
    print ( - 1 )
    def generate ( prefix , goal ) :
        ret = [ prefix , prefix ]
        for i in range ( 2 , len ( ret ) ) :
            if ret [ i - 1 ] == 'S' :
                if goal [ i - 1 ] == 'o' :
                    ret [ i ] = ret [ i - 2 ]
                else :
                    ret [ i ] = ord ( 'S' ) + ord ( 'W' ) - ret [ i - 2 ]
            else :
                if goal [ i - 1 ] == 'x' :
                    ret [ i ] = ret [ i - 2 ]
                else :
                    ret [ i ] = ord ( 'S' ) + ord ( 'W' ) - ret [ i - 2 ]
        if is_consistent ( ret , goal ) :
            print ( join ( ret , goal ) )
            sys.exit ( )
    def is_consistent ( l , s ) :
        for i in range ( len ( l ) ) :
            lhs = ( i + len ( l ) - 1 ) % len ( l )
            rhs = ( i + 1 ) % len ( l )
            if l [ i ] == 'S' :
                if s [ i ] == 'o' and l [ lhs ] != l [ rhs ] :
                    return False
                if s [ i ] == 'x' and l [ lhs ] == l [ rhs ] :
                    return False
            else :
                if s [ i ] == 'o' and l [ lhs ] == l [ rhs ] :
                    return False
        return True
    return generate ( )
