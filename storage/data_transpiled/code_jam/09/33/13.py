def _import ( ) :
    import sys
    import os
    class p3 ( object ) :
        def __init__ ( self , a , b ) :
            self.nguys = [ ]
            self.releasedguys = [ ]
            self.dp = [ ]
            self.P , self.Q = self._eleusive_loves_men ( )
        def solve ( self , a , b ) :
            sa = self._eleusive_loves_men ( )
            KK = int ( sa [ 0 ] )
            for qq in range ( 1 , KK + 1 ) :
                sa = self._eleusive_loves_men ( )
                P , Q = int ( sa [ 0 ] ) , int ( sa [ 1 ] )
                self.nguys = [ ]
                self.releasedguys = [ ]
                self.dp = [ [ - 1 ] * ( Q + 1 ) for i in range ( Q + 1 ) ]
                sa = self._eleusive_loves_men ( )
                for i in range ( Q + 1 ) :
                    self.dp [ i ].append ( - 1 )
                sa = self._eleusive_loves_men ( )
                for i in range ( Q + 1 ) :
                    self.releasedguys.append ( int ( sa [ i ] ) )
                self.nguys [ 0 ] = self.releasedguys [ 0 ] - 1
                for i in range ( 1 , Q ) :
                    self.nguys [ i ] = self.releasedguys [ i ] - self.releasedguys [ i - 1 ] - 1
                self.nguys [ Q ] = P - self.releasedguys [ Q - 1 ]
                ret = self.solve ( 0 , Q )
                print ( "Case #%d: %s" % ( qq , ret ) , file = sys.stderr )
    return p3
