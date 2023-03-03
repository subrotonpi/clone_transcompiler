def main ( ) :
    import sys
    class B ( object ) :
        def __init__ ( self ) :
            self._exit = 0
    oo = int ( 1e9 )
    R , C = [ ] , [ ]
    E = [ [ ] for i in range ( 100 ) ]
    L = [ [ ] for i in range ( 100 ) ]
    def B ( ) :
        with open ( '/dev/null' , 'r' ) as f :
            for T , ds in [ ( 0 , 1 ) , ( 1 , 2 ) , ( 2 , 3 ) , ( 3 , 4 ) ] :
                R , C = [ int ( i ) for i in f.read ( ) ]
                for i in range ( R ) :
                    for j in range ( C ) :
                        E.append ( i )
                        L.append ( j )
                sink = 'a'
                for i in range ( R ) :
                    for j in range ( C ) :
                        if L [ i ] [ j ] == 0 :
                            c = get_letter ( i , j , ord ( 'a' ) )
                            if c == 0 :
                                get_letter ( i , j , sink )
                        sink += 1
                print ( 'Case #%d:' % ds )
                for i in range ( R ) :
                    print ( )
                    for j in range ( C ) :
                        print ( '%c ' % L [ i ] [ j ] , end = ' ' )
        dr , dc = [ - 1 , 0 , 0 , 1 ] , [ 0 , - 1 , 1 , 0 ]
        def get_letter ( r , c , ch ) :
            if L [ r ] [ c ] > 0 :
                return L [ r ] [ c ]
            min = oo
            min_d = - 1
            for d in range ( 4 ) :
                nr , nc = r + dr [ d ] , c + dc [ d ]
                if ok ( nr , nc ) :
                    if E [ nr ] [ nc ] < E [ r ] [ c ] < min :
                        min = E [ nr ] [ nc ]
                        min_d = d
            return min
    return B ( )
