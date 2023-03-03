def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self , Y , time , used , pos , S , count , N ) :
            ( self , Y , time , pos , S , count , N ) = sys.stdin.read ( )
            self.solve ( )
    def solve ( self , Y , time , used , pos , S , count , N ) :
        with open ( "input.txt" , "r" ) as cin :
            T = cin.read ( )
        for C in range ( 1 , T + 1 ) :
            Y , N , pos , S = cin.read ( )
            ans = float ( "inf" )
            self.solve ( 0 , Y , 0 , [ ] , pos , S [ : N ] )
            print ( "Case #%d: %f" % ( C , ans ) )
    def solve ( self , Y , time , used , pos , S , count , N ) :
        if count == N :
            ans = min ( ans , time )
            return ans
        Lmin = float ( "inf" )
        Rmin = float ( "inf" )
        Lindex = - 1
        Rindex = - 1
        for i in range ( N ) :
            if used [ i ] :
                continue
            if pos [ i ] < 0 :
                Lcand = ( self - ( pos [ i ] - time * S [ i ] ) ) / ( Y - S [ i ] )
                if Lcand < Lmin :
                    Lmin = Lcand
                    Lindex = i
            else :
                Rcand = ( ( pos [ i ] + time * S [ i ] ) - self ) / ( Y - S [ i ] )
                if Rcand < Rmin :
                    Rmin = Rcand
                    Rindex = i
        if Lindex >= 0 :
            used [ Lindex ] = True
            self.solve ( self - Lmin * Y , Y , time + Lmin , used , pos , S , count + 1 , N )
            used [ Lindex ] = False
        if Rindex >= 0 :
            used [ Rindex ] = True
            self.solve ( )
    return
