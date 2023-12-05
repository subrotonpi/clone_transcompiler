def import _a
class a ( object ) :
    def __init__ ( self ) :
        self.T = int ( self.T )
        for t in range ( 1 , T + 1 ) :
            print ( "Case #%d: " % t , end = "" )
            n = self.T
            print ( go ( n ) )
    def lowerHalf ( x , mid = False , l = 1 ) :
        x = ( x + "" ) [ len ( "" ) : ]
        if len ( x ) <= l / 2 :
            return x
        return long ( ( x + "" ) [ len ( "" ) : ] + ( 0 if mid or x % 2 == 0 else 1 ) )
    def go ( x ) :
        if x % 10 == 0 :
            return 1 + go ( x - 1 )
        if x <= 10 :
            return x
        pow = 1
        while pow * 10 <= x :
            pow *= 10
        res = go ( pow - 1 ) + 1
        lower = lowerHalf ( x , True , ( x + "" ) [ len ( "" ) : ] )
        upper = lowerHalf ( rev ( x ) , False , ( x + "" ) [ len ( "" ) : ] )
        res += lower + upper - 1
        if upper != 1 :
            res += 1
        return res
    def sum ( x ) :
        res = 0
        while x > 0 :
            res += x % 10
            x /= 10
        return res
    def rev ( x ) :
        res = 0
        while x > 0 :
            res *= 10
            res += x % 10
            x /= 10
        return res
