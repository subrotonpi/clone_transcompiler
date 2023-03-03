def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.N = self.sc.randint ( 1 , N )
        self.K = self.sc.randint ( 1 , K )
        a = [ ]
        for i in range ( self.N ) :
            a.append ( self.sc.randint ( 1 , N ) )
        a.sort ( )
    min = - 1
    max = N
    while min + 1 < max :
        mid = ( min + max ) // 2
        visited = [ True ] * K
        for i in range ( self.N ) :
            if i == mid :
                continue
            for j in range ( K - 1 , - 1 , - 1 ) :
                if visited [ j ] and j + a [ i ] < K :
                    visited [ j + a [ i ] ] = True
        ok = False
        for i in range ( K - 1 , - 1 , - 1 ) :
            if visited [ i ] :
                ok = True
                break
            if ok :
                max = mid
            else :
                min = mid
        print ( max )
