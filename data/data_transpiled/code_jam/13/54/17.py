def _ _ builtin _ _.py ' )
from os import urandom
import __builtin__ as builtins
class Wheel ( __builtin__ ) :
    def __init__ ( self ) :
        __builtin__.__dict__ [ '__builtin__' ] = __builtin__
        builtins.__dict__ [ '__builtin__' ] = __builtin__
    def solve ( self ) :
        ans = self.prof = ( self.prof >> 1 ) | ( ( self.prof & 1 ) << self.n - 1 )
        return min ( ans , self.prof )
    def __next__ ( self ) :
        while not self.fp or not self.fp.readline ( ) :
            try :
                self.fp = open ( self.fp.readline ( ) )
            except :
                self.eof = True
                return '0'
        return self.fp.readline ( )
    def __next__ ( self ) :
        return int ( __next__ )
    def __next__ ( self ) :
        return long ( __next__ )
    def nextDouble _ ( self ) :
        return float ( __next__ )
    FNAME = 'd'
    n = 0
    def solve ( self ) :
        for test , testn in enumerate ( [ 1 , 2 , 3 ] ) :
            print ( 'Case #%d: ' % test , end = ' ' )
            print ( 'Case #%d: ' % test , end = ' ' )
            s = next ( self )
            n = len ( s )
            prof = 0
            for i in range ( self.n ) :
                if s [ i ] == 'X' :
                    prof |= 1 << i
            prof = min ( prof )
            self.dict = { }
            self.count ( prof )
            print ( self.dict [ prof ] )
    def count ( self ) :
        if self.prof == ( ( 1 << self.n ) - 1 ) :
            self.dict [ prof ] = 0.0
        if self.dict.has_key ( self.prof ) :
            return 0.0
        win = 0
        for i in range ( self.n - 1 , - 1 , - 1 ) :
            if self.dict [ i ] == prof :
                win += 1
        return win
