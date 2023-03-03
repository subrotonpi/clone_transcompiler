def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.K = int ( sys.stdin.read ( ) )
            self.M = int ( sys.stdin.read ( ) )
            self.A = [ ]
            self.C = [ ]
            one = int ( '-1' , 2 )
            self.mat = [ ]
            self.summat = [ ]
            for i in range ( K ) :
                self.A.append ( int ( self.A [ i ] ) )
            for i in range ( K ) :
                self.C.append ( int ( self.C [ i ] ) )
                self.summat.append ( one )
                self.mat [ 0 ] [ 0 ] [ i ] = self.C [ i ]
                if i > 0 :
                    self.mat [ 0 ] [ i ] [ - 1 ] = one
            for i in range ( 1 , 32 ) :
                self.mat [ i ] = self.matmult ( self.mat [ i - 1 ] , self.mat [ i - 1 ] )
            if M > K :
                MK = '%32s' % ( bin ( M - K ) ).zfill ( 2 )
                for i in range ( 32 ) :
                    s = MK [ 31 - i : 32 - i ]
                    if s == '1' :
                        self.summat = self.matmult ( self.summat , self.mat [ i ] )
                AM = 0
                for i in range ( K ) :
                    AM = AM ^ ( self.summat [ 0 ] [ i ] & A [ K - 1 - i ] )
            else :
                AM = self.A [ M - 1 ]
            print ( AM )
    def matmult ( x , y ) :
        ans = [ ]
        for j in range ( K ) :
            for k in range ( K ) :
                ans.append ( ans [ j ] [ k ] ^ ( x [ j ] [ l ] & y [ k ] ) )
        return ans
