def import time
import sys
class Repeater ( object ) :
    def __init__ ( self ) :
        self.n = int ( time.time ( ) )
    def solve ( self ) :
        self.n = int ( self.n )
    def readline ( self ) :
        s = [ ]
        t = [ ]
        for i in range ( self.n ) :
            s.append ( self.readline ( ) )
        for i in range ( self.n ) :
            s.append ( self.readline ( ) )
        return int ( self.readline ( ) )
    def readline ( self ) :
        return int ( self.readline ( ) )
    def readline ( self ) :
        return float ( self.readline ( ) )
    def main ( self ) :
        return Repeater ( ).run ( )
def solve ( self ) :
    self.n = int ( self.n )
def solve ( self ) :
    cnt = [ ]
    for i in range ( self.n ) :
        while cnt [ i ] < len ( self.s [ i ] ) and self.s [ cnt [ i ] ] == i :
            cnt [ i ] += 1
    ans += solve ( self.cnt )
    for j in range ( self.n ) :
        self.s [ j ] = self.s [ j ]
    out.write ( ans )
def solve ( self ) :
    self.cnt = cnt [ : ]
    self.cnt = [ ]
    self.cnt.sort ( )
    best = sys.maxint
    for i in range ( self.n ) :
        cur = 0
        for j in range ( self.cnt [ i ] ) :
            cur += abs ( self.cnt [ i ] - self.cnt [ j ] )
        best = min ( best , cur )
    return best
def unique ( self ) :
    s = [ self.s [ 0 ] for i in range ( 1 , len ( self.s ) ) ]
    for i in range ( 2 , self.T ) :
        if s [ i ] != self.s [ i - 1 ] :
            s [ i ] = self.s [ i ]
    return ''.join ( s )