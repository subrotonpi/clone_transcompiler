def import _readline
import sys
import os
import sys
import sys
import os
import sys
import sys
import struct
import struct
import struct
import sys
class Main ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.stream = stream
        self.stream = stream
        self.writer = writer
        self.solver = TaskB ( )
        self.solve ( 1 , stream , self.stream )
        self.stream.close ( )
class TaskB ( object ) :
    def solve ( self , test_number , sc , stream ) :
        r , b , x , y = sc.unpack ( '!H' )
        ok = 0
        ng = max ( r , b )
        while abs ( ok - ng ) > 1 :
            mid = ( ok + ng ) / 2
            if can_make ( r , b , x , y , mid ) :
                ok = mid
            else :
                ng = mid
        stream.write ( ok )
    def can_make ( r , b , x , y , s ) :
        r -= s
        b -= s
        return ( r >= 0 and b >= 0 ) and ( r / ( x - 1 ) + b / ( y - 1 ) >= s )
class Scanner ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.buffer = bytearray ( 1024 )
        self.ptr = 0
        self.buflen = 0
    def has_next_byte ( self ) :
        if self.ptr < self.buflen :
            return True
        else :
            self.ptr = 0
            try :
                self.buflen = stream.read ( self.ptr )
            except AttributeError :
                pass
            if self.buflen <= 0 :
                return False
            return True
    def readByte ( self ) :
        if self.ptr < self.buflen :
            return self.buffer [ self.ptr ]
        return - 1
    def isPrintableChar ( self ) :
        return '!' <= self.ptr <= '~'
    def skipUnprintable ( self ) :
        while self.ptr < self.buflen and not self.isPrintableChar ( ) :
            self.ptr += 1
        