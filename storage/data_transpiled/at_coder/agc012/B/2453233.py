def _import ( ) : return sys.stdin
import termios
import sys
import struct
import struct
import sys
import termios
import sys
class Main ( object ) :
    def __init__ ( self ) :
        termios.tcsetattr ( sys.stdin , termios.TCSADRAIN , self._termios )
        self._termios = termios.tcgetattr ( sys.stdout )
        self._termios = self._termios
        self._termios = self._termios
        self._bufsize = 1 << 12
        self.stream = sys.stdin
        self._readline = self._readline
        self._bufsize = 0
        self._graph = self._build_graph ( self.stream , self._bufsize , self._bufsize )
        self._q = self._bufsize
        self._dp = [ ]
        while self._eof :
            self._ch = self._ch
        self._ch = self._ch
        self._g_numchars = self._g_numchars
        self._g_numchars = self._g_numchars
        self._g_numchars = self._g_numchars
        self._g_numchars = self._g_numchars
    def _next ( self ) :
        c = self._skip_while_space ( )
        while self._ch == ' ' or self._ch == '\n' or self._ch == '\t' or self._g_numchars == - 1 :
            self._g_numchars = self._g_numchars
        self._g_numchars = self._g_numchars
        self._g_numchars = self._g_numchars
        self._g_numchars = self._g_numchars
    def _next ( self ) :
        c = self._g_next ( )
        while self._ch == ' ' :
            self._g_numchars = self._g_numchars
        self._g_numchars = self._g_numchars
        self._g_numchars = self._g_numchars
        self._g_numchars = self.g_numchars
    def _next ( self ) :
        c = self._g_next ( )
        while self._ch == ' ' :
            self._g_numchars