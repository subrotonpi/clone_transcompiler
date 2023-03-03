def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.seen = set ( )
        self.frac = [ 0 ] * 17
        self.map = { }
        self.degree = [ 0 ] * 17
        self.dp = { }
    def main ( self ) :
        sc = _main ( self )
        n , m = sc.regs [ 0 ]
        self.map = { }
        self.frac [ 0 ] = 1
        for i in range ( 1 , 17 ) :
            self.frac [ i ] = i * self.frac [ i - 1 ]
        for i in range ( 0 , n ) :
            self.map [ i ] = set ( )
        for i in range ( m ) :
            s , t = _main ( self )
            self.map [ s ].add ( t )
            self.seen.add ( s )
            self.degree [ t ] += 1
        topo = self.dfs ( 0 )
        sz = len ( self.seen )
        com = self.frac [ n ] / self.frac [ sz ] / self.frac [ n - sz ]
        ans = self.frac [ n - sz ] * topo * com
        print ( ans )
    def dfs ( self , state ) :
        if self.dp in dp :
            return dp [ state ]
        if self.count ( state ) == len ( self.seen ) :
            self.dp [ state ] = 1
            return 1
        ans = 0
        for w in self.seen :
            if ( self.state & ( 1 << w ) ) or self.degree [ w ] > 0 :
                continue
            state |= 1 << w
            for s in self.map [ w ] :
                self.degree [ s ] -= 1
            ans += self.dfs ( state )
            self.state &= ~ ( 1 << w )
            for s in self.map [ w ] :
                self.degree [ s ] += 1
        self.dp [ state ] = ans
        return ans
Note :./ Main.py.uses.unchecked or unsafe.operations.Note : Recompile ( )
for details in Main ( ) :
    for details in details.values ( ) :
        for details in details.values ( ) :