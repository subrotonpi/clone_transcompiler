def import isPrime
class Main ( object ) :
    def __init__ ( self ) :
        self.f = [ False ] * 100001
    def isPrime ( self ) :
        sc = sys.stdin
        q = sc.readline ( ).strip ( )
        l = [ ]
        r = [ ]
        for i in range ( q ) :
            left = sc.readline ( ).strip ( )
            right = sc.readline ( ).strip ( )
            l.append ( left )
            r.append ( right )
        self.isPrime ( )
        cnt = [ 0 ] * 100002
        for i in range ( 3 , 100000 + 1 ) :
            if not f [ i ] and not f [ ( i + 1 ) / 2 ] :
                cnt [ i ] = cnt [ i - 1 ] + 1
            else :
                cnt [ i ] = cnt [ i - 1 ]
        for i in range ( q ) :
            ans = cnt [ r [ i ] ] - cnt [ l [ i ] - 1 ]
            print ( ans )
    def isPrime ( self ) :
        for i in range ( 2 , 100000 + 1 ) :
            if not f [ i ] :
                for j in range ( i + i , 100000 + 1 , i ) :
                    self.f [ j ] = True
