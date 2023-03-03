def import gcd
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        i = [ sc.readline ( ).strip ( ) for i in range ( N ) ]
        answer = gcd ( i [ 0 ] , i [ 1 ] )
        for i in range ( 2 , N ) :
            answer = gcd ( answer , i [ i ] )
        print ( answer )
    def gcd ( div , div2 ) :
        if div2 == 0 :
            return div
        return gcd ( div2 , div % div2 )
