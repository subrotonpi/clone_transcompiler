def _import ( ) : return sys.stdin
import os
import os
import sys
import os
import sys
import itertools
import itertools
def clear ( ) :
    [ ct , i ] = 1
class Main ( object ) :
    def __init__ ( self , a ) :
        self.rfile = sys.stdin
        self.wfile = sys.stdout
        self.stdin = MyScan ( self.rfile )
        self.wfile = sys.stdout
        self.stdin = MyScan ( self.rfile )
        self.wfile = MyScan ( self.wfile )
        self.union ( 1 , self.stdin , self.wfile )
        self.wfile.close ( )
class TaskD ( object ) :
    def solve ( self , test_number , f , g ) :
        n = f.randint ( 1 , 10 )
        m = f.randint ( 1 , 10 )
        data = [ f.randint ( 1 , 10 ) for s in range ( n ) ]
        ds = DS ( n )
        for f in range ( m ) :
            ds.union ( f.randint ( 1 , 10 ) , f.randint ( 1 , 10 ) )
        l = 0
        for s in range ( n ) :
            if ds.root ( s ) == ds.root ( data [ s ] ) :
                l += 1
        g.write ( l )
class MyScan ( object ) :
    def __init__ ( self , f ) :
        self.rfile = f
        self.inbuf = f.read ( 1024 )
    def read ( self ) :
        if self.inbuf == - 1 : raise InputError ( )
        if self.ptrbuf >= self.lenbuf :
            self.ptrbuf = 0
            try :
                self.lenbuf = self.read ( self.inbuf )
            except EOFError :
                raise InputError ( )
            if self.lenbuf <= 0 : return - 1
        return self.inbuf [ self.ptrbuf ]
    def read ( self ) :
        num , b = 0 , 0
        minus = False
        while ( b != self.readByte ( ) and not ( ( b >= '0' and b <= '9' ) or b == '-' ) ) :
            num += 1
        return num
