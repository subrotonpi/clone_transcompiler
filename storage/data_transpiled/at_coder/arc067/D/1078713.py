def _import ( ) : return sys.stdin.read ( )
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
class W :
    def __init__ ( self , _v = 0 , i = 0 ) :
        self.val = _v
        self.idx = i
    def __iter__ ( self ) :
        while self.val is None or not self.val :
            try : self.val , self.idx = next ( self.val )
            except StopIteration : raise StopIteration
        return self.val
    def __next__ ( self ) :
        while self.val >= self.idx :
            self.val , self.idx = self._poll_last ( )
    def __next__ ( self ) :
        while self.val is None or not self.val :
            try : self.val , self.idx = next ( self.val )
            except StopIteration : raise StopIteration
        return self.val
    def __next__ ( self ) :
        return int ( self.val )
    def note ( self ) :
        self.N = 50000 + 10
    def mx ( self ) :
        self.tag = { }
    def push ( self , rt ) :
        if self.tag [ rt ] is not None :
            self.tag [ self.lson ( rt ) ] += self.tag [ rt ]
            self.tag [ self.rson ( rt ) ] += self.tag [ rt ]
            self.mx [ self.lson ( rt ) ] += self.tag [ rt ]
            self.tag [ rt ] = 0
    def lson ( self ) :
        return self.x << 1
    def rson ( self ) :
        return self.x << 1 | 1
    def modify ( self , rt , l , r , L , R , v ) :
        if R < l or L > r : return 0
        if L <= l and R >= r : return mx
        self.push ( rt )
        mid = ( l + r ) >> 1
        return max ( self.ask ( lson ( rt ) , mid , L , R ) , self.ask ( rson ( rt ) , mid + 1 , r , L , R ) )
