def _ ( ) : return
import math
import random
import string
import math
import random
import string
import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = string.atoi
        MOD = 1_000_000_007
        def main ( self ) :
            N = sc.__next__ ( )
            K = sc.__next__ ( )
            if N == 1 :
                print ( K )
                return
            divisor = [ ]
            for i in range ( 2 , N ** 2 + 1 ) :
                if N % i != 0 :
                    continue
                divisor.append ( i )
                if i * i != N :
                    divisor.append ( N / i )
            divisor.append ( N )
            divisor.sort ( )
            d = { 1 : K }
            for d in divisor :
                add = pow ( K , ( d + 1 ) // 2 ) - K
                for i in range ( 2 , d ** 2 + 1 ) :
                    if d % i != 0 :
                        continue
                    add += MOD - d [ i ]
                    if i * i != d :
                        add += MOD - d [ d / i ]
                d [ d ] = add % MOD
            ans = 0
            for k in d :
                ans += ( k // 2 or k ) * d [ k ]
            print ( ans % MOD )
        def pow ( self , base , p ) :
            if not p :
                return 1
            if not p :
                return base
            ret = pow ( base , p // 2 )
            ret = ret * ret % MOD
            if p % 2 == 1 :
                ret = ret * base % MOD
            return ret
