def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.h , self.w = self.h , self.w
        self.a = [ ]
        self.memo = [ ]
        for i in range ( self.h ) :
            for j in range ( self.w ) :
                self.a.append ( [ int ( i ) , - 1 ] )
        ans = 0
        for i in range ( self.h ) :
            for j in range ( self.w ) :
                ans += _saiki ( j , i )
                ans %= _MOD
        print ( ans )
    def saiki ( x , y ) :
        if self.memo [ y ] [ x ] != - 1 :
            return self.memo [ y ] [ x ]
        res = 0
        dx = [ 0 , 1 , 0 , - 1 ]
        dy = [ 1 , 0 , - 1 , 0 ]
        for i in range ( 4 ) :
            nx = x + dx [ i ]
            ny = y + dy [ i ]
            if 0 <= nx < self.w and 0 <= ny < self.h and self.a [ y ] [ x ] > self.a [ ny ] [ nx ] :
                res += _saiki ( nx , ny )
        self.memo [ y ] [ x ] = int ( res % _MOD ) + 1
        return self.memo [ y ] [ x ]
