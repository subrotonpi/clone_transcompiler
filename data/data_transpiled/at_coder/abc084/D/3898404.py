def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Q = sys.stdin.read ( )
    def __init__ ( self ) :
        self.l = [ ]
        self.r = [ ]
        for i in range ( self.Q ) :
            l.append ( i )
            r.append ( i )
        self.prime_cnt = [ ]
        prime = [ True ] * 100001
        prime [ 0 ] = False
        prime [ 1 ] = False
        cnt = 0
        for i in range ( 2 , 100000 ) :
            c = 2
            while i * c <= 100000 :
                prime [ i * c ] = False
                c += 1
        for i in range ( 3 , 100000 ) :
            if not prime [ ( i + 1 ) / 2 ] or not prime [ i ] :
                self.prime_cnt.append ( cnt )
                continue
            cnt += 1
            self.prime_cnt.append ( cnt )
        for i in range ( self.Q ) :
            print ( self.prime_cnt [ r [ i ] ] - self.prime_cnt [ l [ i ] - 1 ] )
