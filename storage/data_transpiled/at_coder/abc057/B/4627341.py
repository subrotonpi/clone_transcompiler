def main ( ) :
    import sys
    from os.path import join
    from os import sep
    from os.path import expanduser
    from os.path import join
    input = open ( join ( expanduser ( '~' ) , '..' ) )
    tokens = input.readline ( ).split ( )
    n = int ( tokens [ 0 ] )
    m = int ( tokens [ 1 ] )
    studant = [ ]
    check_point = [ ]
    for i in range ( n ) :
        tokens = input.readline ( ).split ( )
        studant.append ( ( int ( tokens [ 0 ] ) , int ( tokens [ 1 ] ) ) )
    for i in range ( m ) :
        tokens = input.readline ( ).split ( )
        check_point.append ( ( int ( tokens [ 0 ] ) , int ( tokens [ 1 ] ) ) )
    if len ( studant ) == 1 :
        x = 0
        out = None
        index = 0
        for i in range ( n ) :
            dis = studant [ i ].get_distance ( check_point [ i ] )
            if dis < x :
                x = dis
                out = check_point [ i ]
                index = j + 1
            elif dis == x and check_point [ i ].i_am_smaller ( out ) :
                x = dis
                out = check_point [ i ]
                index = j + 1
        output = [ ]
        for i in range ( n ) :
            x = int ( x )
            out = None
            index = 0
            for j in range ( m ) :
                dis = studant [ i ].get_distance ( check_point [ j ] )
                if dis < x :
                    x = dis
                    out = check_point [ j ]
                    index = j + 1
                elif dis == x and check_point [ j ].i_am_smaller ( out ) :
                    x = dis
                    out = check_point [ j ]
                    index = j + 1
            output.append ( "%d\n" % index )
        sys.stdout.write ( "\n".join ( output ) )
    class Pair :
        def __init__ ( self , x , y ) :
            self.x = x
            self.y = y
        def i_am_smaller ( self ) :