def _import ( ) : return sys.stdin.read ( )
import io
import sys
import os
import sys
import sys
import os.path
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.rfile = sys.stdin
        self.wfile = sys.stdout
        self.rfile = io.open ( self.rfile )
        self.wfile = io.open ( self.wfile )
        self.solver = BReversi ( )
        self.solve ( 1 , self.rfile , self.wfile )
        self.wfile.close ( )
class BReversi ( object ) :
    def __init__ ( self ) :
        self.MOD = int ( 1e9 ) + 7
    def solve ( self , test_number , f , out ) :
        n = self.rfile.tell ( )
        c = f.read ( n , 1 )
        f = [ 1 ] * 200005
        f [ c [ 1 ] ] = 1
        for i in range ( 2 , n + 1 ) :
            if c [ i ] != c [ i - 1 ] :
                f [ c [ i ] ] = Op ( f [ c [ i ] ] , f [ c [ i - 1 ] ] , self.MOD )
            out.write ( f [ c [ n ] ] )
    class Op ( object ) :
        def addmod ( self , x , y , MOD ) :
            return ( ( x + y ) >= MOD )
    class InputReader ( io.BufferedReader ) :
        def __init__ ( self ) :
            self.stream = io.BytesIO ( )
            self.buf = io.BytesIO ( )
            self.curChar = 0
            self.numChars = 0
            while True :
                if c < '0' or c > '9' :
                    raise InputError ( )
                self.curChar *= 10
                self.numChars = len ( self.buf )
                self.buf = io.BytesIO ( )
            if not self.isSpaceChar ( ) :
                return - 1
    def read ( self ) :
        self.stream.seek ( 0 )
        self.buf = io.BytesIO ( )
        self.curChar = 0
        self.numChars = 0
        while True :
            self.buf = io.read ( )
            