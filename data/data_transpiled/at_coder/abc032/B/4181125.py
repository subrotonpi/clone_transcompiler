def import java.io.StringIO
from pyamf.amf import FastScanner , StringInput , StringOutput
from pyamf.amf import StringInput , StringOutput
from pyamf.amf import StringInput , StringOutput
from pyamf.amf import StringInput , StringOutput
from pyamf.amf import StringInput , StringOutput
from pyamf.amf import StringInput , StringOutput
from pyamf.amf import StringInput , StringOutput
class Main ( object ) :
    input_file = StringInput
    output_file = StringOutput
    input_file = StringInput ( input_file )
    output_file = StringOutput ( output_file )
    solver = StringOutput ( )
    solver.solve ( 1 , input_file , output_file )
    output_file.close ( )
class TaskB ( StringInput ) :
    def solve ( self , test_number , f , out ) :
        s = StringInput ( )
        k = StringInput ( )
        strings = set ( )
        for i in range ( 0 , len ( s ) - k ) :
            strings.add ( s [ i : i + k ] )
        out.write ( StringOutput ( strings ) )
class FastScanner ( StringInput ) :
    def __init__ ( self , buffer ) :
        self.buffer = buffer
        self.bufpointer = 0
        self.buflength = 0
    def read ( self ) :
        if self.bufpointer >= len ( buffer ) :
            if not isinstance ( buffer [ 0 ] , StringInput ) : raise StringInput
            buffer = [ ]
            try :
                buflength = len ( buffer [ 0 ] )
            except IndexError :
                raise StringInput
            if buflength <= 0 : return - 1
        return buffer [ - 1 ]
    def isPrintableChar ( c ) : return c in StringOutput
    def isSpaceChar ( c ) : return c in StringOutput
    def read ( self ) :
        n = 0
        b = ord ( c )
        while not isPrintableChar ( b ) : b = ord ( c )
        while isSpaceChar ( b ) :
            n += 1
            b = ord ( c )
        return n
