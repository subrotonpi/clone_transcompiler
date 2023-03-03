def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.H , self.W = int ( self.H ) , int ( self.W )
        src = [ int ( x ) for x in self.src ]
        dp = [ ]
        ans = 0
        for i in range ( self.H ) :
            for j in range ( self.W ) :
                ans = ( ans + pattern ( j , i ) ) % MOD
        print ( ans )
    def pattern ( self , x , y ) :
        if self.dp [ y ] [ x ] > 0 :
            return self.dp [ y ] [ x ]
        a = self.src [ y ] [ x ]
        ret = 1
        if x > 0 and a > self.src [ y ] [ x - 1 ] :
            ret = ( ret + pattern ( x - 1 , y ) ) % MOD
        if y > 0 and a > self.src [ y - 1 ] [ x ] :
            ret = ( ret + pattern ( x , y - 1 ) ) % MOD
        if x < self.W - 1 and a > self.src [ y ] [ x + 1 ] :
            ret = ( ret + pattern ( x + 1 , y ) ) % MOD
        if y < self.H - 1 and a > self.src [ y + 1 ] [ x ] :
            ret = ( ret + pattern ( x , y + 1 ) ) % MOD
        return self.dp [ y ] [ x ] = ret
