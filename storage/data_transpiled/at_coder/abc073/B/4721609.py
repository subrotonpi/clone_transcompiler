def import import sys , stdin , stdout , stderr , line
from io import BytesIO
import readline
import sys
import csv
class Main ( object ) :
    def __init__ ( self , a ) :
        self.a = a
    def readline ( ) :
        self.stdin = stdin
        self.n = int ( self.a )
        if self.n > 0 :
            return self.a.read ( )
        else :
            return self.a.read ( )
    def write ( self , l ) :
        self.l = l
        total = 0
        for i in range ( self.n ) :
            l = self.l.split ( )
            total += int ( l [ 1 ] ) - int ( l [ 0 ] ) + 1
        print ( total )
