def import java.io , os , sys
from java.io import StringIO , getopt
class Main ( object ) :
    def __init__ ( self ) :
        try :
            f = open ( sys.stdin , 'r' )
        except :
            sys.stdout = sys.stderr
        f = StringIO ( )
        f.readline ( )
        f.readline ( )
        d = { }
        arr = [ ]
        for i in range ( n ) :
            a = dsu1.find ( i )
            b = dsu2.find ( i )
            arr.append ( a * long ( b ) )
            if d.has_key ( arr [ i ] ) :
                d [ arr [ i ] ] = d [ arr [ i ] ] + 1
            else :
                d [ arr [ i ] ] = 1
        for i in range ( n ) :
            d.append ( d [ arr [ i ] ] )
        print ( '%s' % ''.join ( d ) , file = sys.stdout )
    def read ( n ) :
        line = ''
        if n : line = line.rstrip ( )
        else :
            try : line = line.rstrip ( )
            except : line = ''
        while len ( line ) : line += '' + line
        return line
class DSU ( object ) :
    def __init__ ( self , n ) :
        self.root = [ ]
        self.rank = [ ]
        for i in range ( n ) :
            self.root.append ( i )
    def find ( self , x ) :
        if self.root [ x ] == x :
            return x
        else :
            return find ( self.root [ x ] )
    def unite ( self , x , y ) :
        x , y = self.root [ x ] , self.rank [ y ]
        if x == y :
            return x
        if self.rank [ x ] < self.rank [ y ] :
            self.rank [ x ] += 1
        else :
            self.rank [ x ] = x
            if self.rank [ x ] == self.rank [ y ] :
                self.rank [ x ] += 1
