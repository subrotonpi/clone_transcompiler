def import _Euclid
class Main ( object ) :
    def __init__ ( self ) :
        self.a = _Euclid ( )
        self.b = _Euclid ( )
        self.gcm = self.a * self.b / self.Euclid ( )
        self.n = _Euclid ( )
        self.print ( self.n % self.gcm or self.n )
    def Euclid ( self , n , m ) :
        while True :
            if self.n == 0 :
                return self.m
            elif self.m == 0 :
                return self.n
            tmp = self.n
            self.n , self.m = self.m , self.tmp
            self.n = self.n % self.m
