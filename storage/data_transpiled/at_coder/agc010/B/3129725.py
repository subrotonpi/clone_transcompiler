def import _help
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        A = [ sc.readline ( ).strip ( ) for i in range ( 1 , n + 1 ) ]
        ans = help ( n , A )
        print ( ans )
    def help ( self , n , A ) :
        if n == 1 : return "YES"
        sum = A [ 1 ]
        for i in range ( 2 , n + 1 ) : sum += A [ i ]
        temp = ( long ( n ) * ( long ( n + 1 ) ) / 2 )
        if sum % temp != 0 : return "NO"
        K = sum / temp
        x = [ ]
        sumx = 0
        for i in range ( 1 , n + 1 ) :
            dif = ( A [ 1 ] - A [ i ] ) if i == n else ( A [ i + 1 ] - A [ i ] )
            if K == dif : continue
            if ( K - dif ) % n != 0 or K < dif : return "NO"
            x.append ( ( K - dif ) / n )
            sumx += x [ i ]
        if sumx != K : return "NO"
        else : return "YES"
