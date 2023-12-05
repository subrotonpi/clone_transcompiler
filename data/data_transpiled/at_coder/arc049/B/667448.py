def _import ( ) : return sys.stdin.read ( 2048 )
import io
import sys
import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = randint ( 0 , 256 )
        self.x = [ ]
        self.y = [ ]
        self.c = [ ]
    def solve ( self ) :
        self.N = randint ( 0 , 256 )
        self.x = [ ]
        self.y = [ ]
        self.c = [ ]
        for i in range ( N ) :
            self.x.append ( randint ( 0 , 256 ) )
            self.y.append ( randint ( 0 , 256 ) )
            self.c.append ( randint ( 0 , 256 ) )
    def uniform ( ) :
        return float ( uniform ( ) )
    low = 0.0
    high = sys.maxsize
    for i in range ( 100 ) :
        t = ( low + high ) / 2
        flag = True
        for j in range ( N ) :
            for k in range ( j + 1 , N ) :
                ny = abs ( self.y [ j ] - self.y [ k ] )
                nx = abs ( self.x [ j ] - self.x [ k ] )
                d = ( t / self.c [ j ] + t / self.c [ k ] )
                if ny <= d <= d : continue
                flag = False
                break
            if not flag : break
        if flag : high = t
        else low = t
    sys.stdout.write ( '%.7f\n' % ( ( high + low ) / 2 ) )
