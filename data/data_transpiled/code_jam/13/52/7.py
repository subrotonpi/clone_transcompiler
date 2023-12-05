def _import ( ) :
    import sys
    import threading
    class B ( threading.Thread ) :
        def __init__ ( self ) :
            threading.Thread.__init__ ( self )
        def readline ( self ) :
            while not self.readline or not self.readline :
                self.readline = self.readline ( )
            self.readline = None
            self.readline = None
            self.readline = None
            self.readline = None
            self._pmax = [ ]
            self._pmax = [ ]
            self._pmax = [ ]
            self._pmax.append ( int ( self._pmax [ 0 ] ) )
        def run ( self ) :
            try :
                f = open ( 'input.txt' , 'r' )
                f.write ( '\n' )
                f.close ( )
            except IOError :
                sys.exit ( 1 )
            f = open ( 'output.txt' , 'w' )
            t = randint ( 0 , len ( x ) )
            for i in range ( t ) :
                f.write ( 'Case #%d: ' % ( i + 1 ) )
                self.solve ( )
            f.close ( )
        def intersect_1 ( a , b , c , d ) :
            if a > b :
                q = a
                a = b
                b = q
            if c > d :
                q = c
                c = d
                d = q
            return max ( a , c ) <= min ( b , d )
        def intersect ( a , b , c , d ) :
            if a == c or a == d or b == c or b == d :
                return False
            return intersect_1 ( x [ a ] , x [ b ] , x [ c ] , x [ d ] ) and intersect_1 ( y [ a ] , y [ b ] , y [ c ] , y [ d ] ) and area ( a , b , c ) * area ( a , b , d ) <= 0 and area ( c , d , a ) * area ( c , d , b ) <= 0
    for i in take :
        if i in _locals :
            continue
        _locals [ i ] = _locals [ i ]
