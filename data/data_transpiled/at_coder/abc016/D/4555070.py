def _ import _
class Main ( object ) :
    def __init__ ( self ) :
        self.ax = 0
        self.ay = 0
        self.bx = 0
        self.by = 0
        self.n = 0
    def __call__ ( self , x , y ) :
        x = x [ 0 ]
        y = y [ 0 ]
        ans = 0
        for i in range ( n ) :
            x [ i ] , y [ i ] = x [ i ] , y [ i ]
            if i == 0 :
                continue
            if Check ( x [ i - 1 ] , y [ i - 1 ] , x [ i ] , y [ i ] ) :
                ans += 1
        if Check ( x [ 0 ] , y [ 0 ] , x [ n - 1 ] , y [ n - 1 ] ) :
            ans += 1
        print ( ( ans / 2 ) + 1 )
        self.ans = ans
    def Check ( self , px , py , qx , qy ) :
        t1 = ( ( py - ay ) * ( bx - ax ) - ( px - ax ) * ( by - ay ) )
        t2 = ( ( qy - ay ) * ( bx - ax ) - ( qx - ax ) * ( by - ay ) )
        t3 = ( ( ay - py ) * ( qx - px ) - ( ax - px ) * ( qy - py ) )
        t4 = ( ( by - py ) * ( qx - px ) - ( bx - px ) * ( qy - py ) )
        return t1 * t2 < 0 and t3 * t4 < 0
