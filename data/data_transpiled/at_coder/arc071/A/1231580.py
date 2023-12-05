def import _solve
class Main ( object ) :
    def __init__ ( self , s ) :
        self.mins = [ ]
        for c in s :
            cnt [ c - 'a' ] += 1
        for i in range ( 26 ) :
            self.mins.append ( min ( self.mins [ i ] , cnt [ i ] ) )
    def solve ( self ) :
        for i in range ( 26 ) :
            self.mins [ i ] = sys.maxint
        with open ( 'input.txt' , 'r' ) as sc :
            n = sum ( [ int ( c ) for c in sc.read ( ).split ( ) ] )
            for i in range ( n ) :
                s = sc.read ( )
                self.solve ( s )
        yield ''.join ( [ chr ( i + ord ( 'a' ) ) for i in range ( 26 ) ] )
