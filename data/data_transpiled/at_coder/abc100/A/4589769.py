def import _readline
import sys
import csv
import time
import sys
class Main ( object ) :
    def __init__ ( self , args ) :
        self.input = sys.stdin
        import readline
        l = readline.readline ( )
        A , B = l.col [ 0 ] , l.col [ 1 ]
        readline.close ( )
        print ( 'Yay!' if ( A <= 8 and B <= 8 ) else ':(' )
class Input ( object ) :
    def __init__ ( self , f ) :
        self.input = f
    def readline ( self ) :
        return csv.reader ( input ).next ( )
    def data_queue ( num ) :
        global q
        q = [ ]
        for i in range ( num ) :
            q.append ( f.readline ( ) )
        return q
    def col_queue ( data ) :
        global q
        q = [ ]
        for i in data.col :
            q.append ( data.col [ i ] )
        return q
class Data ( object ) :
    def __init__ ( self , values ) :
        self.col = [ int ( v ) for v in values.split ( ',' ) ]
