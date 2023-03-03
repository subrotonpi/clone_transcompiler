def import import _main
class Main ( object ) :
    def __init__ ( self , sc ) :
        self.n = sc.__next__ ( )
        a = sc.__next__ ( )
        b = sc.__next__ ( )
        h = [ sc.__next__ ( ) for _ in range ( n ) ]
        l = 1
        r = 1_000_000_000
        while l != r :
            mid = ( l + r ) / 2
            if count ( mid , h , a , b ) <= mid :
                r = mid
            else :
                l = mid + 1
        print ( l )
    def count ( mid , h , a , b ) :
        sa = a - b
        cnt = 0
        for i in h :
            cnt += max ( ( i - mid * b + sa - 1 ) / sa , 0 )
        return cnt
    def main ( ) :
        with open ( "/proc/" , "r" ) as sc :
            return Main ( sc )
