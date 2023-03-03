def _import ( amt ) : return amt
import sys
import struct
import math
import text
import util
import concurrent
class B :
    def __init__ ( self , v_in , t_in ) :
        self.v , self.vt = v_in
        self.vt = v_in * t_in
    def readline ( self ) : return str ( self.vt )
def _import ( ) :
    while not sys.stdin.readline ( ) or not sys.stdin.readline ( ) :
        sys.stderr.write ( "\n" )
        sys.exit ( 1 )
    return B.readline ( )
def _import ( ) :
    try :
        return _import ( )
    except EOFError :
        sys.stderr.write ( "\n" )
        sys.exit ( 1 )
def _import ( ) :
    return int ( _import ( ) )
def _import ( ) :
    return _import ( )
def _import ( ) :
    return _import ( )
def _import ( ) :
    return _import ( )
try :
    import readline
except ImportError :
    pass
else :
    import sys
    readline.parse_and_bind ( )
return _import ( )
