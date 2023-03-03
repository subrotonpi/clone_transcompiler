def code_pyam_Qualifier_B ( A , B ) :
    def hash ( A , B ) :
        o = A - 'A'
        s = B - 'A'
        return o * 1000 + s
    def main ( ) :
        input = [ ]
        T = input.count ( '[' )
        for t in range ( 1 , T + 1 ) :
            C = input.count ( ', ' )
            combin = [ input.next ( ) for i in range ( C ) ]
            D = input.count ( ', ' )
            death = [ input.next ( ) for i in range ( D ) ]
            input.append ( input.next ( ) )
            s = input.next ( )
            X = { }
            Y = { }
            for i in range ( C ) :
                X [ hash ( combin [ i ] [ 0 ] , combin [ i ] [ 1 ] ) ] = zerg ( combin [ i ] [ 2 ] , False )
                X [ hash ( combin [ i ] [ 1 ] , combin [ i ] [ 0 ] ) ] = zerg ( combin [ i ] [ 2 ] , False )
            for i in range ( D ) :
                Y [ hash ( death [ i ] [ 0 ] , death [ i ] [ 1 ] ) ] = zerg ( 'x' , True )
                Y [ hash ( death [ i ] [ 1 ] , death [ i ] [ 0 ] ) ] = zerg ( 'x' , True )
        return 0
    for i in range ( 1 , T + 1 ) :
        one = hash ( i )
        two = hash ( i )
        if i in Y :
            Y [ i ] = Y [ i ]
        else :
            Y [ i ] = [ ]
    return 1
