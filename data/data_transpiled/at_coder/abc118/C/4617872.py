def import gcd
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        a = sc.readlines ( )
        answer = gcd ( a [ 0 ] , a [ 1 ] )
        for i in range ( N ) :
            answer = gcd ( answer , a [ i ] )
        print ( answer )
    def gcd ( div , div2 ) :
        if div2 == 0 :
            return div
        return gcd ( div2 , div % div2 )
