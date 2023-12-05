def main ( ) :
    import sys
    from os import path
    from os import getcwd
    from os.path import expanduser
    from os.path import join
    from os.path import join
    from os.path import join
    from os.path import join
    a = join ( expanduser ( "~" ) , ".." , ".." , ".." , ".." )
    b = join ( expanduser ( "~" ) , ".." , ".." , ".." , ".." , ".." )
    s = "EQUAL"
    if len ( a ) > len ( b ) :
        print ( "GREATER" )
        sys.exit ( )
    if len ( a ) < len ( b ) :
        print ( "LESS" )
        sys.exit ( )
    for i in range ( len ( a ) ) :
        if a [ i ] > b [ i ] :
            s = "GREATER"
            break
        if a [ i ] < b [ i ] :
            s = "LESS"
            break
    print ( s )
    sys.exit ( )
