def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.fname = 'A-large'
        f = open ( self.fname + '.in' )
        f = open ( self.fname + '.out' , 'w' )
        self.n = int ( f.readline ( ) )
        for num in range ( self.n ) :
            s = int ( f.readline ( ) )
            sa = [ f.readline ( ).lstrip ( ) for _ in range ( s ) ]
            print ( sa , file = f )
        print ( )
        self.q = int ( f.readline ( ) )
        qa = [ f.readline ( ).lstrip ( ) for _ in range ( self.q ) ]
        print ( )
        self.v = [ [ ] for _ in range ( self.s ) ]
        for j in range ( self.q - 1 , - 1 , - 1 ) :
            for i in range ( self.s - 1 , - 1 , - 1 ) :
                if sa [ i ] != qa [ j ] :
                    self.v [ i ].append ( self.v [ i ] [ j + 1 ] )
                else :
                    self.v [ i ].append ( sys.maxsize )
                    for k in range ( self.s ) :
                        if k != i :
                            self.v [ i ].append ( min ( self.v [ j ] , self.v [ k ] [ j + 1 ] ) )
                    self.v [ i ].append ( j )
        for i in range ( self.s ) :
            for j in range ( self.q ) :
                print ( self.v [ i ] , end = ' ' )
            print ( )
        self._min = min ( self.q )
        self.index = 0
        for i in range ( self.s ) :
            if self.q == 0 or self.qa [ 0 ] != sa [ i ] :
                self.min = min ( self.q , self.q )
