def import _bisect
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.a = [ ]
        self.is = [ ]
        self.freq = [ ]
        self.cum = [ ]
        self.is.append ( self.freq )
        self.cum.append ( self.cum )
    def tr ( self , * args ) :
        self.a = [ ]
        self.is = [ ]
        self.freq = [ ]
        self.cum = [ ]
        self.is.append ( self.freq )
        self.cum.append ( self.cum )
        for i in range ( self.N ) :
            self.a.append ( self.sc.randint ( 0 , self.N ) )
        p = 0
        for i in range ( self.N ) :
            if i == 0 or self.is [ 0 ] [ p - 1 ] < self.a [ i ] :
                self.is [ 0 ] [ p ] = self.a [ i ]
                self.is [ 1 ] [ p ] = i + 1
                p += 1
        self.is [ 0 ] = [ self.cum [ i - 1 ] if i > 0 else 0 ] + self.a [ i ]
        for i in range ( self.p - 1 , - 1 , - 1 ) :
            self.cum [ i ] = ( self.cum [ i ] - self.cum [ i - 1 ] - self.cum [ s ] - ( self.t - s - 1 ) * self.is [ 0 ] [ i - 1 ] + ( self.N - t ) * ( self.is [ 0 ] [ i ] - self.is [ 0 ] [ i - 1 ] ) )
    def binarySearch ( self , a , key ) :
        s = - 1
        t = len ( self.a )
        while t - s > 1 :
            m = ( s + t ) / 2
            if self.a [ m ] > self.freq [ s ] :
                t = m
        return self.a [ 0 ]
return Main
