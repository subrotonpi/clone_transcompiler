def import _solve
class Main ( object ) :
    def __init__ ( self , X , Y , W ) :
        ( self.X , Y , W ) = X
        self.Y = Y
        self.T = self.T
    def solve ( self ) :
        cin = sys.stdin
        T = cin.read ( )
        for C in range ( 1 , T + 1 ) :
            H , W = cin.read ( )
            self.map = [ ]
            for s in cin.read ( ).split ( ) :
                for j in range ( W ) :
                    self.map [ i ].append ( s [ j ] )
            print ( "Case #%d: %s" % ( C , solve ( self , H , W ) ) )
    def solve ( self , H , W ) :
        ret = 0
        for i in range ( H ) :
            MAIN :
                for j in range ( W ) :
                    if self.map [ i ] [ j ] == '>' :
                        for k in range ( j + 1 , W ) :
                            if self.map [ i ] [ k ] != '.' :
                                continue
                    elif self.map [ i ] [ j ] == 'v' :
                        for k in range ( i + 1 , H ) :
                            if self.map [ k ] [ j ] != '.' :
                                continue
                    elif self.map [ i ] [ j ] == '^' :
                        for k in range ( i - 1 , H ) :
                            if self.map [ k ] [ j ] != '.' :
                                continue
                    elif self.map [ i ] [ j ] == '<' :
                        for k in range ( j - 1 , W ) :
                            if self.map [ i ] [ k ] != '.' :
                                continue
                    elif self.map [ i ] [ j ] == '.' :
                        continue
                    else :
                        raise "invalid input: " + self.map [ i ] [ j ]
                    if self.find ( self , i , j , H , W ) :
                        ret += 1
                    else :
                        return "IMPOSSIBLE"
                        