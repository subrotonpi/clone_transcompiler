def _import ( ) : return next ( )
import sys
import struct
import sys
import os
import sys
import struct
import sys
import os
import sys
import struct
import random
import random
import sys
class Main ( object ) :
    def f ( self ) :
        while a % 2 == 0 and 1 < a :
            a //= 2
        return a
    def g ( self ) :
        f = sys.stdout.buffer
        ( N , cnt ) = randint ( 1 , N )
        hs = set ( )
        for i in range ( N ) :
            hs.add ( f ( self.next ( ) ) )
        f ( len ( hs ) )
        f.write ( '\n' )
        f.flush ( )
    def read ( ) :
        if ptr < len ( self ) :
            return True
        else :
            ptr = 0
            try :
                buflen = os.read ( sys.stdin.buffer [ ptr : ] , BUFFER_SIZE )
            except OSError :
                pass
            if buflen <= 0 :
                return False
        return True
    def readByte ( ) :
        if ptr < len ( self ) :
            return self.next ( )
        else :
            return - 1
    def isPrintableChar ( c ) :
        return 33 <= c <= 126
    def hasNext ( ) :
        while ptr < len ( self ) and not isPrintableChar ( self [ ptr ] ) :
            ptr += 1
        return has_next_char ( )
    def next ( ) :
        if not hasNext ( ) :
            raise StopIteration
        s = [ ]
        b = readByte ( )
        while isPrintableChar ( b ) :
            s.append ( b )
            b = readByte ( )
        return s
    def nextLong ( ) :
        if not hasNext ( ) :
            raise StopIteration
        n = 0
        minus = False
        b = readByte ( )
        if b == '-' :
            minus = True
            b = readByte ( )
        if b < '0' or '9' < b :
            raise ValueError
        while True :
            if '0' <= b <= '9' :
                n *= 10
            else :
                n += 1
        return n
    