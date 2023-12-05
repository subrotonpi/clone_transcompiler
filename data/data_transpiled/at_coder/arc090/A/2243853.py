def _import ( ) : return sys.stdin.read ( )
import termios
import sys
import struct
import termios
import sys
class Main ( object ) :
    def __init__ ( self ) :
        termios.tcsetattr ( sys.stdin , termios.TCSADRAIN , self._termios )
        def __getattr__ ( self , attr ) :
            return self._termios.tcgetattr ( self._termios )
        def __getattr__ ( self , attr ) :
            return self._termios.tcgetattr ( self._termios )
        def __getitem__ ( self , i ) :
            return self._termios.tcgetattr ( self._termios )
        def __getitem__ ( self , i ) :
            return self._termios.tcgetattr ( self._termios )
        def __getitem__ ( self , i ) :
            return self._termios.tcgetattr ( self._termios )
        def __getitem__ ( self , i ) :
            return self._termios.tcgetattr ( self._termios )
        def __getitem__ ( self , j ) :
            before_max = 0
            if i >= 1 :
                before_max = max ( before_max , dp [ i - 1 ] [ j ] )
            if j >= 1 :
                before_max = max ( before_max , dp [ i ] [ j - 1 ] )
            dp [ i ] [ j ] += before_max
    def debug ( * x ) :
        sys.stderr.write ( ''.join ( str ( x ) for x in x ) )
    def read ( self , buf ) :
        self._termios.tcsetattr ( self._termios , termios.TCSADRAIN , self._termios.tcgetattr ( self._termios ) )
        if not buf :
            raise IOError ( )
        if buf [ 0 ] >= 0 :
            buf = buf [ 1 : ]
        return buf
    def readline ( self ) :
        c = self._termios.tcgetattr ( self._termios )
        if c < 0 or c > '9' :
            raise InputError ( )
        res *= 10
        res += c - '0'
        c = next ( self._termios.tcsetattr ( self._termios , termios.TCSADRAIN , self._termios.tcgetattr ( self._termios )