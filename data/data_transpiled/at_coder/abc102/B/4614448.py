def import _readline
import sys
import csv
import csv
import csv
import csv
import csv
import csv
import csv
class Main ( sys.stdin ) :
    def __init__ ( self , args ) :
        self.input = sys.stdin
        self._ = args
        self.l = data.readline ( )
        self.n = self.l.col [ 0 ]
        self.q = self.input.col_queue
        self.input.close ( )
        min = self.q.get ( )
        max = min
        while not self.q.empty ( ) :
            max = self.q.get ( )
        print ( max - min )
class Input ( ) :
    def __init__ ( self , input ) :
        self.input = sys.stdin
        self.close ( )
    def readline ( self ) :
        return csv.reader ( input ).__next__ ( )
    def col_queue ( self ) :
        d = self.d
        if self.q :
            q = csv.reader ( lambda a , b : a - b )
            for i , c in enumerate ( d.col ) :
                q.put ( i )
            return q
class Data ( ) :
    def __init__ ( self , values ) :
        self.col = [ ]
        for i , value in enumerate ( values ) :
            self.col.append ( int ( value ) )
