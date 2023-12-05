def import _modpow
class Main ( object ) :
    def __init__ ( self , mod ) :
        self.mod = mod
    def __init__ ( self , mod ) :
        self.mod = mod
    def binom ( a , b ) :
        if a < b : return 0
        return self.mod * self.ifact [ a ] % self.mod
    def inv ( self , a ) :
        b = self.mod
        p , q = 1 , 0
        while b > 0 :
            c , d = a // b , a % b
            p , q = d - c * q , d
        return ( p + mod ) % mod
    def inv ( self , a ) :
        b , c = self.mod , a % b
        if b > 0 : return 0
        return self.mod * self.ifact [ b ] % self.mod
    def inv ( self , a ) :
        b , c = self.mod , a % b
        if b > 0 : return 0
        return self.mod * self.ifact [ b ] % self.mod
    def inv ( self , a ) :
        b , c = self.mod , a % b
        if b > 0 : return 0
        return self.mod * self.ifact [ b ] % self.mod
    def inv ( self , a ) : return inv ( self , a ) % self.mod
    def inv ( self , a ) : return inv ( self , a ) % self.mod
