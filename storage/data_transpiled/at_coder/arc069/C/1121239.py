def import _main
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = len ( sys.stdin )
        self.p = [ ]
        for i in range ( n + 1 ) :
            self.p.append ( ( i + 1 , sys.stdin.read ( ) ) )
        self.p.append ( ( 0 , 0 ) )
        self.p.sort ( )
    def run ( self ) :
        self.n = len ( sys.stdin )
        self.p = [ ]
        for i in range ( n ) :
            self.p.append ( ( i + 1 , self.p [ i ] ) )
        self.p.append ( ( 0 , 0 ) )
        self.p.sort ( )
        res = [ 0 ] * n
        cnt = 0
        idmin = self.n + 1
        for i in range ( n ) :
            now_p = self.p [ i ]
            idmin = min ( idmin , now_p.id )
            cnt += 1
            while now_p.cnt == self.p [ i + 1 ].cnt :
                i += 1
                cnt += 1
            res [ idmin ] += cnt * ( now_p.cnt - self.p [ i + 1 ].cnt )
        lines = [ "%s\n" % res [ i ] for i in range ( 1 , n + 1 ) ]
        sys.stdout.write ( "".join ( lines ) )
class Pair ( object ) :
    def __init__ ( self , id , cnt ) :
        self.id = id
        self.cnt = cnt
    def __init__ ( self , * args ) :
        self.id = id
        self.cnt = cnt
    def __call__ ( self , * args ) :
        if self.cnt == self.cnt :
            return self.id - self.id
        return - cmp ( self.cnt , self.cnt )
