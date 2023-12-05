def import __main__
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        self.K = int ( self.K )
        self.S = self.S
        self.dict = { }
        s = [ ]
        arr = [ 0 ] * ( N - K + 1 )
        for i in range ( 0 , N - K ) :
            if i == 0 :
                for j in range ( 0 , N ) :
                    arr [ self.S [ i ] - 'a' ] += 1
            else :
                arr [ self.S [ i - 1 ] - 'a' ] -= 1
                arr [ self.S [ i + K - 1 ] - 'a' ] += 1
            s.append ( " ".join ( arr ) )
            if self.dict.has_key ( s [ i ] ) :
                self.dict [ s [ i ] ] = max ( self.dict [ s [ i ] ] , i )
            else :
                self.dict [ s [ i ] ] = i
        for i in range ( 0 , N - K ) :
            if self.dict [ s [ i ] ] - i >= K :
                self.print ( "YES" )
                return
        self.print ( "NO" )
