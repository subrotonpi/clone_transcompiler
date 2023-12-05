def import import sys
class Main ( object ) :
    def main ( sc ) :
        k = sc.__next__ ( )
        n = 1
        for i in range ( k ) :
            print ( n )
            n = next ( n + 1 )
    def next ( n ) :
        min = float ( 'inf' )
        minn = 0
        for tmp in range ( 1 , n + 1 , 10 ) :
            for i in range ( int ( ( n / tmp ) % 10 ) , 9 ) :
                next = ( ( n / tmp / 10 ) * 10 + i ) * tmp + ( tmp - 1 )
                s = s ( next )
                if min > ( next * 1.0 / s ) :
                    min = ( next * 1.0 / s )
                    minn = next
        return minn
    def s ( n ) :
        wa = 0
        while n != 0 :
            wa += n % 10
            n /= 10
        return wa
    def main ( sc ) :
        sc = sys.stdin
        Main ( sc )
        sc.close
