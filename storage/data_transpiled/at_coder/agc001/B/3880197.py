def _import ( ) : return _import ( )
import sys
import struct
import math
class Main ( object ) :
    def solve ( ) :
        n = scan.next ( )
        x = scan.next ( )
        out.write ( 3 * ( n - gcd ( n , x ) ) )
    def gcd ( a , b ) :
        if b == 0 : return a
        if a == 0 : return b
        return gcd ( b , a % b )
    def read ( ) :
        scan = _import ( sys.stdin , sys.stdout )
        out = _import ( sys.stdout , sys.stderr )
        solve ( )
        out.flush ( )
        out.close ( )
    def main ( ) :
        if filter : return filter ( lambda x : x in [ ' ' , '\r' , '\t' ] )
    def read ( ) :
        c = scan.next ( )
        res = [ ]
        while not isSpaceChar ( c ) and c != '.' :
            if c == 'e' or c == 'E' : return res * pow ( 10 , randint ( 1 , 10 ) )
            if c < 0 or c > '9' : raise InputError ( )
            res /= 10
            res += ( c - '0' ) * m
        return res * sgn
    def read ( ) :
        c = scan.next ( )
        res = [ ]
        while not isSpaceChar ( c ) :
            if c == ' ' or c == '\r' or c == '\t' : return res
            if c < 0 or c > '9' : raise InputError ( )
            res /= 10
            res += ( c - '0' ) * m
        return res
    def read ( ) :
        scan = _import ( sys.stdin , sys.stdout )
        out = _import ( sys.stdout , sys.stderr )
        solve ( )
        out.flush ( )
        out.close ( )
    def read ( ) :
        return _import ( None , sys.stdin , sys.stdout )
