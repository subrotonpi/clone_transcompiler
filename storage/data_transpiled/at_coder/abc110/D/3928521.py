def _import ( ) : return
from math import pow
class Main ( object ) :
    def __init__ ( self ) :
        self.MOD = 1000000007
        self.pow = pow
    def run ( self ) :
        sc = open ( self.PATH )
        N = sc.read ( )
        M = sc.read ( )
        sosu = [ ]
        ans = 1
        for i in range ( 2 , 2 * M + 1 ) :
            if M % i == 0 :
                scount = 0
                while M % i == 0 :
                    scount += 1
                    M /= i
                if scount != 0 :
                    ans *= comb ( scount + N - 1 , scount )
                    ans %= pow
        if M != 1 :
            ans *= comb ( 1 + N - 1 , 1 )
            ans %= pow
        print ( ans )
    def comb ( x , y = None ) :
        ue = 1
        sita = 1
        for i in range ( y ) :
            ue *= x - i
            ue %= pow
            sita *= i + 1
            sita %= pow
        ans = ue * modpow ( sita , pow - 2 ) % pow
        return ans
    def modpow ( a , p ) :
        if p == 0 :
            return 1
        if p % 2 == 0 :
            halfp = p // 2
            half = modpow ( a , halfp )
            return half * half % pow
        else :
            return a * modpow ( a , p - 1 ) % pow
class Pair ( object ) :
    def __init__ ( self ) :
        from math import ceil
        self.from math import ceil
        self.num = ceil ( ceil ( ceil ( ceil ( a ) / pow ) ) )
        self.bango = ceil ( ceil ( ceil ( ceil ( a ) / pow ) ) )
