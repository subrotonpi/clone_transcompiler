def import _main
class d ( object ) :
    def __init__ ( self ) :
        self.T = int ( sys.argv [ 1 ] )
        for t in range ( 1 , T + 1 ) :
            n = int ( sys.argv [ 2 ] )
            a = [ _main.get ( t , 0 ) for _ in range ( n ) ]
            b = [ _main.get ( t , 0 ) for _ in range ( n ) ]
            warm_score , dec_score = self.play_fp ( a , b )
            print ( "Case #%d: %d %d" % ( t , dec_score , warm_score ) )
    def play_de_wc ( a , b ) :
        a.sort ( )
        b.sort ( )
        ret = 0
        for i in range ( len ( a ) ) :
            ret = max ( ret , self.play_de_wc ( a , b , i ) )
        return ret
    def play_de_wc ( a , b , fakeout = 0 ) :
        ret = 0
        n = len ( a )
        for i in range ( fakeout ) :
            if a [ i ] > b [ n - 1 - i ] :
                return - 1
            left = sorted ( b [ i ] )
            for i in range ( fakeout , n ) :
                x = a [ i ]
                first = left.first ( )
                if x > first :
                    ret += 1
                    left.pollFirst ( )
                else :
                    left.pollLast ( )
            return ret
    def play_fp ( a , b ) :
        a.sort ( )
        left = sorted ( b )
        ret = 0
        for x in a :
            x = left.higher ( x )
            if x is None :
                ret += 1
            else :
                left.pollLast ( )
        return a
return d
