def _import ( ) : return int ( next ( ) )
import sys
import random
import sys
import itertools
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = len ( sys.stdin )
        self.P = [ ]
        for i in range ( self.N ) :
            size = random.randint ( 0 , N )
            self.P.append ( ( i + 1 , size ) )
        f = sys.stdout
        for l in solve ( ) :
            f.write ( l )
        f.flush ( )
    def solve ( ) :
        self.P.sort ( key = lambda p : p.size ).reversed ( )
        cnt = [ ]
        first = self.P [ 0 ]
        no = first.no
        size = first.size
        for i in range ( 1 , N ) :
            p = self.P [ i ]
            if p.size != size :
                diff = size - p.size
                cnt.append ( long ( diff ) * ( i ) )
                size -= diff
            no = min ( p.no , no )
        cnt.append ( long ( size ) * N )
        return cnt
    class Pile ( object ) :
        def __init__ ( self , no , size ) :
            self.no = no
            self.size = size
    from itertools import repeat
    class FastScanner ( object ) :
        def __init__ ( self , stream = sys.stdin ) :
            self.stream = stream
            self.stream = None
        def readline ( self ) :
            if self.stream is None or not stream.readline ( ) :
                try :
                    self.stream = sys.stdin.readline ( )
                except AttributeError :
                    pass
            return self.stream.readline ( )
        def readline ( self ) :
            if self.stream is None or not stream.readline ( ) :
                try :
                    return self.stream.readline ( )
                except AttributeError :
                    pass
            return self.stream.readline ( )
