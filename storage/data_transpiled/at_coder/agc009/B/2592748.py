def _import ( ) : return next ( )
import sys
import os
import sys
import getopt
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = InputReader ( sys.stdin )
        self.stdout = sys.stdout
        self.n = len ( self.stdin )
        self.graph = [ ]
        for i in range ( self.n ) :
            self.graph.append ( [ ] )
        self.isspace ( )
    def dfs ( now ) :
        ln = [ ]
        for to in self.graph [ now ] :
            a = dfs ( to )
            ln.append ( a )
        self.sort ( )
        if len ( ln ) == 0 :
            return 0
        max = 0
        for i in range ( len ( ln ) ) :
            max = max ( max , ln [ i ] + len ( ln ) - i )
        return max
    def debug ( * o ) :
        sys.stderr.write ( "".join ( o ) + "\n" )
    class Main ( object ) :
        def __init__ ( self ) :
            self.BUFFER_LENGTH = 1 << 12
            self.stream = open ( "/dev/null" , "r" )
            self.buf = ""
            self._buf = ""
            self.num_chars = 0
        def read ( self ) :
            self._buf = self._buf
            self.num_chars = self.num_chars
        def write ( self , buf ) :
            self._buf = self._buf
            self.num_chars = self.num_chars
        def read ( self ) :
            self._buf = self._buf
            self.num_chars = self.num_chars
        def write ( self , buf ) :
            self._buf = self._buf
            self.num_chars = self.num_chars
        def read ( self ) :
            self._buf = self._buf
            self.num_chars = self.num_chars
    def write ( self , buf ) :
        self._buf = self._buf
        self.num_chars = self.num_chars
