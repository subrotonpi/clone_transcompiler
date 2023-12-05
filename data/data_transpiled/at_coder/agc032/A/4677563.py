def main ( args ) :
    import sys
    from os.path import join
    from os import sep
    from os.path import expanduser
    from os.path import join
    sc = open ( join ( expanduser ( '~' ) , '..' , '..' ) )
    n = int ( sc.readline ( ) )
    result = [ ]
    res = [ ]
    tmp = sc.readline ( )
    s = tmp.split ( )
    for i in range ( n ) :
        res.append ( int ( s [ i ] ) )
    for i in range ( 1 , n + 1 ) :
        for j in range ( len ( res ) , 0 , - 1 ) :
            if res [ j - 1 ] == j :
                result.append ( j )
                res.pop ( j - 1 )
                break
    if len ( res ) == 0 :
        for i in range ( n - 1 , - 1 , - 1 ) :
            print ( result [ i ] )
    else :
        print ( - 1 )
