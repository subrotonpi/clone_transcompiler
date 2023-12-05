def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n , self.k , self.q = _main.get ( )
        self.a = [ _main.get ( ) for _ in range ( self.n ) ]
        self.a = [ _main.get ( ) for _ in range ( self.n ) ]
        self.a = [ _main.get ( ) for _ in range ( self.n ) ]
        self.ans = sys.maxint
        for y in self.a :
            x = self.calc_max ( y )
            if x > 0 :
                ans = min ( ans , x - y )
        print ( ans )
    def calc_max ( min ) :
        max = 0
        all = [ ]
        cont = [ ]
        for x in self.a :
            if x >= min :
                cont.append ( x )
            else :
                if len ( cont ) >= k :
                    cont.sort ( )
                    for i in range ( len ( cont ) - k + 1 ) :
                        all.append ( cont [ i ] )
                cont = [ ]
        if len ( cont ) >= k :
            cont.sort ( )
            for i in range ( len ( cont ) - k + 1 ) :
                all.append ( cont [ i ] )
        if len ( all ) >= self.q :
            all.sort ( )
            max = all [ self.q - 1 ]
        else :
            max = - 1
        return max
return Main
