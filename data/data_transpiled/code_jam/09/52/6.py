def _import ( a , ws ) :
    import sys
    import string
    import sys
    class x :
        def __init__ ( self ) :
            self.w = [ ]
            self.a = [ ]
            self.j , k , n = a.split ( ' ' )
            self.s = s
            self.cnt = [ ]
            self.MOD = 10009
            self.tot = 0
        def doall ( self , sp , ws ) :
            if sp < 0 :
                cnt = [ 0 ] * 26
                for z in self.w [ self.a [ i ] ] :
                    for c in z :
                        cnt [ c - 'a' ] += 1
            sum , mul = 0 , 1
            for c in s :
                if c == '+' :
                    sum += mul
                    mul = 1
                else :
                    mul = ( mul * cnt [ c - 'a' ] ) % MOD
            sum += mul
            f = [ 1 ] * 10
            for i in range ( 1 , self.j + 1 ) :
                f [ i ] = f [ i - 1 ] * i
            ca = [ 0 ] * 20
            for c in a [ j ] :
                ca [ c ] += 1
            cf = f [ j ]
            for i in range ( self.n ) :
                cf /= f [ ca [ i ] ]
            tot = ( tot + sum * cf ) % MOD
    else :
        for i in range ( ws , self.n ) :
            a [ sp ] = i
            doall ( self.sp - 1 , i )
