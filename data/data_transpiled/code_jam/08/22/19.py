def main ( args ) :
    import sys
    class B ( object ) :
        def __init__ ( self ) :
            self.prime = [ ]
            ps = 0
            self.prime.append ( 2 )
            MAIN : for i in range ( 3 , 1000 , 2 ) :
                for j in range ( ps ) :
                    if i % self.prime [ j ] == 0 :
                        continue
                self.prime [ ps ] = i
        def contain ( i , j , p ) :
            for a in range ( ps ) :
                if self.prime [ a ] < p :
                    continue
                if self.prime [ a ] > i :
                    return False
                if i % self.prime [ a ] == 0 and j % self.prime [ a ] == 0 :
                    return True
            return False
        def ans ( a , b , p ) :
            own = [ i for i in range ( a , b + 1 ) ]
            for j in range ( a , i + 1 ) :
                if contain ( j , i , p ) :
                    over = own [ j ]
                    for k in range ( a , i + 1 ) :
                        if own [ k ] == over :
                            own [ k ] = i
            h = set ( own )
            for i in range ( a , b + 1 ) :
                h.add ( own [ i ] )
            return h
        def exec ( self ) :
            with open ( "input.txt" , "r" ) as cin :
                self.init ( )
                z = cin.read ( )
                for a , s , t , p in zip ( z , s , t , p ) :
                    print ( "Case #%d: %d" % ( a + 1 , ans ( s , t , p ) ) )
