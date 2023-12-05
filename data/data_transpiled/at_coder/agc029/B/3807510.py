def _import ( ) : return _import ( )
import sys
import struct
import sys
class Main ( ) :
    FLOW = 0
    MAX_V = 400000
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.read ( 1 )
        A = [ ]
        d = { }
        for i in range ( N ) :
            A.append ( sc.read ( 1 ) )
            count = d.get ( A [ i ] )
            if count is None :
                d [ A [ i ] ] = 1
            else :
                d [ A [ i ] ] = count + 1
        A.sort ( )
        ans = 0
        for i in range ( N - 1 , - 1 , - 1 ) :
            count = d.get ( A [ i ] )
            if count is None :
                d [ A [ i ] ] = 1
            else :
                d [ A [ i ] ] = count + 1
        print ( ans )
class FastScanner ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
    def __init__ ( self , stream ) :
        self.stream = stream
    def __init__ ( self , stream ) :
        self.stream = stream
    def has_next_byte ( self ) :
        if self.ptr < self.stream._buffer :
            return True
        else :
            self.ptr = 0
            try :
                self.stream._buffer = stream._buffer [ self.ptr ]
            except IndexError :
                pass
            if self.stream._buffer <= self.stream._buffer :
                return False
    def next_byte ( self ) :
        if not self.stream._buffer :
            raise StopIteration
        s = [ ]
        for i in range ( self.stream._buffer.length ) :
            s.append ( self.stream._buffer [ i ] )
        return s
    def next_byte ( self ) :
        while self.stream._buffer and not self.stream._buffer :
            self.stream._buffer = stream._buffer [ self.stream._buffer.index ( self.stream._buffer [ i ] ) ]
        return next_byte ( self )
