def import import _sys , math , imp
class Main ( object ) :
    def __init__ ( self ) :
        self.mod = 1000000007
    def __call__ ( self , * args ) :
        sc = imp.new_module ( 'Main' )
        n = sc.getmaxyx ( ) [ 0 ]
        m = sc.getmaxyx ( ) [ 1 ]
        mod = 1000000007
        ans = 1
        for i in range ( 2 , m + 1 ) :
            count = 0
            while m % i == 0 :
                m /= i
                count += 1
            if count > 0 :
                for j in range ( 1 , count + 1 ) :
                    ans *= ( ( n + count - j ) % mod )
                    ans %= mod
                for k in range ( 2 , count + 1 ) :
                    pow ( k , mod - 2 )
        print ( ans )
    def pow ( self , a , p ) :
        while p > 0 :
            if p & 1 == 1 :
                self.ans *= a
                self.ans %= mod
            a *= a
            a %= mod
            p >>= 1
    return Main ( )
