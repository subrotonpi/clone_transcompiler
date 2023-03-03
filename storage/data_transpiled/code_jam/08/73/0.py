def _ _ main _ _ ( ) : return int ( sys.stdin.readline ( ) )
def get_int ( ) : return sys.stdin.readline ( )
def get_ints ( ) : return sys.stdin.readline ( ).split ( )
def get_ints ( ) :
    s = sys.stdin.readline ( ).split ( )
    q = [ ]
    for tr in range ( 1 , M ) :
        if len ( q ) == 0 : break
        t = q.pop ( )
        r += math.exp ( - t.val )
        bm = t.bits
        for i in range ( M ) :
            o = int ( ( bm >> 2 * i ) )
            nbm = bm + ( 1 << ( 2 * i ) )
            if o < 3 and a [ i ] [ o + 1 ] < BIGBAD and not ( nbm in done ) :
                q.append ( [ nbm , t.val - a [ i ] [ o + 1 ] ] )
                done.append ( nbm )
    return '' , r
def get_oubs ( ) :
    s = sys.stdin.readline ( ).split ( )
    r = [ ]
    for i in range ( M ) :
        r.append ( float ( s [ i ] ) )
    return r
class Thing ( object ) :
    def __init__ ( self , b , v ) :
        self.val = v
        self.bits = b
    def equal ( self , t ) :
        if not isinstance ( t , Thing ) : return False
        return self.equal ( t.bits )
    def __lt__ ( self , t ) :
        if t.val > self.val : return - 1
        if t.val < self.val : return 1
        if t.bits < self.bits : return - 1
        if t.bits > self.bits : return 1
        return 0
    def __lt__ ( self , t ) : return self.val < - self.bits
q = [ ]
done = [ ]
a = [ ]
BIGBAD = 10000
def docase ( ) :
    params = get_ints ( )
    M = params [ 0 ]
    Q = params [ 1 ]
    q = [ ]
    a = [ ]
    for i in range (