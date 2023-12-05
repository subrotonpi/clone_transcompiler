def import _solve
class B ( object ) :
    def __init__ ( self , T ) :
        self.T = T
        for i in range ( 1 , T + 1 ) :
            print ( "Case #%d: %d\n" % ( i , self.solve ( ) ) )
    def solve ( self ) :
        D = self.D
        P = [ self.P [ i ] for i in range ( D ) ]
        ans = 9999
        for i in range ( 1 , 1000 + 1 ) :
            move = 0
            len = 0
            for j in range ( D ) :
                if P [ j ] <= i :
                    len = max ( len , P [ j ] )
                else :
                    move += ( P [ j ] - 1 ) / i
                    len = i
            ans = min ( ans , move + len )
        return ans
