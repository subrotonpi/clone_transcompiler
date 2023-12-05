def _solve ( ) : return _solve ( )
def _solve ( ) : return _solve ( )
def _solve ( ) : return _solve ( )
def _solve ( ) : return _solve ( )
def _solve ( ) : return _solve ( )
def _solve ( ) : return _solve ( )
def _solve ( ) : return _solve ( )
def _solve ( ) :
def _solve ( ) :
    for tt in range ( 0 , tc ) :
        n = randint ( 0 , n )
        a = randint ( 0 , n )
        c = randint ( 0 , n )
        x0 = randint ( 0 , n )
        y0 = randint ( 0 , n )
        m = randint ( 0 , n )
        x = x0
        y = y0
        xa = [ ]
        ya = [ ]
        xa.append ( x )
        ya.append ( y )
        for i in range ( 1 , n ) :
            x = ( a * x + b ) % m
            y = ( c * y + d ) % m
            xa.append ( x )
            ya.append ( y )
        cnt = [ ]
        for i in range ( 3 ) :
            cnt.append ( [ int ( i ) % 3 ] )
        return sum ( cnt [ i ] [ j ] for j in range ( 9 ) if i not in cnt [ i ] )
    xx = [ ]
    yy = [ ]
    def _solve ( ) :
        try :
            _solve ( )
        except :
            _apstenu ( )
        finally :
            _solve ( )
    def _solve ( ) :
        for i in range ( 3 ) :
            xx.append ( i )
            yy.append ( j )
    ans = 0
    for i in range ( 9 ) :
        for j in range ( 9 ) :
            for k in range ( j ) :
                if ( xx [ i ] + xx [ j ] + xx [ k ] ) % 3 == 0 and ( yy [ i ] + yy [ j ] + yy [ k ] ) % 3 == 0 :
                    if i == j and j == k and i == k :
                        x1 = xx [ i ]
                        y1 = yy [ i ]
                        ans += cnt [ x1 ] [ y1 ] *