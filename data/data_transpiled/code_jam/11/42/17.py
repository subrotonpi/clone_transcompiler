def _import ( ) :
    from math import sin , cos , abs , abs , re , log
    class SolB2 ( object ) :
        def __init__ ( self ) :
            super ( SolB2 , self ).__init__ ( )
        def __call__ ( self , f ) :
            f = open ( self.FNAME + '.in' , 'r' )
            f.write ( '\n' )
            f.close ( )
            for i in range ( 0 , r ) :
                ddy = dy + ( f.read ( ) ) + f.read ( )
                if abs ( ddy ) > eps :
                    bad [ i ] [ j ] = True
            self.ddy += sumr [ i ] [ j ] * ( k - 1 ) / 2.0
            if not f.read ( ) :
                try :
                    f.readline ( )
                except :
                    self.eof = True
                    return "0"
            return f.readline ( )
        def __call__ ( self , f ) :
            f.readline ( )
            for i in range ( 0 , r ) :
                dy += sumr [ i ] [ j ] * ( i - 1 ) / 2.0
                sum += sumr [ i ] [ j ] * ( k - 1 ) / 2.0
                if abs ( ddy ) > eps :
                    bad [ i ] [ j ] = True
            return f.readline ( )
        def __call__ ( self , f ) :
            f.readline ( )
            for i in range ( 0 , r ) :
                for j in range ( 0 , c ) :
                    if not bad [ i ] [ j ] :
                        return "0"
            return f.readline ( )
    for i in range ( 0 , r ) :
        for j in range ( 0 , c ) :
            ddy = dy + ( f.read ( ) )
            if abs ( ddy ) > eps :
                bad [ i ] [ j ] = True
    for i in range ( 0 , r ) :
        for j in range ( 0 , c ) :
            if not bad [ i ] :
                return "0"
    for i in range ( 0 , r ) :
        for j in range ( 0 , c ) :
            if not bad [ i