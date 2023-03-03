def _import ( ) : return _import ( )
from struct import Struct , calcsize
from struct import Struct , calcsize
class Main ( Struct ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        sc = Struct ( '' )
        N = ord ( sc.read ( 1 ) )
        P = ord ( sc.read ( 1 ) )
        A = [ ]
        for i in range ( 1 , N + 1 ) :
            A.append ( sc.read ( 1 ) )
    def __next__ ( self ) :
        nl = unpack ( '<L' , 'i' ) [ 0 ]
        if nl < calcsize ( '<L' ) or nl > calcsize ( '>L' ) :
            raise ValueError ( )
        return int ( nl )
    def nextDouble ( self ) :
        return float ( next ( ) )
    def __next__ ( self ) :
        return int ( next ( ) )
    def __next__ ( self ) :
        return int ( next ( ) )
    def __next__ ( self ) :
        return int ( next ( ) )
    def __next__ ( self ) :
        if self.P == 1 :
            print ( dp [ - 1 ] [ 0 ] * 2 )
            dp [ - 1 ] [ 1 ] = dp [ - 1 ] [ 1 ] * 2
        else :
            dp [ - 1 ] [ 0 ] = dp [ - 1 ] [ 0 ] + dp [ - 1 ] [ 1 ]
            dp [ - 1 ] [ 1 ] = dp [ - 1 ] [ 1 ] + dp [ - 1 ] [ 0 ]
        if self.P == 1 :
            print ( dp [ - 1 ] [ 1 ] )
        else :
            print ( dp [ - 1 ] [ 0 ] )
class FastScanner ( Struct ) :
    def __init__ ( self ) :
        super ( FastScanner , self ).__init__ ( )
        self.ptr = 0
        self.buflen = 0
    def __next__ ( self ) :
        if self.ptr < buflen :
            return True
        else :
            ptr = 0
            try :
                self.buflen = len ( self.buffer )
            except AttributeError :
                pass
    return __next__
