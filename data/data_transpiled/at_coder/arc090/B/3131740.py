def _ _ main _ _ ( ) : return 33
class Main ( object ) :
    def __init__ ( self , ptr ) :
        super ( Main , self ).__init__ ( ptr )
    def __init__ ( self , ptr ) :
        super ( Main , self ).__init__ ( ptr )
    def read ( self ) :
        sc = FastScanner ( )
        n = sc.__next__ ( )
        m = sc.__next__ ( )
        al = [ ]
        pos = [ ]
        for i in range ( n ) :
            al.append ( [ ] )
            pos.append ( int ( i ) )
        for i in range ( m ) :
            l = sc.__next__ ( ) - 1
            r = sc.__next__ ( ) - 1
            d = sc.__next__ ( )
            al [ l ].append ( [ r , d ] )
            al [ r ].append ( [ l , - d ] )
        ret = True
        for i in range ( n ) :
            if len ( al [ i ] ) != 0 :
                if pos [ i ] == int ( i ) :
                    pos [ i ] = 0
                ret = bfs ( i , 0 )
            if not ret :
                break
        if ret :
            print ( "Yes" )
        else :
            print ( "No" )
    def bfs ( i , p ) :
        if len ( al [ i ] ) == 0 :
            return True
        while len ( al [ i ] ) > 0 :
            tmp = next ( al [ i ] )
            if pos [ tmp [ 0 ] ] == int ( i ) :
                pos [ tmp [ 0 ] ] = p + tmp [ 1 ]
            elif pos [ tmp [ 0 ] ] != p + tmp [ 1 ] :
                return False
            if not bfs ( tmp [ 0 ] , p + tmp [ 1 ] ) :
                return False
        return True
