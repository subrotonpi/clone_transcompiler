def import _sys , os , sys
class Main ( object ) :
    def __init__ ( self ) :
        self.x = nl ( )
        self.query = [ ]
        self.ptr = 0
        self.k = ni ( )
        for i in range ( self.k ) :
            self.query.append ( [ self.nl ( ) , - 1 ] )
        self.qq = ni ( )
        for i in range ( self.qq ) :
            self.query.append ( [ self.nl ( ) , self.nl ( ) ] )
        self.query = [ self.ptr ]
        self.query.sort ( key = lambda x : int ( x [ 0 ] ) )
        self.t = 0
        self.now = [ 0 , self.x , 0 ]
        self.up = True
        for q in self.query :
            next = self.f ( q [ 0 ] - t , now , self.x , self.up )
            if q [ 1 ] < 0 :
                self.up = not self.up
            else :
                self.out.write ( max ( min ( q [ 1 ] , next [ 1 ] ) , next [ 0 ] ) + next [ 2 ] )
            self.t = q [ 0 ]
            self.now = next
    def f ( self , d , now , X , up ) :
        ret = [ ]
        if up :
            self.now = now [ 0 ] + now [ 2 ] if self.now [ 2 ] > d else min ( d - now [ 2 ] , X )
            self.now = max ( now [ 1 ] , ret [ 0 ] )
            self.now = max ( now [ 2 ] - d , - X )
        else :
            self.now = now [ 1 ] + now [ 2 ] if self.now [ 2 ] < X else max ( X - ( now [ 2 ] + d ) , 0 )
            self.now = min ( now [ 1 ] , now [ 0 ] )
            self.now = min ( now [ 2 ] + d , X )
        return ret
