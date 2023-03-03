def import _upd
class b ( object ) :
    def __init__ ( self , a ) :
        self.input = sys.stdin
        self.T = len ( a )
        for t in range ( self.T ) :
            self.output.write ( "Case #%d: " % ( t + 1 ) )
            self.p = self.input.read ( 1 )
            self.q = self.input.read ( 1 )
            self.n = self.input.read ( 1 )
            self.hs = [ self.input.read ( 1 ) ]
            self.gs = [ self.input.read ( 1 ) ]
    def decode ( x ) :
        self.output.write ( "Case #%d: " % ( t + 1 ) )
        self.p = x
        self.q = x
        self.n = x
        self.hs = [ self.hs [ i ] for i in range ( self.n ) ]
        self.gs = [ self.gs [ i ] for i in range ( self.n ) ]
    def memo ( self ) :
        self.memo = { }
        data = [ ]
        for i in range ( self.n ) :
            data.append ( self.hs [ i ] )
        print ( dp ( self.encode ( data ) ) )
    def dp ( self , key ) :
        h = self.decode ( key )
        if self.memo.has_key ( key ) :
            return self.memo [ key ]
        if not key :
            return 0
        res = 0
        for i in range ( self.n ) :
            if not self.h [ i ] :
                continue
            temp = self.h [ i ]
            self.h [ i ] = max ( 0 , self.h [ i ] - self.p )
            good = self.h [ i ] == self.h [ i ]
            next = self.upd ( next )
            nkey = self.encode ( next )
            self.h [ i ] = temp
            if good :
                res = max ( res , self.gs [ i ] + self.dp ( nkey ) )
            else :
                res = max ( res , self.dp ( nkey ) )
        return res
    