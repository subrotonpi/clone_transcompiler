def import _scanner
class D ( object ) :
    def __init__ ( self ) :
        self.T = int ( self.T )
        for case in range ( 1 , T + 1 ) :
            super ( D , self ).__init__ ( )
    A1 , A2 , B1 , B2 = _scanner ( )
    def win ( a , b ) :
        if b > a :
            t = b
            b = a
            a = t
        if a >= 2 * b :
            return True
        if b == 0 :
            return True
        return not win ( b , a - b )
    def minfalse ( N ) :
        a = 1
        b = N
        while a < b :
            c = ( a + b ) // 2
            if win ( c , N ) :
                a = c + 1
            else :
                b = c
        return a
    def maxfalse ( N ) :
        a = N
        b = 2 * N
        while a < b :
            c = ( a + b + 1 ) // 2
            if win ( c , N ) :
                b = c - 1
            else :
                a = c
        return a
    def go ( self ) :
        ans = 0
        for a in range ( A1 , A2 + 1 ) :
            minf = minfalse ( a )
            maxf = maxfalse ( a )
            if B1 < minf :
                ans += min ( B2 , minf - 1 ) - B1 + 1
            if B2 > maxf :
                ans += B2 - max ( B1 , maxf + 1 ) + 1
        print ( "Case #%d: %d" % ( self.CASE , ans ) )
return D ( )
