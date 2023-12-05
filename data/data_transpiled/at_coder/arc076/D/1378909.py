def _import ( stream ) : return stream
import sys
import io
import os
import struct
import struct
import sys
class Main ( stream ) :
    def __init__ ( self ) :
        stream = sys.stdin
        self.bufsize = 1024
    def read ( self ) :
        if self.bufsize == - 1 :
            self.bufsize = self.bufsize
        else :
            self.bufsize = self.bufsize
        self.bufsize = self.bufsize
        self.stream = stream
        self.bufsize = self.bufsize
        self.stream = stream
        self.bufsize = self.bufsize
        self.stream.read ( self.bufsize )
        self.bufsize = self.bufsize
        self.stream.read ( self.bufsize )
        self.bufsize = self.bufsize
        self.stream.read ( self.bufsize )
        self.bufsize = self.bufsize
        self.stream.read ( self.bufsize )
        self.stream.read ( self.bufsize )
    def read ( self ) :
        c = self.read ( )
        while self.bufsize :
            c = self.read ( self.bufsize )
            res = ''
            while self.bufsize :
                res += c
                c = self.read ( self.bufsize )
            while not self.isEOF ( ) :
                res += c
            return res
        return self.stream.read ( self.bufsize )
    def solve ( self , test_number , stream , self ) :
        n , m = self.bufsize , self.bufsize
        a = [ ]
        for i in range ( self.n ) :
            left , right = self.bufsize , self.bufsize
            a.append ( ( left , right , i ) )
        a.sort ( key = lambda x : x [ 0 ] )
        self.s = sorted ( a )
        self.s2 = sorted ( a )
        ans = 0
        last = 1
        for e in a :
            if last > m :
                break
            if last <= e [ 0 ] :
                self.s.append ( e )
                last += 1
                ans += 1
            elif not self.s :
                self.s.pop ( )
                self.s.pop ( )
                self.s2.pop ( )
            else :
                return self.index - o [ 0 ]