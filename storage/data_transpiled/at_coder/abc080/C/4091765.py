def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sys = sys
    def execute ( self ) :
        sc = open ( self.sys )
        ( N , F ) = sc.read ( ).split ( )
        P = [ [ ] for i in range ( N ) ]
        for fi in sc.split ( ) :
            F.append ( self.getMask ( fi ) )
        for pi in sc.split ( ) :
            for i in range ( 11 ) :
                P [ i ] [ j ] = int ( pi [ i ] )
        maxRev = int ( 0 )
        for mask in range ( 1 , 1024 ) :
            rev = 0
            for i in range ( N ) :
                rev += P [ i ] [ self.countOnes ( mask & F [ i ] ) ]
            maxRev = max ( maxRev , rev )
        print ( maxRev )
        sc.close ( )
    def getMask ( self ) :
        mask = 0
        for x in self.getMask ( ) :
            mask = mask * 2
            if int ( x ) == 1 :
                mask += 1
        return mask
    def countOnes ( self ) :
        cnt = 0
        while mask > 0 :
            if self.mask & 1 == 1 :
                cnt += 1
            mask = mask // 2
        return cnt
