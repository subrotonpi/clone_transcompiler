def import _readline
class C ( object ) :
    def __init__ ( self , dx = [ - 1 , 0 , 0 , 1 ] , dy = [ 0 , - 1 , 1 , 0 ] , H = 0 , W = 0 ) :
        self.dx = [ - 1 , 0 , 0 , 1 ]
        self.dy = [ 0 , - 1 , 1 , 0 ]
        self.H , self.W = self.H , self.W
        self.key = "welcome to code jam"
        self.M = 10000
    def main ( self , arg ) :
        N = randint ( 1 , N )
        for ii in range ( 1 , N + 1 ) :
            s = raw_input ( )
            dp = [ ]
            ans = 0
            for i in s :
                if i == self.key [ 0 ] :
                    ans += 1
                dp [ 0 ].append ( ans )
            for j in range ( 1 , len ( dp ) ) :
                for k in range ( 1 , len ( dp [ j ] ) ) :
                    dp [ j ] [ k ] = dp [ j ] [ k - 1 ] % M
                    if s [ k ] == self.key [ j ] :
                        dp [ j ] [ k ] += dp [ j - 1 ] [ k - 1 ]
                        dp [ j ] [ k ] = dp [ j ] [ k ] % M
            ans = dp [ - 1 ] [ - 1 ]
            sys.stdout.write ( "Case #%d: %04d\n" % ( ii , ans % M ) )
    def randint ( self ) :
        i = 0
        negative = False
        while i < 44 :
            i = sys.stdin.read ( 1 )
        if i == 45 :
            negative = True
            i = 0
        else :
            i = i - 48
        j = sys.stdin.read ( 1 )
        while j > 47 :
            i *= 10
            i += j - 48
            j = sys.stdin.read ( 1 )
        return ( negative , i )
    def readline ( self ) :
        b = [ 500 ]
        j = sys.stdin.read ( 1 )
        while j < 32 :
            j = sys.stdin.read ( 1 )
            