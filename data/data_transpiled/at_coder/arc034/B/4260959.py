def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.read ( )
        lst = [ ]
        for i in range ( max ( n - 9 * 18 , 1 ) , n ) :
            if i + f ( i ) == n :
                lst.append ( i )
        s = [ "%d\n" % len ( lst ) ]
        for x in lst :
            s.append ( "%d\n" % x )
        sys.stdout.write ( s )
    def f ( x ) :
        ans = 0
        while x > 0 :
            ans += x % 10
            x /= 10
        return ans
