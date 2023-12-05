def _import ( ) :
    from sys import stdin
    from io import BytesIO
    class Main ( object ) :
        def __init__ ( self , * args ) :
            super ( Main , self ).__init__ ( * args )
            self.R = int ( args [ 0 ] )
            self.ans = int ( args [ 1 ] )
        def read ( self ) :
            sc = FastScanner ( )
            self.N = sc.read ( )
            self.M = sc.read ( )
            self.R = sc.read ( )
            self.r = [ ]
            for i in range ( self.R ) :
                self.r.append ( sc.read ( ) )
        def read ( self ) :
            if not self.hasNext ( ) :
                raise StopIteration
            n = False
            if self.b == '-' :
                minus = True
            elif self.b == '-' :
                return ( - n if self.isPrintableChar ( ) else n )
            else :
                raise StopIteration
        def write ( self , buf ) :
            if not self.hasNext ( ) :
                raise StopIteration
            buf = [ ]
            while self.isPrintableChar ( buf ) :
                buf.append ( buf.pop ( 0 ) )
            return buf
    def read ( self ) :
        if self.hasNext ( ) :
            raise StopIteration
        else :
            buf = [ ]
        for i in range ( 1 , self.M ) :
            A = buf.pop ( 0 )
            B = buf.pop ( 0 )
            C = buf.pop ( 0 )
            dp [ A ].append ( C )
            dp [ B ].append ( C )
        for i in range ( 1 , self.N ) :
            dp [ i ].append ( 0 )
        for i in range ( 1 , self.M ) :
            for j in range ( 1 , self.N ) :
                for k in range ( 1 , self.N ) :
                    dp [ j ] [ k ] = min ( dp [ j ] [ k ] , dp [ j ] [ i ] + dp [ i ] [ k ] )
    class FastScanner ( object ) :
        def __init__ ( self , * args )