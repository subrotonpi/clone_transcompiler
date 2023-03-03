def import _argmin
import __builtin__
import __builtin__
import __builtin__
import __builtin__
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        self.n , self.m , self.d = args
        for i , u1 , u2 in enumerate ( args ) :
            self.d [ u1 ] [ u2 ] = self.d [ u2 ] [ u1 ] = min ( self.d [ u1 ] [ u2 ] , self.d [ u2 ] [ u1 ] )
        self._argmin = _argmin
    def __init__ ( self , * args , ** kwargs ) :
        self._argmin = _argmin
