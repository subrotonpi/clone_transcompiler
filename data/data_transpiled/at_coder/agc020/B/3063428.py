def _import ( stream ) : return stream
import sys
import io
import os
import io
import sys
import io
import codecs
import codecs
import sys
import struct
import sys
import struct
import termios
import struct
import struct
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.stdin = io.open ( self.stdin )
        self.stdout = io.open ( self.stdout )
        self.stdin = io.open ( self.stdin )
        self.stdout = io.open ( self.stdout )
        self.stdin.read ( 1 )
        self.stdout.read ( 1 )
        self.stdin.close ( )
        self.stdin.close ( )
    def read ( self ) :
        c = self.stdin.read ( 1 )
        while self.stdin.read ( 1 ) :
            c = self.stdin.read ( 1 )
        sgn = 1
        if c == '-' :
            sgn = - 1
            c = self.stdin.read ( 1 )
        res = 0
        while True :
            if c < '0' or c > '9' :
                raise InputError ( )
            res *= 10
            res += c - '0'
        while not self.stdin.read ( 1 ) :
            res += 1
        return res * sgn
    def _solve ( self , test_number , stream , out ) :
        n = self.stdin.read ( 1 )
        a = [ ]
        for i in range ( n ) :
            a.append ( self.stdin.read ( 1 ) )
        lo , hi = - 1 , - 1
        if a [ - 1 ] == 2 :
            lo , hi = 2 , 3
        else :
            out.write ( - 1 )
            return
        for i in range ( n - 2 , - 1 , - 1 ) :
            num = a [ - 1 ]
            mt = ( lo + num - 1 ) // num
            if mt * num > hi :
                out.write ( - 1 )
                return
            lo , hi = mt * num , mt // num
            hi = mt // num + num - 1
        out.write ( lo + " " + hi )