def _import ( ) : return ''
import sys
import os
import string
import string
import scanner
import scanner
import scanner
class Main ( Scanner ) :
    def __init__ ( self ) :
        scanner.scanner = scanner
        self.scanner = scanner
        self.scanner = scanner
        self.scanner.scanner.read = scanner.scanner.scanner
        self.scanner.scanner.read = scanner.scanner.scanner.read
        self.scanner.scanner.read = scanner.scanner.scanner.read
        self.scanner.scanner.read = scanner.scanner.scanner.read
        self.scanner.scanner.read = scanner.scanner.scanner.read
        self.scanner.scanner.read = scanner.scanner.scanner.read
        self.scanner.scanner.read = scanner.scanner.scanner.read
        self.scanner.scanner.read = scanner.scanner.scanner.read
        self.scanner.scanner.read = scanner.scanner.scanner.read
    def solve ( self , test_number , scanner , stream ) :
        x , y = scanner.next ( )
        z = long ( x * y - 1 )
        d = sqrt ( z )
        ans = d * 2
        if d * ( d + 1 ) > z :
            ans -= 1
        if x <= d or y <= d :
            ans -= 1
        stream.write ( ans )
    def sqrt ( self ) :
        i = max ( 0 , long ( math.sqrt ( n ) ) - 2 )
        while i * i <= n :
            i += 1
        return i - 1
class FastReader ( scanner ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.buf = ''
        self.curChar = scanner.next ( )
    def pread ( self ) :
        if self.scanner.next ( ) == ',' :
            self.scanner.next ( )
        if self.scanner.next ( ) == '-' :
            self.scanner.next ( )
        return res * self.scanner.next ( )
    def next_string ( self ) :
        char = scanner.next ( )
        self.scanner.next ( )
        self.scanner.read = scanner.next ( )
        return char
