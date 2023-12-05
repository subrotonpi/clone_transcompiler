def import _COMinit
class Main ( object ) :
    def __init__ ( self ) :
        self.mod_ans = int ( pow ( 10 , 9 ) ) + 7
    def fac ( self ) :
        self.fac = [ ]
        self.finv = [ ]
        self.inv = [ ]
    def main ( self ) :
        with open ( self.name , 'r' ) as sc :
            length = sc.read ( )
            multi = sc.read ( )
        ans = 1
        counts = [ ]
        for i in range ( 2 , multi + 1 ) :
            if multi % i == 0 :
                count = 0
                while multi % i == 0 :
                    multi /= i
                    count += 1
                counts.append ( count )
            if multi == 1 :
                break
        self.COMinit ( )
        for i in counts :
            ans *= combi ( i + length - 1 , min ( i , length - 1 ) ) % self.mod_ans
            ans %= self.mod_ans
        print ( ans )
    def combi ( self , n , r ) :
        return self.fac [ n ] * ( self.finv [ r ] * self.finv [ n - r ] % self.mod_ans ) % self.mod_ans
    def COMinit ( self ) :
        self.fac [ 0 ] = self.fac [ 1 ] = 1
        self.finv [ 0 ] = self.finv [ 1 ] = 1
        self.inv [ 1 ] = 1
        for i in range ( 2 , len ( self.fac ) ) :
            self.fac [ i ] = self.fac [ i - 1 ] * i % self.mod_ans
            self.inv [ i ] = self.mod_ans - self.inv [ mod_ans % i ] * ( self.mod_ans // i ) % self.mod_ans
            self.finv [ i ] = self.finv [ i - 1 ] * self.inv [ i ] % self.mod_ans
