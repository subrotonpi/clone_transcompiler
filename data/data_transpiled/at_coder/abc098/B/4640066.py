def _import ( ) : return sys.stdin.read ( )
import os
from sys import byteorder
from itertools import repeat
from itertools import chain
from itertools import repeat
from itertools import chain
from itertools import chain
from itertools import islice
from itertools import chain
class Main ( object ) :
    def __init__ ( self ) :
        self.rfile = sys.stdin
        self.wfile = sys.stdout
        self.fasta_stream = open ( self.rfile , 'w' )
        self.__next__ = repeat
    def read ( self ) :
        nl = next ( self.rfile )
        if nl < int ( self.rfile ) or self.rfile.read ( - 1 ) > self.wfile :
            raise ValueError ( )
        self.__next__ = repeat
        return next ( self.rfile )
    def write ( self , stream ) :
        try :
            stream.close ( )
        except StopIteration :
            pass
class BCutAndCount ( object ) :
    def solve ( self , test_number , stream , out ) :
        N = self.rfile.tell ( )
        S = stream.read ( )
        ans = - 1
        for head , tail in zip ( S , repeat ( N ) ) :
            cnt = 0
            for c in [ 'a' , 'z' ] :
                if c in head and c in tail :
                    cnt += 1
            ans = max ( ans , cnt )
        out.write ( self.__next__ )
class FastScanner ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.ptr = 0
        self.buflen = 0
    def __iter__ ( self ) :
        if self.ptr < self.buflen :
            return True
        else :
            self.ptr = 0
            try :
                self.buflen = stream.read ( self.buflen )
            except AttributeError :
                pass
            if self.buflen <= 0 :
                return False
        return True
    def read ( self ) :
        if self.ptr < self.buflen :
            raise IndexError ( )
        yield self.ptr
