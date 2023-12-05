def _import ( ) : return _import ( )
from io import BytesIO
from time import time
from time import sleep
from itertools import izip , ifilter , islice
class Main ( object ) :
    def __init__ ( self , a , b ) :
        self.X = a + b
        if self.MOD >= 0 :
            self.MOD = 0
    @ staticmethod
    def readline ( ) :
        if not isinstance ( self.X , bytes ) or not isinstance ( self.X , bytes ) :
            try :
                return self.X.decode ( 'ascii' )
            except TypeError :
                raise TypeError ( 'readline must be a bytes' )
        return next ( self.X )
    def next_int64 ( self ) :
        a = [ ]
        for i in range ( self.N ) :
            a.append ( randint ( 0 , i ) )
        return next ( self.X )
    def solve ( self ) :
        Y = [ - 1 ] * 26
        for ij , num in enumerate ( X ) :
            if num > 0 :
                Y.append ( ij )
        dp = [ 1 ] * ( 1 << 25 )
        for s in range ( ( 1 << 25 ) - 1 ) :
            if not dp [ s ] :
                continue
            next_num = sum ( s ) + 1
            if next_num in Y :
                ij = Y [ next_num ]
                if self._is_ok ( s , ij ) :
                    dp [ s | ( 1 << ij ) ] = sum ( dp [ s ] , dp [ s | ( 1 << ij ) ] )
            else :
                for ij in range ( 25 ) :
                    if self._is_ok ( s , ij ) :
                        dp [ s | ( 1 << ij ) ] = sum ( dp [ s ] , dp [ s | ( 1 << ij ) ] )
        return dp [ ( 1 << 25 ) - 1 ]
    MOD = 1_000_000_007
    def _is_ok ( s , ij ) :
        if ( s & 1 << ij ) :
            return False
        u = ij - 5
        d = ij + 5
        if u >= 0 and d < 25 :
            uon = ( s & 1