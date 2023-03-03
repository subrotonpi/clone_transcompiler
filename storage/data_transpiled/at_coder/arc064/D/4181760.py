def import import math
class Main ( object ) :
    def __init__ ( self ) :
        self.n , self.k = self.n , self.k
        divs = self.divs ( n )
        nd = len ( divs )
        mod = 1000000007
        d = { }
        res = 0
        for i in range ( nd ) :
            div = divs [ i ]
            dd = self.divs ( div )
            nama = modpow ( k , ( div + 1 ) // 2 , mod )
            for d in dd [ : - 1 ] :
                nama = ( nama - d [ d ] + mod ) % mod
            d [ div ] = nama
            coef = ( div if div % 2 == 1 else div / 2 )
            res = ( res + nama * coef % mod ) % mod
        print ( res )
    def modpow ( a , b , mod ) :
        res = 1
        c = a
        while b > 0 :
            if b % 2 == 1 :
                res = res * c % mod
            c = c * c % mod
            b //= 2
        return res
    def divs ( x ) :
        res = [ ]
        size = [ ]
        i = 1
        for i in range ( x ) :
            if x % i :
                continue
            res.append ( i )
        if i * i == x :
            res.append ( i )
        i -= 1
        for i in range ( 0 , size ) :
            if x % i :
                continue
            res.append ( x // i )
        return [ res ]
