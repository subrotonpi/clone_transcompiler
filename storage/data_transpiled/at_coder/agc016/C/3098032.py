def _import ( stream ) : return stream
import sys
import io
import os
import io
import codecs
import codecs
import sys
import io
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
class Main :
    def __init__ ( self ) :
        self.inputStream = sys.stdin
        self.outputStream = sys.stdout
        self.inputStream = io.open ( self.inputStream )
        self.outputStream = io.open ( self.outputStream )
        self.stream = io.open ( self.inputStream , 'w' )
        self.stream.write ( self.stream )
        self.stream.write ( self.stream )
        self.stream.flush ( )
    def write ( self , * objects ) :
        if self.stream.read ( ) != self.inputStream :
            raise InputError ( )
        self.stream.write ( self.stream.read ( ) )
    def write ( self , * args ) :
        self.stream.write ( self.stream.read ( ) )
    def write ( self , * args ) :
        self.stream.write ( self.stream.read ( ) )
    def write ( self , * args ) :
        self.stream.write ( self.stream.read ( ) )
    def close ( self ) :
        self.stream.close ( )
class agc016c ( object ) :
    def solve ( self , test_number , stream , writer ) :
        r , c , h , w = stream.read ( )
        ans = [ ]
        if h == 1 and w == 1 :
            writer.write ( 'No' )
            return
        neg = - 1000000000
        for i in range ( h - 1 , r , h ) :
            for j in range ( w - 1 , c , w ) :
                ans.append ( neg )
        pos = 999999999
        for i in range ( r , h ) :
            for j in range ( c , c , w ) :
                ans.append ( pos )
        sum = 0
        for i in range ( r ) :
            for j in range ( c , c ) :
                sum += ans [ i ]
        if sum > 0 :
            writer.write ( 'Yes' )