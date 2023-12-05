def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main
    def main ( self ) :
        n = self.sc.n
        a = [ ]
        for i in range ( n ) :
            a.append ( _main ( self ) )
        ans = sys.maxint
        for i in range ( - 100 , 100 + 1 ) :
            tmp = 0
            for j in range ( n ) :
                tmp += int ( math.pow ( a [ j ] - i , 2 ) )
            ans = min ( ans , tmp )
        print ( ans )
