def import import sys , string , ** kwargs ) :
    from magic import magic
    with open ( 'magic.in' , 'r' ) as infile :
        a = int ( infile.readline ( ) )
        for i in range ( a ) :
            row = int ( infile.readline ( ) )
            data = [ ]
            rows = { }
            for j in range ( 1 , 5 ) :
                arr = infile.readline ( ).split ( )
                for s in arr :
                    rows [ s ] = j
                    data.append ( s )
            row2 = int ( infile.readline ( ) )
            rows2 = { }
            for j in range ( 1 , 5 ) :
                arr = infile.readline ( ).split ( )
                for s in arr :
                    rows2 [ s ] = j
            sols = [ ]
            for s in data :
                if rows [ s ] == row and rows2 [ s ] == row2 :
                    sols.append ( s )
            if len ( sols ) == 0 :
                print ( 'Case #{}: Volunteer cheated!'.format ( i + 1 ) )
            else :
                if len ( sols ) == 1 :
                    print ( 'Case #{}: {}'.format ( i + 1 , sols [ 0 ] ) )
                else :
                    print ( 'Case #{}: Bad magician!'.format ( i + 1 ) )
