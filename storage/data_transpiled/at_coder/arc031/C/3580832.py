def _import ( ) : return int ( next ( ) )
def __next__ ( n ) : return int ( next ( ) )
def __next__ ( n ) : return next ( )
def __next__ ( n ) : return next ( )
def __next__ ( n ) : return next ( )
def __next__ ( n ) : return next ( )
def __next__ ( n ) : return next ( )
def solve ( ) :
    F = [ ]
    bit = BinaryIndexedTree ( N + 1 )
    for i in range ( N ) :
        f = i - bit.sum ( B [ i ] )
        F [ B [ i ] ] = f
        bit.add ( B [ i ] , 1 )
    [ bit.bit ] = 0
    G = [ ]
    for i in range ( N - 1 , - 1 , - 1 ) :
        g = ( N - 1 - i ) - bit.sum ( B [ i ] )
        G [ B [ i ] ] = g
        bit.add ( B [ i ] , 1 )
    ans = 0
    for i in range ( 1 , N + 1 ) :
        ans += min ( F [ i ] , G [ i ] )
    return ans
class BinaryIndexedTree ( BinaryIndexedTree ) :
    def __init__ ( self , n ) :
        self.n = n
        self.bit = [ ]
    def add ( self , v ) :
        self.i += 1
        while self.i <= n :
            self.bit.append ( v )
            self.i += self.i & - self.i
    def sum ( self ) :
        self.i += 1
        ret = 0
        while self.i > 0 :
            ret += self.bit [ self.i ]
            self.i -= self.i & - self.i
        return ret
from itertools import chain , repeat
class FastScanner ( object ) :
    def __init__ ( self ) :
        self.stream = sys.stdin
        self.stream = sys.stdout
        self.next = None
    def __next__ ( self ) :
        if self.stream is sys.stdout :
            try :
                self.stream = sys.stdin
            except AttributeError :
                pass
