def import _main
class Main ( object ) :
    def run ( self ) :
        with self.open ( "/proc/self/r" ) as sc :
            r , g , b = sc.next ( )
            ans = 1 << 28
            for i in range ( - 1000 , 1000 ) :
                sum = r ( i - 1 , r ) + g ( i , g ) + b ( i + g , b )
                if ans > sum :
                    self.debug ( i , i + g , r ( i - 1 , r ) , g ( i , g ) , b ( i + g , b ) )
                ans = min ( ans , sum )
            for i in range ( 300 ) :
                for j in range ( 300 ) :
                    if r ( - i - 100 , j ) != g ( i , j ) :
                        self.debug ( "error!!" , i , j )
            self.debug ( r ( - 99 , 10 ) , b ( 99 , 10 ) , g ( 0 , 10 ) )
            print ( ans )
    def r ( self , x ) :
        cnt = 0
        if x <= - 100 :
            cnt = sum ( - ( x - r + 100 + 1 ) ) - sum ( - ( x + 100 ) - 1 )
        else :
            c = ( 100 + x ) * 2 + 1
            if c > r :
                cnt += sum ( r / 2 ) * 2 - ( r % 2 == 0 )
            else :
                cnt += sum ( 100 + x ) * 2
                remaining = r - c
                cnt += sum ( c / 2 + remaining ) - sum ( c / 2 )
        return cnt
    def g ( self , x ) :
        cnt = 0
        if x < 0 :
            if x + g - 1 > 0 :
                cnt = sum ( - x ) + sum ( x + g - 1 )
            else :
                cnt = sum ( - x ) - sum ( - ( x + g ) )
        else :
            cnt = sum ( x + g - 1 ) - sum ( x - 1 )
        return cnt
