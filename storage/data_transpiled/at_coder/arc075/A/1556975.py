def _import ( ) : return sys.stdin.read ( )
import termios
import sys
import struct
import termios
class Main ( object ) :
    def __init__ ( self ) :
        termios.tcsetattr ( 0 , termios.TCSADRAIN , self._termios )
        self._termios.tcsetattr ( 0 , termios.TCSADRAIN , self._termios )
        self._termios.tcsetattr ( 0 , termios.TCSADRAIN , self._termios )
        self._termios.tcsetattr ( 0 , termios.TCSADRAIN , self._termios )
        self._termios.tcsetattr ( 0 , termios.TCSADRAIN , self._termios )
        self._termios.tcsetattr ( 0 , termios.TCSADRAIN , self._termios )
        self._termios.tcsetattr ( 0 , termios.TCSADRAIN , self._termios )
        self._termios.tcsetattr ( 0 , termios.TCSADRAIN , self._termios )
        self._termios.tcsetattr ( 0 , termios.TCSADRAIN , self._termios )
        self._termios.tcsetattr ( 0 , termios.TCSADRAIN , self._termios )
    def debug ( self , * x ) :
        sys.stderr.write ( "".join ( str ( x ) for x in x ) )
