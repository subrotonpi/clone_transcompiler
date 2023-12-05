def _ ( ) : return
class Main ( object ) :
    MOD = 1000000007
    def __init__ ( self ) :
        self.A = 0
        self.B = 1
        self.C = 1
        self.A = 0
        self.B = 0
        self.C = 0
        self.B = 0
        self.C = 0
        self.C = 0
        self.div = _inverse ( get_mod ( A * ( B + C ) - B * C ) )
        c = get_mod ( get_mod ( B * ( C - A ) ) * div )
        r = get_mod ( get_mod ( C * ( B - A ) ) * div )
        print ( r , c )
    def get_power ( self , n ) :
        if n == 0 :
            return 1
        elif n % 2 == 0 :
            return get_power ( self.a ** 2 ) , n // 2
        else :
            return get_mod ( self.a * get_power ( self.a , n - 1 ) )
    def get_inverse ( self , a ) :
        return get_power ( self , self.MOD - 2 )
    def get_mod ( self , a ) :
        if a >= 0 :
            return a % MOD
        else :
            return MOD + a % MOD
