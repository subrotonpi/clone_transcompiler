def import __main__
class Main ( ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.n = self.s.count ( )
        self.t = [ ]
        self.v = [ ]
        self.t.append ( self.t )
        self.v = [ ]
        self.t.append ( self.v )
        for i in range ( self.n ) :
            self.v.append ( self.s.get ( i ) )
        for i in range ( self.n - 1 , - 1 , - 1 ) :
            self.v [ i ] = min ( self.v [ i ] , self.v [ i + 1 ] + self.t [ i ] )
        self.parallel_prefix ( self.t , sum )
        cv , i , d = 0 , 0 , 0
        for T in self.t [ n - 1 ] :
            remain = self.t [ i ] - T
            if cv - self.v [ i + 1 ] == remain - 1 and cv < self.v [ i ] :
                d += cv * 4 + 1
            else :
                d += cv * 2
                if cv - self.v [ i + 1 ] == remain :
                    cv -= 1
                elif cv + 1 <= self.v [ i ] :
                    cv += 1
                d += cv * 2
            if remain == 1 :
                self.i += 1
        print ( d / 4.0 )
