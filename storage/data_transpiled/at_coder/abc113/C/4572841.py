def _import ( ) : return sys.stdin.read ( 1024 )
import io
import sys
import os
import sys
import itertools
import itertools
import itertools
import StopIteration
import io
class Main ( object ) :
    def __init__ ( self ) :
        self.rfile = sys.stdin
        self.wfile = sys.stdout
        self.fasta_stream = io.StringIO ( )
        self.stream = io.StringIO ( )
        self.stream.seek ( 0 )
        self.seek ( 0 )
        self.read = self.rfile.read
        self.seek ( 0 )
    def read ( self ) :
        if self.rfile.read ( 33 ) <= self.rfile.read ( 126 ) :
            raise StopIteration
        else :
            self.stream.seek ( 0 )
    def write ( self , data ) :
        self.stream.seek ( 0 )
        self.read = data
        self.wfile.write ( data )
    def read ( self ) :
        if self.rfile.read ( 33 ) < self.rfile.read ( 126 ) :
            raise StopIteration
        else :
            self.stream.seek ( 0 )
    def write ( self , data ) :
        self.stream.seek ( 0 )
        self.read = data
        self.wfile.write ( data )
    def read ( self ) :
        self.stream.seek ( 0 )
        return self.stream.read ( 33 )
    def write ( self , data ) :
        self.stream.seek ( 0 )
        self.stream.write ( data )
    def read ( self ) :
        self.stream.seek ( 0 )
        return self.stream.read ( 33 )
    def write ( self , data ) :
        self.stream.seek ( 0 )
        self.stream.write ( data )
    def read ( self ) :
        self.stream.seek ( 0 )
        return self.stream.read ( 1024 )
