def import FS , FS , FS , File , FS , FileType , FileType , FileType , FileType , * , iter , ** kwargs ) :
    sc = FS ( File ( "B-large.in" ) )
    f = open ( File ( "b.out" ) , "w" )
    cc = 0
    t = sc.__next__ ( )
    while t :
        n = sc.__next__ ( )
        con = [ ]
        for i in range ( ( n ** 2 - 1 ) * n ) :
            k = sc.__next__ ( )
            con.append ( not con [ k ] )
        f.write ( "Case #%d:" % ( cc ++ ) )
        for i in range ( 2501 ) :
            if con [ i ] :
                f.write ( " %d" % i )
        f.write ( "\n" )
    f.close ( )
    class FS ( File ) :
        def read ( self , f ) :
            f.seek ( 0 )
            f.readline ( )
            f.seek ( 0 )
            f.readline ( )
            f.readline ( )
            f.close ( )
        def readline ( self ) :
            if f.readline ( ) : return f.readline ( )
            f.readline ( )
            f.close ( )
            return f.readline ( )
        def readline ( self ) :
            if f.readline ( ) : return f.readline ( )
            f.readline ( )
            f.close ( )
            return f.readline ( )
        def readline ( self ) :
            return int ( f.readline ( ) )
    return FS , sc , f
