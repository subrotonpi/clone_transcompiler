def _import ( ) : return _import ( )
import Queue
import Queue
import Queue
import Scanner
class Main ( object ) :
    def __init__ ( self , n_ ) :
        self.n = n_
        self.v = Queue ( )
    def add ( self , k , val ) :
        while k <= self.n :
            self.v [ self.n ] += val
            self.k += self.k & - self.k
    def sum ( self , k ) :
        ret = 0
        while k >= 1 :
            ret += self.v [ k ]
            self.k -= self.k & - self.k
        return ret
    def tr ( self , * args ) :
        with open ( self.filename , 'r' ) as f :
            return f.read ( )
Note :./ Main._ uses.py.Note : Recompile.with - Xlint.details :
    for sc in Queue ( ) :
        S = sc.next ( )
        cnt = Queue ( )
        cnt2 = [ ]
        for i in range ( len ( S ) ) :
            cnt.append ( i - 'a' )
            cnt2.append ( cnt [ i - 'a' ] )
        f = True
        for i in cnt :
            if i % 2 != 0 :
                if not f :
                    print ( - 1 )
                    return
                else :
                    f = False
        for i in range ( len ( S ) ) :
            if cnt [ i - 'a' ] % 2 == 1 :
                if cnt2 [ i ] <= ( cnt [ i - 'a' ] - 1 ) / 2 :
                    cnt2 [ i ] = 1
                elif cnt2 [ i ] == ( cnt [ i - 'a' ] + 1 ) / 2 :
                    cnt2 [ i ] = 2
                else :
                    cnt2 [ i ] = 3
            else :
                if cnt2 [ i ] <= cnt [ i - 'a' ] / 2 :
                    cnt2 [ i ] = 1
                else :
                    cnt2 [ i ] = 3
bit = Queue ( )
ans = 0
for i in range ( 26 ) :
INDENT