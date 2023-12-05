def import __main__
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        s = sc.readline ( )
        a , b = [ s [ i ] for i in range ( n ) ] , [ s [ 2 * n - 1 - i ] for i in range ( n ) ]
        am , bm = get ( a ) , get ( b )
        keyset = am.keys ( )
        res = 0
        for x in keyset :
            try :
                aa , bb = am [ x ] , bm [ x ]
                res += aa * bb
            except :
                pass
        print ( res )
    def get ( a ) :
        n = len ( a )
        d = { }
        jou = 1 << n
        for i in range ( jou ) :
            tane = ""
            taneb = ""
            for j in range ( n ) :
                if ( ( i >> j ) & 1 ) == 1 :
                    tane += a [ j ]
                else :
                    taneb += a [ j ]
            key = tane + ":" + taneb
            if key in d :
                d [ key ] = d [ key ] + 1
            else :
                d [ key ] = 1
        return d
return Main
