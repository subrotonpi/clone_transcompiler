def _import ( ) : return sys.stdout.readline ( )
import readline
import readline
import time
import math
import struct
import time
class Main ( object ) :
    def __init__ ( self , t ) :
        self.lst = [ ]
        self.lst.append ( t )
    def __repr__ ( self ) :
        return "Case #%d: %s" % ( t , join ( self.lst ) )
    def print_lst ( self , x ) :
        s = [ ]
        for i in x :
            s.append ( "%d" % i )
        print ( s )
    def print_lst ( self , x ) :
        s = [ ]
        for i in x :
            s.append ( "%d" % i )
        print ( s )
    def print_lst ( self , x ) :
        s = [ ]
        for i in x :
            s.append ( "%d" % i )
        print ( s )
    def join ( self , x , space = "" ) :
        if not x :
            return ""
        s = [ ]
        first = True
        for elt in x :
            if first :
                first = False
            else :
                s.append ( space )
            s.append ( elt )
        return s
    def readline ( self ) :
        while not self.lst or not self.lst :
            line = readline ( self )
            self.lst = [ line.strip ( ) for line in line.split ( ) ]
        return self.lst [ 0 ]
    def randint ( self , T ) :
        return int ( self.lst [ 0 ] )
    def main ( self ) :
        readline ( self )
    T = randint ( 1 , T )
    for t in range ( 1 , T + 1 ) :
        N = randint ( 1 , N )
        counts = { }
        for i in range ( 2 ** t ) :
            counts [ x ] = counts [ x ] + 1
