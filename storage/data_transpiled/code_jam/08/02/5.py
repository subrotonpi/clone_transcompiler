def main_B ( ar , done , start , thres ) :
    global A , B , Bp , AT , Bp
    for i in range ( start , len ( ar ) ) :
        if not done [ i ] and ar [ i ] [ 0 ] >= thres :
            return i
    def main ( args ) :
        with open ( 'B-large.in' , 'r' ) as infile :
            with open ( 'B-large.out' , 'w' ) as outfile :
                cas = infile.read ( )
                for iii in range ( cas ) :
                    T = infile.read ( )
                    NA = infile.read ( )
                    NB = infile.read ( )
                    A = [ ]
                    B = [ ]
                    AT = [ ]
                    BT = [ ]
                    AT.append ( False )
                    BT.append ( False )
                    for i in range ( NA ) :
                        temp = infile.read ( ).strip ( ).split ( ':' )
                        A.append ( 60 * int ( temp [ 0 ] ) + int ( temp [ 1 ] ) )
                        temp = infile.read ( ).strip ( ).split ( ':' )
                        B.append ( 60 * int ( temp [ 0 ] ) + int ( temp [ 1 ] ) )
                    for i in range ( NB ) :
                        if A [ i ] [ 0 ] > A [ i ] [ 0 ] or ( A [ i ] [ 0 ] == A [ i ] [ 1 ] and A [ i ] [ 1 ] > A [ i ] [ 1 ] ) :
                            temp = A [ i ] [ 0 ]
                            A [ i ] = temp [ i ] [ 1 ]
    return main
