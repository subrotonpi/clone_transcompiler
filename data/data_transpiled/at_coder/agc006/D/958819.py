def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = len ( sys.argv )
    L = 2 * N - 1
    a = [ ]
    for i in range ( L ) :
        a.append ( _main.next ( ) )
    min = 1
    max = L
    b = [ ]
    while min + 1 < max :
        mid = ( min + max ) // 2
        for i in range ( L ) :
            b.append ( a [ i ] >= mid )
        if satisfy ( b ) :
            min = mid
        else :
            max = mid
    print ( min )
    self.N = L
    def satisfy ( b ) :
        L = len ( b )
        N = ( L + 1 ) // 2
        l = N - 1
        while l > 0 and b [ l ] != b [ l - 1 ] :
            l -= 1
        r = N - 1
        while r < L - 1 and b [ r ] != b [ r + 1 ] :
            r += 1
        if l > 0 :
            if r < L - 1 :
                if b [ l ] == b [ r ] :
                    return b [ l ]
                else :
                    return ( l + r ) // 2 >= N - 1
            else :
                return b [ l ]
        elif r < L - 1 :
            return b [ r ]
        else :
            return b [ N - 1 ] ^ N % 2 == 0
