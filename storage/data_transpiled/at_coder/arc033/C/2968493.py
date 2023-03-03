def _import ( ) : return next ( iter ( [ _import ( '' ) ] ) )
def _readline ( ) : return next ( iter ( [ _readline ( ) ] ) )
class Main :
    def __init__ ( self , n ) :
        self.n = n
        self.data = [ ]
    def add ( self , v ) :
        for _ in range ( self.n ) :
            self.data.append ( self.data [ _ ] )
    def get ( self ) :
        res = 0 , 0
        for _ in range ( self.n ) :
            res += self.data [ _ ]
        return res
    def solve ( self ) :
        q = self.ni ( )
        lst = [ ]
        while q :
            t , x = self.ni ( ) * 2 - 3 , self.ni ( )
            lst.append ( t * x )
        bit = BIT ( 200001 )
        for v in lst :
            if v < 0 :
                bit.add ( - v , 1 )
            else :
                l , r = 0 , 200000
                while r - l > 1 :
                    c = ( l + r ) // 2
                    if bit.get ( c ) < v :
                        l , r = c , r
                out.write ( r )
                bit.add ( r , - 1 )
    def main ( self ) :
        self.solve ( )
        out.flush ( )
f = sys.stdin
f = sys.stdout
def read ( self , ptr = 0 ) :
    if ptr < self.buflen : return True
    ptr = 0
    try :
        buflen = f.read ( self.buflen )
    except AttributeError :
        pass
    return buflen
def is_space_char ( self ) :
    return not ( 33 <= self.c <= 126 )
def skip ( self ) :
    while ( self.n ) :
        res = self.data [ ptr ]
    return skip ( self )
