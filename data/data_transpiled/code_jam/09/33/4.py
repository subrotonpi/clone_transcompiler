def code_pyamC ( ) :
    import sys
    try :
        f = open ( "/proc/net/code/pyamC.txt" , "r" )
    except ( IOError , OSError ) :
        pass
    else :
        total = sum ( 1 for line in f.readlines ( ) if line.startswith ( "#" ) )
        for n in range ( 1 , total + 1 ) :
            line = f.readline ( )
            line = line.split ( )
            p = int ( line [ 0 ] )
            q = int ( line [ 1 ] )
            a = [ ]
            line = f.readline ( )
            line = line.split ( )
            for i in range ( q ) :
                a.append ( int ( line [ 0 ] ) )
            a.append ( 0 )
            a.append ( p + 1 )
            a.sort ( )
            b = [ [ ] for _ in range ( len ( a ) ) ]
            for len in range ( 1 , len ( a ) - 2 ) :
                for start in range ( 1 , len ( a ) ) :
                    if len ( a ) == 1 :
                        b [ len ] [ start ] = a [ start + 1 ] - a [ start - 1 ] - 2
                    else :
                        min = sys.maxint
                        for left in range ( 0 , len ( a ) - 1 ) :
                            min = min ( min , b [ left ] [ start ] + b [ len ( a ) - left - 1 ] [ start + left + 1 ] )
                        b [ len ] [ start ] = min + ( a [ start + len ] [ start ] - a [ start - 1 ] - 2 )
            print ( "Case #%d: %s" % ( n , b [ len ( a ) - 2 ] [ 1 ] ) )
