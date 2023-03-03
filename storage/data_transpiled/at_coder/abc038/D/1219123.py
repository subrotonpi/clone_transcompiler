def _import ( ) : return sys.stdin
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import math
import math
import os
import sys
class Main ( ) :
    def __init__ ( self , a , b ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.stdin = csv.reader ( self.stdin )
        self.stdout = csv.writer ( self.stdout )
        self.solver = TaskD ( )
        self.solve ( 1 , self.stdin , self.stdout )
        self.stdout.close ( )
class TaskD ( ) :
    def __init__ ( self , test_number , infile , outfile ) :
        self.n = test_number
        self.dat = [ ]
    def solve ( self , n1 , a ) :
        self.n = 1
        for i in range ( self.n ) :
            w , h = self.dat [ i ]
            self.dat.append ( ( w , h ) )
        self.dat.sort ( )
        ans = 0
        self.rmq = RMQ ( 100010 )
        for i in range ( self.n ) :
            lower = self.rmq.query ( 0 , self.dat [ i ] [ 1 ] - 1 )
            self.rmq.update ( self.dat [ i ] [ 1 ] , lower + 1 )
            ans = max ( ans , lower + 1 )
        outfile.write ( ans )
    def pair ( self , p ) :
        self.x , self.y = p
        self.dat = [ ]
    class RMQ ( object ) :
        def __init__ ( self , n1 ) :
            self.n = 1
            self.dat = [ ]
            self.dat = [ ]
            self.dat = [ ]
            self.dat = [ ]
            self.idx = 0
            self.idx = 0
            self.dat = [ ]
            self.idx = 0
            self.idx = 0
            self.dat = [ ]
            self.idx = 0
            self.idx = 0
            self.dat = [ ]
            self.idx = 0
            self.idx = 0
            self.dat = [ ]
            self.idx = 0
            self.idx = 0
            self.idx = 0
        