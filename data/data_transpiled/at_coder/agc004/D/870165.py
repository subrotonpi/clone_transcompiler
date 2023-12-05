def _import ( ) : return sys.stdout
import io
import io
import os
import sys
import io
import os.path
import io
import csv
import csv
import csv
import csv
import csv
import csv
class Main ( ) :
    def main ( self ) :
        return next ( self )
    def nextDouble ( self ) :
        return float ( self.next ( ) )
    def readline ( self ) :
        try :
            if self.next ( ) is None or not self.next ( ) :
                ret = [ ]
                while self.next ( ) is None :
                    ret.append ( self.next ( ) )
                return ret
        except csv.Error :
            self.next ( )
    def fast_next_int ( self ) :
        try :
            c = next ( self )
            while c is None or c > '9' :
                ret = [ ]
            return c
        except csv.Error :
            self.next ( )
    def skip_line ( self ) :
        if self.next ( ) is None or not self.next ( ) :
            try :
                line = next ( self )
            except csv.Error :
                self.next ( )
            return line
    def read_time_hms ( delim ) :
        s = next ( self )
        if not s :
            raise ValueError ( 'no delim found' )
        return int ( s [ 0 ] ) * 60 + int ( s [ 1 ] )
    def read_time_hms ( self , delim1 , delim2 ) :
        s = next ( self )
        if not s :
            raise ValueError ( 'no delim found' )
        return int ( s [ 0 ] ) * 60 + int ( s [ 1 ] )
    def dfs ( self ) :
        return int ( s [ 0 ] ) * 60 + int ( s [ 1 ] )
    def read_time_hms ( self , delim ) :
        kill = [ ]
        left = [ ]
        for it in self.next ( ) :
            to = it
        return kill
    Note : 'uses.python.or.unsafe.operations.Note:Recompile-with-Xlint:unchecked' for details in self.all ( )