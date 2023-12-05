def import _mul
class Main ( object ) :
    MOD = 1000000007
    def mul ( n , m ) :
        return ( n * m ) % MOD
    def fact ( n ) :
        ans = 1
        for i in range ( n , 1 , - 1 ) :
            ans = mul ( ans , i )
        return ans
    def main ( ) :
        s = raw_input ( )
        N = s.__next__ ( )
        t = [ ]
        counter = [ 0 ] * 10001
        for i in range ( N ) :
            t.append ( s.__next__ ( ) )
            counter [ t [ i ] ] += 1
        t = sorted ( t )
        currenttime = 0
        penalty = 0
        for time in t :
            currenttime += time
            penalty += currenttime
        count = 1
        for i in counter :
            count = mul ( count , fact ( i ) )
        print ( penalty )
        print ( count )
