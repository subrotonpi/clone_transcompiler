def main ( ) :
    import math
    import random
    class c ( ) :
        def __init__ ( self ) :
            self.a , self.b = 0 , 0
        def num ( self , ta , tb ) :
            gcd = ta.gcd ( tb )
            ta = ta // gcd
            tb = tb // gcd
            gcd = gcd % 1000
            ta = ta * gcd
            tb = tb * gcd
            self.a = ta + 0
            self.b = tb + 0
        def mul ( self , x ) :
            ta = a * x.a + b * x.b * 5
            tb = a * x.b + b * x.a
            return self.a , self.b , self.a , self.b
    def sqrt ( a ) :
        mn = 0
        mx = a + 0
        while mn < mx :
            av = mn + mx + 1 / 2
            tmp = av * av
            if tmp <= a :
                mn = av
            else :
                mx = av - 1
        return mn , mx
    def run ( self ) :
        input = raw_input ( )
        tn = input ( )
        for test in range ( 1 , tn + 1 ) :
            n = input ( )
            if n > 500 :
                n = 200 + n % 100
            res = num ( 1 , 0 )
            a = num ( 3 , 1 )
            for nn in range ( n ) :
                if nn & 1 :
                    res = res * a
                a = a * a
            tmp = res.b * res.b * 5
            tmp = sqrt ( tmp )
            tmp = tmp + res.a
            tmp = tmp % 1000
            ans = str ( ans )
            print ( "Case #%d: %s" % ( test , ans ) )
