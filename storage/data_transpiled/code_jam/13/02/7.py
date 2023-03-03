def qualification.lawnmower ( N , M , map , f , n ) :
    possible = True
    x_max = [ ]
    y_max = [ ]
    for x in range ( N ) :
        for y in range ( M ) :
            if x_max [ x ] < map [ x ] [ y ] :
                x_max.append ( map [ x ] [ y ] )
            if y_max [ y ] < map [ x ] [ y ] :
                y_max.append ( map [ x ] [ y ] )
    for x in range ( N ) :
        for y in range ( M ) :
            if map [ x ] [ y ] != min ( x_max [ x ] , y_max [ y ] ) :
                possible = False
        f.write ( "Case #%d: %s\n" % ( n , "YES" if possible else "NO" ) )
    def calculate ( i ) :
        input_file = open ( "inputfiles/qualification/lawnmower/input.txt" , "r" )
        fr = csv.reader ( input_file )
        nb_tests = int ( fr [ 0 ] )
        output_file = open ( "inputfiles/qualification/lawnmower/output.txt" , "w" )
        output_file.close ( )
        output_file.write ( "\n" )
        for i in range ( nb_tests ) :
            nm = fr [ 0 ].split ( )
            N = int ( nm [ 0 ] )
            M = int ( nm [ 1 ] )
            map = [ ]
            for x in range ( N ) :
                squares = fr [ x ].split ( )
                for y in range ( M ) :
                    map.append ( [ int ( squares [ y ] ) ] )
            for squares in squares :
                map.append ( [ int ( squares [ x ] ) , int ( squares [ y ] ) ] )
    calculate ( i )
