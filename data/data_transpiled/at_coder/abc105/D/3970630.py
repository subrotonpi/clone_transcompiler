def _import ( ) : return _import ( )
import sys
import struct
class Main ( object ) :
    def __init__ ( self ) :
        sc = _FastScanner ( )
        self.next = sc
        self.N = self.read_int ( )
        self.M = self.read_int ( )
        self.A = [ ]
        self.sum = [ ]
        for i in range ( 1 , N + 1 ) :
            self.A.append ( sc.randint ( 0 , i ) )
            self.sum.append ( ( self.sum [ - 1 ] [ 1 ] + A [ i ] ) % M )
            self.sum.append ( ( self.sum [ - 1 ] [ 2 ] + A [ i ] ) )
        self.sum.sort ( key = lambda obj1 : obj1 [ 1 ] )
        self.ans = 0
        mod = M - 1
        dist = 0
        for i in range ( N , - 1 , - 1 ) :
            if self.sum [ i ] [ 1 ] != mod :
                mod = self.sum [ i ] [ 1 ]
                dist = 1
            else :
                self.ans += dist
                dist += 1
        print ( self.ans )
class FastScanner ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.ptr = 0
        self.buflen = 0
    def read ( self ) :
        if not self.hasNext :
            raise StopIteration
        buffer = [ ]
        while self.stream.read ( self.ptr ) :
            self.stream.write ( self.buffer [ self.ptr ] )
        if self.stream.read ( self.buflen ) <= 0 :
            return self.stream.read ( self.buflen )
        return buffer
    def write ( self , buffer ) :
        if self.stream.read ( self.ptr ) == 0 :
            return buffer [ self.ptr ]
        else :
            return - 1
