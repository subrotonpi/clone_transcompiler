def import _main
class C :
    def __init__ ( self , n ) :
        self.n = n
        self.m = m
        self.EE = [ [ ] for i in range ( self.m ) ]
        self.PATH = [ x , y , lo , hi ]
        self.PATH = [ x , y , lo , hi ]
        for ei in range ( self.m ) :
            self.E [ self.PATH [ ei ] [ 0 ] ].append ( ei )
        self.st = self.EE [ self.PATH [ p ] [ 1 ] ]
        dst = 0
        for i in range ( 0 , self.p ) :
            dst += self.EE [ self.PATH [ i ] [ 2 ] ]
        self.SHORT = set ( [ self.PATH [ i ] for i in range ( 0 , self.p ) ] )
        self.Q = [ ( 0 , 0 , 0 ) , ( st , dst , 1 ) ]
        while not self.Q.empty ( ) :
            X = self.Q.get ( )
            v = X [ 0 ]
            d = X [ 1 ]
            make_long = X [ 2 ] == 0
            if self.S [ v ] : continue
            self.S [ v ] = True
            if v == 1 : return X [ 2 ] == 1
            for ei in self.E [ v ] :
                if ei in self.SHORT or not make_long :
                    self.Q.put ( ( self.EE [ ei ] [ 1 ] , d + self.EE [ ei ] [ 2 ] , X [ 2 ] ) )
                else :
                    self.Q.put ( ( self.EE [ ei ] [ 1 ] , d + self.EE [ ei ] [ 3 ] , X [ 2 ] ) )
