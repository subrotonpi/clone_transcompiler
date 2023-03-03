def import _solve
class A ( object ) :
    def solve ( sc ) :
        N = sc.__next__ ( )
        dp = [ 1 ]
        for i in range ( 2 , N + 1 ) :
            dp.append ( int ( i ) )
        for i in range ( 1 , N ) :
            dp [ i + 1 ] = min ( dp [ i + 1 ] , dp [ i ] + 1 )
            r = reverse ( i )
            if r <= N :
                dp [ r ] = min ( dp [ r ] , dp [ i ] + 1 )
        return ''.join ( dp )
    def reverse ( N ) :
        r = 0
        while N > 0 :
            r *= 10
            r += N % 10
            N /= 10
        return r
    def main ( ) :
        with open ( 'input.txt' , 'r' ) as sc :
            T = sc.__next__ ( )
            for cs in range ( 1 , T + 1 ) :
                res = _solve ( sc )
                print ( 'Case #%d: %s' % ( cs , res ) )
