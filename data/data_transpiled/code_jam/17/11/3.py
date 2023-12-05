def _import ( ) :
    import sys
    import time
    import sys
    import sys
    class Main ( object ) :
        def solve ( self ) :
            r , c = [ s.split ( '?' ) for s in self.split ( '?' ) ]
            chars = [ [ s.split ( '?' ) [ 0 ] for s in self.split ( '?' ) ] for s in self.split ( ',' ) ]
            for i in range ( r ) :
                for j in range ( c ) :
                    if chars [ i ] [ j ] == '?' and i > 0 and chars [ i - 1 ] [ j ] != '?' :
                        chars [ i ] [ j ] = chars [ i - 1 ] [ j ]
            for i in range ( r - 1 , - 1 , - 1 ) :
                for j in range ( c ) :
                    if chars [ i ] [ j ] == '?' and i < r - 1 and chars [ i + 1 ] [ j ] != '?' :
                        chars [ i ] [ j ] = chars [ i + 1 ] [ j ]
            for i in range ( r ) :
                for j in range ( c ) :
                    if chars [ i ] [ j ] == '?' and j > 0 and chars [ i ] [ j - 1 ] != '?' :
                        chars [ i ] [ j ] = chars [ i ] [ j - 1 ]
            for i in range ( r ) :
                for j in range ( c - 1 , - 1 , - 1 ) :
                    if chars [ i ] [ j ] == '?' and j < c - 1 and chars [ i ] [ j + 1 ] != '?' :
                        chars [ i ] [ j ] = chars [ i ] [ j + 1 ]
            return '\n' + '\n'.join ( ''.join ( chars ) )
    sys.stdout = sys.stderr = open ( 'output.txt','w' )
    times = time.time ( )
    start = time.time ( )
    for t in range ( 1 , times + 1 ) :
        print ( 'Case #%d: %s' % ( t , times )