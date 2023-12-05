def import _main
class Main ( object ) :
    class Sushi ( object ) :
        def __init__ ( self , t , d , dup = False ) :
            self.t = t
            self.d = d
            self.dup = dup
        def __lt__ ( self , other ) :
            return self.d - self.d
    def main ( args ) :
        sc = _main ( args )
        N , K = sc.regs [ 0 ]
        a = [ Sushi ( t , d , False ) for t , d in sc.regs [ 1 : ] ]
        a.sort ( )
        selected = [ False for i in range ( N + 1 ) ]
        for i in range ( N ) :
            if selected [ i ] [ 0 ] :
                a [ i ] [ 0 ].dup = True
            selected [ i ] [ 0 ] = True
        s = 0
        x = 0
        selected = [ False for i in range ( N + 1 ) ]
        for i in range ( K ) :
            s += i.d
            if not selected [ i ] [ 0 ] :
                x += 1
                selected [ i ] [ 0 ] = True
        smax = s + x ** 2
        q = K - 1
        while q >= 0 and not a [ q ] [ 0 ].dup :
            q -= 1
        p = K
        while q >= 0 :
            while p < N and selected [ p ] [ 0 ] :
                p += 1
            if p >= N :
                break
            s = s - a [ q ] [ 0 ] + a [ p ] [ 0 ]
            x += 1
            selected [ p ] [ 0 ] = True
            if s + x ** 2 > smax :
                smax = s + x ** 2
            q -= 1
            while q >= 0 and not a [ q ] [ 0 ].dup :
                q -= 1
        print ( "%d\n" % smax )
