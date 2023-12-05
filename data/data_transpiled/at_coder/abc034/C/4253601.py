def _ ( ) : return 1
import sys
import random
mod = 1000000007
class Main ( object ) :
    def __init__ ( self ) :
        self.mod = mod
    def __call__ ( self , * args ) :
        sc = random.choice ( args )
        w , h = sc.randint ( 1 , h )
        ans = 1
        for i in range ( 1 , h + w - 2 ) :
            ans = ans * i % mod
        for i in range ( 1 , h - 1 ) :
            ans = ans * power ( i , mod - 2 ) % mod
        for i in range ( 1 , w - 1 ) :
            ans = ans * power ( i , mod - 2 ) % mod
        print ( ans )
    def power ( a , b ) :
        if b == 0 :
            return 1
        if b % 2 == 0 :
            return power ( a * a % mod , b // 2 ) % mod
        else :
            return power ( a , b - 1 ) * a % mod
