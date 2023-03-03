def import _readline
import sys
class B ( object ) :
    def process ( self , c , f ) :
        res = "IMPOSSIBLE"
        n , m = read_int ( f )
        u = set ( [ ] )
        melt = set ( [ ] )
        mm = [ ]
        for i in range ( m ) :
            v = f.split ( )
            f = int ( v [ 0 ] )
            for j in range ( f ) :
                k = int ( v [ 2 * j + 1 ] ) - 1
                if v [ 2 * j + 2 ] == '0' :
                    u.add ( i )
                else :
                    melt.add ( i )
                    mm.append ( k )
        ans = [ ]
        ok = False
        while True :
            all = set ( )
            for i in range ( n ) :
                if ans [ i ] == 0 :
                    all.update ( u [ i ] )
                else :
                    all.update ( melt [ i ] )
            if len ( all ) == m :
                ok = True
                break
            finish = True
            for i in range ( m ) :
                if i not in all :
                    if ans [ mm [ i ] ] == 0 :
                        ans [ mm [ i ] ] = 1
                        finish = False
            if finish : break
        if ok :
            res = ""
            for i in ans :
                res += " " + str ( i )
            res = res [ 1 : ]
        print ( "Case #%d: %s" % ( c , res ) , file = sys.stderr )
