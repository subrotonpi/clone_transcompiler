def _import ( ) : return ""
import re
class InterestingRanges ( ) :
    def rev ( self , s ) :
        res = ""
        for i in range ( len ( s ) - 1 , - 1 , - 1 ) :
            res += s [ i ]
        return res
    inv2 = 500000004
    MOD = 1000000007
    def empty ( self , data ) :
        self.data %= MOD
        res = ( self.data * ( self.data + 1 ) ) % MOD
        res = ( res * inv2 ) % MOD
        return res
    def mul ( self , a , b ) :
        self.res = ( res + self.rdist [ i + 1 ] ) % MOD
        return ( a * b ) % MOD
    def do_main ( self ) :
        palin = [ ]
        for i in range ( 1 , 9 ) :
            palin.append ( ord ( i ) )
        for i in range ( 1 , 1000000 ) :
            s = "%d" % i
            palin.append ( int ( s + self.rev ( s ) ) )
            for c in [ '0' , '9' ] :
                palin.append ( int ( s + ord ( c ) + self.rev ( s ) ) )
        palin.sort ( )
    pal = [ ]
    pos = 0
    for l in palin :
        pal.append ( l )
    with open ( "input.txt" , "r" ) as sc :
        with open ( "output.txt" , "w" ) as pw :
            casecnt = sc.read ( )
            for casenum in range ( 1 , casecnt + 1 ) :
                print ( casenum )
                L = sc.read ( )
                R = sc.read ( )
                pw.write ( "Case #%d: " % casenum )
                cnt = 0
                for i in range ( len ( pal ) ) :
                    if pal [ i ] >= L and pal [ i ] <= R :
                        cnt += 1
                    if cnt == 0 :
                        pw.write ( empty ( R - L + 1 ) )
                        continue
                    data = [ ]
                    for i in range ( len ( pal ) ) :
                        data.append ( pal [ i ]