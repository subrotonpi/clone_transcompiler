def _import ( ) : return sys.stdin.read ( 1024 )
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        sc = FastScanner ( )
        w = sc.next ( ).decode ( 'utf-8' )
        n = len ( w )
        c = w [ 0 ]
        flg = False
        for i in range ( 1 , n ) :
            if c != w [ i ] :
                flg = True
                break
        if not flg :
            print ( n )
            print ( 1 )
            return
        rw = [ ]
        for i in range ( n ) :
            rw.append ( w [ n - i - 1 ] )
        g = _calc ( w )
        rg = _calc ( rw )
        if g [ n ] :
            print ( 1 )
            print ( 1 )
            return
        else :
            ans = 0
            for i in range ( 1 , n ) :
                if g [ i ] and rg [ n - i ] :
                    ans += 1
            print ( 2 )
            print ( ans )
    def calc ( self ) :
        n = len ( self )
        z = _z ( self )
        G = [ True ] * n + [ False ] * n
        for p in range ( 1 , n ) :
            for k in range ( 2 , ( n - 1 ) * p + 1 ) :
                G [ k * p ] = False
        return G
class FastScanner ( object ) :
    def __init__ ( self ) :
        self.debug = None
    def __init__ ( self ) :
        self.debug = None
    def __init__ ( self ) :
        self.buflen = None
    def read ( self ) :
        self.buflen = None
    def write ( self , data ) :
        self.buflen = None
    def write ( self , data ) :
        self.buflen = None
