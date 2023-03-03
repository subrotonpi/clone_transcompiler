def import import sys , StringIO , QQ , QQ
class D ( sys.stdout ) :
    def __init__ ( self , arg ) :
        self.arg = arg
        self.MOD = 1000000007
    def solve ( self ) :
        if self.arg is None or not self.arg :
            try :
                self.arg = open ( self.arg ).readline ( )
            except IOError :
                pass
            return self.arg
        else :
            return int ( self.arg )
    def solve ( self ) :
        if self.arg is None :
            return
        else :
            return sys.stdin.read ( )
    def solve ( self ) :
        for test in range ( 1 , test_no + 1 ) :
            r = self.arg [ 0 ]
            c = self.arg [ 1 ]
            sum = 0
            for i in range ( c ) :
                cnt = [ ]
                cnt [ 0 ].append ( cnt [ 1 ] [ 0 ] )
                for j in range ( r ) :
                    if j + 2 <= r :
                        cnt [ 1 ].append ( ( cnt [ 1 ] [ j + 2 ] + cnt [ 0 ] [ j ] ) % MOD )
                    cnt [ 0 ].append ( cnt [ 0 ] [ j + 1 ] )
                    cnt [ 1 ].append ( cnt [ 1 ] [ j ] )
                    if j + 3 <= r and c % 4 == 0 and i % 4 == 0 :
                        cnt [ 0 ].append ( cnt [ 0 ] [ j + 3 ] + 4 * cnt [ 1 ] [ j ] ) % MOD )
                    if j + 2 <= r and c % 6 == 0 and i % 6 == 0 :
                        cnt [ 0 ].append ( cnt [ 0 ] [ j + 2 ] + 6 * cnt [ 1 ] [ j ] ) % MOD )
                    if j + 2 <= r and c % 3 == 0 and i % 3 == 0 :
                        cnt [ 0 ].append ( cnt [ 0 ] [ j + 2 ] + 3 * cnt [ 1 ] [ j ] ) % MOD )
                sum = ( sum + cnt [ 0 ] [ r ] + cnt [ 1 ] [ r ] ) % MOD
            ans = ( sum * QQ ( c ).modInverse ( QQ (