def _import ( stream ) : return stream
import sys
import io
import os
import io
import sys
import io
import io
import sys
import io
import io
import codecs
import struct
import struct
import sys
import struct
import termios
import struct
import struct
import struct
import sys
def read ( ) :
    try :
        if struct.calcsize ( 'I' ) >= struct.calcsize ( 'I' ) :
            return stream.read ( )
    except struct.error :
        raise InputError ( )
def readSkipSpace ( ) :
    while True :
        c = read ( )
        if c == '-' :
            sgn = - 1
            c = read ( )
        res = 0
        while True :
            if c < '0' or c > '9' :
                raise InputError ( )
            res = res * 10 + c - '0'
            c = read ( )
        while not isSpace ( c ) :
            res *= sgn
            return res
    Note :./ main.py.uses.unsafe.operations.Note : Recompile.with - Xlint :
        for details in ( read ( ) , read ( ) ) :
            if not isSpace ( ) :
                raise InputError ( )
    class TaskD :
        def solve ( self , test_number , stream , out ) :
            n = struct.unpack ( 'I' , stream.read ( 1 ) ) [ 0 ]
            g = [ ]
            for i in range ( n - 1 ) :
                x = read ( )
                y = read ( )
                g [ x ].append ( y )
                g [ y ].append ( x )
            res = self.dfs ( 0 , - 1 )
            out.print_ ( 'Bob' if res == 0 else 'Alice' )
        def dfs ( x , p ) :
            res = 0
            for y in g [ x ] :
                if y == p :
                    continue
                res ^= 1 + self.dfs ( y , x )
            return res
    class IO ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
        def write ( self , o ) :
            self.stream.write ( o