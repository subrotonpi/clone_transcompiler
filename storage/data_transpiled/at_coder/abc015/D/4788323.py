def import _screen_shot
class Main ( object ) :
    def __init__ ( self , index , width , value ) :
        self.index = index
        self.width = width
        self.value = value
    def __init__ ( self , index , width , value ) :
        self.index = index
        self.width = width
        self.value = value
class Main ( object ) :
    def __init__ ( self , W , N , K ) :
        self.W = W
        self.N = N
        self.K = K
        self.ss = [ ]
        self.totalval = [ ]
        for i in range ( 0 , N ) :
            for j in range ( 0 , W ) :
                for l in range ( 0 , K ) :
                    self.totalval.append ( [ i , j , l ] )
        for i in range ( 1 , N ) :
            self.ss.append ( ( i , self.width , self.value ) )
        print ( self.dfs ( N , W , K ) )
    def dfs ( self , depth , totalwidth , totalnum ) :
        if totalwidth > W or totalwidth <= 0 :
            return 0
        if totalnum > K or totalnum <= 0 :
            return 0
        if depth <= 0 :
            return 0
        a = 0
        b = 0
        if self.totalval [ depth ] [ 0 ] >= 0 and self.totalval [ depth ] [ 0 ] == - 1 :
            self.totalval [ depth ] [ 0 ] = self.totalval [ depth ] [ 0 ] + self.totalval [ depth ] [ 0 ]
        else :
            a = ( self.totalval [ depth ] [ 0 ] <= self.totalval [ depth ] [ 0 ] )
        if self.totalval [ depth ] [ 0 ] >= 0 and self.totalval [ depth ] [ 0 ] >= 0 and self.totalval [ depth ] [ 0 ] <= self.totalval [ depth ] [ 0 ] :
            self.totalval [ depth ] [ 0 ] = self.totalval [ depth ] [ 0 ] + self.totalval [ depth ] [ 0 ]
