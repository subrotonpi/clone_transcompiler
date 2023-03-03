def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.f = [ ]
        self.p = [ ]
    def main ( self ) :
        sc = _main ( )
        N = sc.count ( )
        s = [ sc.next ( ) for i in range ( N ) ]
        norm = s [ : ]
        cnt = { }
        map = { }
        for i in range ( N ) :
            fac = { }
            div = s [ i ]
            for j in range ( 2 , 2 * j * div + 1 ) :
                k = 0
                while div % j == 0 :
                    div //= j
                    k += 1
                    if k % 3 == 0 :
                        norm [ i ] /= j ** 3
                if k % 3 > 0 :
                    fac [ i ] = j
                    fac [ i ] = k % 3
            sqrt = int ( math.floor ( math.sqrt ( div + 0.5 ) ) )
            if sqrt ** 2 == div and sqrt > 1 :
                fac [ i ] = sqrt
                fac [ i ] = 2
            else :
                fac [ i ] = div
                fac [ i ] = 1
            if norm [ i ] not in cnt :
                cnt [ norm [ i ] ] = 1
                map [ norm [ i ] ] = fac
            else :
                cnt [ norm [ i ] ] = cnt [ norm [ i ] ] + 1
    ans = 0
    for key in cnt.keys ( ) :
        if key == 1 :
            ans += 1
        else :
            norm_cnt = cnt [ key ]
            pair = 1
            cur = map [ key ]
            for i in range ( len ( cur [ 'f' ] ) ) :
                for j in range ( 3 - cur [ 'p' ] [ i ] ) :
                    check = float ( pair ) * cur [ 'f' ] [ i ]
                    if check > 10000000000l :
                        pair *= cur [ 'p' ] [ i ]
    print ( ans )
