def _import ( ) : return
class p1 ( ) :
    def __init__ ( self , f ) :
        self.f = f
    def get_int ( self ) :
        return int ( self.f.read ( ) )
    def _ints ( self ) :
        s = self.f.read ( ).split ( )
        for c in s :
            r = [ int ( c ) for c in s ]
        return r
    BIG = 12000
    def val ( self ) :
        self.c = [ ]
        self.op = [ ]
        self.mcx = [ ]
        f = _ints ( )
        M = f [ 0 ]
        V = f [ 1 ]
        b = ( M - 1 ) // 2
        for i in range ( 1 , M + 1 ) :
            if i <= b :
                f = _ints ( )
                if f [ 0 ] == 0 :
                    self.op.append ( 'o' )
                else :
                    self.op.append ( 'a' )
                if f [ 1 ] == 0 :
                    self.c.append ( False )
                else :
                    self.c.append ( True )
            else :
                self.val.append ( get_int ( ) )
                self.mcx.append ( BIG )
        for i in range ( b , 0 , - 1 ) :
            if self.op [ i ] == 'a' :
                self.val [ i ] = self.val [ 2 * i ] & self.val [ 2 * i + 1 ]
            else :
                self.val [ i ] = self.val [ 2 * i ] | self.val [ 2 * i + 1 ]
            self.mcx.append ( BIG )
            for t in range ( 8 ) :
                va = self.val [ 2 * i ]
                vb = self.val [ 2 * i + 1 ]
                mop = self.op [ i ]
                cost = 0
                if ( ( t >> 0 ) & 1 ) :
                    self.va = 1 - va
                    cost += self.mcx [ 2 * i ]
        return self.val
