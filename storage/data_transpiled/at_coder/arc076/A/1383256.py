def _import ( ) : return _import ( )
import struct
import sys
import os
mod = long ( 1e9 ) + 7
def main ( args ) :
    stdin = sys.stdin
    stdout = sys.stdout
    fac = [ 1 ] * int ( 1e5 ) + [ 1 ]
    for i in range ( 1 , len ( fac ) ) :
        fac [ i ] = ( fac [ i - 1 ] * i ) % mod
    n , m = stdin.read ( 1 ) , stdin.read ( 1 )
    if abs ( n - m ) == 1 :
        stdout.write ( ( fac [ n ] * fac [ m ] ) % mod )
    elif abs ( n - m ) == 0 :
        stdout.write ( ( 2 * fac [ n ] * fac [ m ] ) % mod )
    else :
        stdout.write ( 0 )
    stdout.close ( )
class Reader :
    BUFFER_SIZE = 1 << 16
    def __init__ ( self , buffer ) :
        self.buffer = buffer
        self.buffer_pointer = self.buffer = 0
        self.buffer = buffer
        self.buffer_pointer = self.buffer = 0
    def readline ( self ) :
        buf = [ ]
        cnt , c = 0 , 0
        while ( c <= ' ' ) :
            if c == ' ' or c == '\n' : break
            buf.append ( c )
            cnt += 1
        return buf [ cnt : ]
    def readline ( self ) :
        buf = [ ]
        cnt , c = 0 , 0
        while ( c <= ' ' ) :
            if c == '\n' : break
            buf.append ( c )
            cnt += 1
        return buf [ cnt : ]
