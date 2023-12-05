def _import ( ) : return _import ( "" , "" )
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = FastScanner ( sys.stdin )
        s = self.next ( )
        self.n = 0
        self.n = self.read_byte ( )
        self.used = [ ]
        self.p = "abcdefghijklmnopqrstuvwxyz"
        if len ( s ) != 26 :
            for c in s :
                self.used.append ( c )
    def __next__ ( self ) :
        nl = next ( self.nl )
        if nl < int ( nl ) or int ( nl ) > int ( nl ) :
            raise ValueError ( )
        return next ( self.p )
    def nextDouble ( self ) :
        return float ( next ( self.nl ) )
if s == "zyxwvutsrqponmlkjihgfedcba" :
    print ( - 1 )
    return
index_swap1 = 0
for i in range ( len ( s ) - 1 ) :
    if s [ i ] < s [ i + 1 ] :
        index_swap1 = i
    c = 'z'
    for i in range ( index_swap1 , 26 ) :
        if s [ i ] > s [ index_swap1 ] and s [ i ] < c :
            c = s [ i ]
    print ( s [ : index_swap1 ] + c )
class FastScanner ( object ) :
    def __init__ ( self , f ) :
        self.f = f
    def __next__ ( self ) :
        self.ptr = 0
        self.buflen = 0
    def __next__ ( self ) :
        if self.ptr < self.buflen :
            return True
        else :
            self.ptr = 0
            try :
                buflen = self.f.read ( self.buflen )
            except AttributeError :
                pass
            if self.buflen <= 0 :
                return False
        return True
    def __next__ ( self ) :
        while self.ptr < self.buflen :
            self.ptr += 1
        return False
