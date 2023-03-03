def _import ( ) : return sys.stdin.read ( )
import io
import StringIO
import sys
import struct
import set
import inspect
import sys
import sys
def isWhitespace ( c ) :
    if filter :
        return filter ( c )
    def isWhitespace ( ch ) :
        if ch == '' or ch == '\n' or ch == '\t' or ch == - 1 :
            raise InputError ( )
        if ch >= '' :
            ch = ''
        return ch
    def read ( ) :
        c = read ( )
        while isWhitespace ( c ) :
            c = read ( )
        sgn = 1
        if c == '-' :
            sgn = - 1
        res = 0
        while isWhitespace ( c ) :
            c = read ( )
        if not isWhitespace ( c ) :
            return - 1
        return res * sgn
    class agc014a ( agc014a ) :
        def solve ( self , test_number , stream , writer ) :
            a , b , c = stream.read ( )
            trips = set ( [ ( a , b , c ) ] )
            ans = 0
            while a % 2 == 0 and b % 2 == 0 and c % 2 == 0 :
                ha , hb , hc = a // 2 , b // 2 , c // 2
                a , b , c = hb + hc , ha + hc , ha + hb
                if ( a , b , c ) in trips :
                    writer.write ( - 1 )
                    return
                ans += 1
                trips.add ( ( a , b , c ) )
            writer.write ( ans )
    class trip ( object ) :
        def __init__ ( self , stream = None , writer = None ) :
            self.stream = stream
            self.writer = writer
        def write ( self , i ) :
            self.stream.write ( i )
        def getvalue ( self ) :
            return self.stream.getvalue ( )
    