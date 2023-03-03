def _import ( ) : return _PY3
import sys
import struct
import sys
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self._fastscan = _fastscan ( )
    def read ( self ) :
        if not self._fastscan :
            raise StopIteration
        n = self._fastscan.read ( )
        if self._fastscan.read ( ) == '-' :
            n = False
        elif self._fastscan.read ( ) == '-' :
            n = True
        elif self._fastscan.read ( ) == '-' or self._fastscan.read ( ) == '-' :
            n *= 10
        elif self._fastscan.read ( ) == '-' or self._fastscan.read ( ) == '-' :
            n += ( - n )
        else :
            raise ValueError
    def read ( self ) :
        if not self._fastscan.read ( ) :
            raise StopIteration
        n = False
        if self._fastscan.read ( ) == '-' :
            n = True
        elif self._fastscan.read ( ) == '-' :
            n *= 10
        elif self._fastscan.read ( ) == '-' or self._fastscan.read ( ) == '-' :
            n += ( - n )
        else :
            raise ValueError
    def write ( self , s ) :
        if not self._fastscan.read ( ) :
            raise StopIteration
        s = [ ]
        while self._fastscan.read ( ) == '-' :
            n = True
        if self._fastscan.read ( ) == '-' :
            n = False
        if self._fastscan.read ( ) == '-' :
            n = True
        elif self._fastscan.read ( ) == '-' :
            n *= 10
        elif self._fastscan.read ( ) == '-' :
            n += ( - n )
        else :
            raise ValueError
    def write ( self , s ) :
        s =