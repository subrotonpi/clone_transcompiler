def main ( args ) :
    import random
    class B ( object ) :
        def __init__ ( self ) :
            self.caseNumber = random.randint ( 0 , 10000 )
            for case in range ( self.caseNumber ) :
                D = random.randint ( 0 , 10000 )
                I = random.randint ( 0 , 10000 )
                M = random.randint ( 0 , 10000 )
                N = random.randint ( 0 , 256 )
            self.a = [ ]
            self.opt = [ [ ] for i in range ( N + 1 ) ]
            self.opt [ N ] [ i ] = self.I
            self.opt [ N ] [ i ] = 0
    ans = [ ]
    for i in range ( 1 , N + 1 ) :
        self.a.append ( random.randint ( 0 , 256 ) )
    for i in range ( 256 ) :
        self.opt [ 0 ] [ i ] = I
        self.opt [ 0 ] [ 256 ] = 0
    for i in range ( 1 , N + 1 ) :
        min = [ ]
        for j in range ( 256 ) :
            self.min [ j ] = self.opt [ i - 1 ] [ 256 ]
            for k in range ( j - M , j + M ) :
                if k < 0 :
                    continue
                if k > 255 :
                    continue
                if self.opt [ i - 1 ] [ k ] < min [ j ] :
                    self.opt [ i - 1 ] [ k ] = self.opt [ i - 1 ] [ k ] + time * I
        for j in range ( 256 ) :
            delta , time = 0 , 0
            self.opt [ i ] [ j ] = self.opt [ i - 1 ] [ j ] + D
            for k in range ( 256 ) :
                delta = abs ( j - k )
                if M != 0 :
                    time = ( delta - 1 ) / M + 1
                else :
                    time = 10000
                if j == k :
                    time = 0
                if ( time != 10000 and self.opt [ i - 1 ] [ k ] + D + I * time < self.opt [ i ] [ j ] ) :
                    self.opt [ i ] [ j ] = self.opt