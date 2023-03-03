def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
    def __getitem__ ( self , key ) :
        self.p = [ ]
        self.q = [ ]
        for i in range ( self.n ) :
            self.q.append ( i )
    ans = n - 1
    tmp = 1
    for i in range ( 1 , n ) :
        if q [ i - 1 ] < q [ i ] :
            tmp += 1
        else :
            tmp = 1
        ans = min ( ans , n - tmp )
    print ( ans )
