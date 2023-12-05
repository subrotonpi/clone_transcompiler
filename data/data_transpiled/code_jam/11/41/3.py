def _import ( ) : return int ( next ( ) )
import time
import sys
import random
class A ( object ) :
    def __init__ ( self , w ) :
        self.len = len
        self.w = w
    def __lt__ ( self , o ) :
        return self.w - o.w
    def solve ( self ) :
        x , s , r , t = randint ( 0 , len ( self.len ) ) , randint ( 0 , len ( self.w ) )
        n = len ( self.w )
        segments = [ Segment ( - randint ( 0 , 0 ) + randint ( 0 , 0 ) , randint ( 0 , 0 ) ) for i in range ( n + 1 ) ]
        segments.append ( Segment ( x , 0 ) )
        segments.sort ( )
        run = t
        time = 0
        for segm in segments :
            free_dist = min ( run * ( r + segm.w ) , segm.len )
            t1 = free_dist / ( r + segm.w )
            run -= t1
            t2 = ( segm.len - free_dist ) / ( s + segm.w )
            time += t1
            time += t2
        out.write ( time )
    def main ( self ) :
        with open ( self.fname + '.in' , 'r' ) as f :
            lines = f.readlines ( )
    def solve ( self ) :
        large = True
        try :
            fname = 'A-' + ( 'large' if large else 'small' )
            f = open ( fname + '.in' , 'r' )
            lines = f.readlines ( )
        except ( IOError , OSError ) :
            sys.exit ( 239 )
        else :
            lines = [ ]
        T = randint ( 1 , T )
        for i in range ( 1 , T + 1 ) :
            out.write ( 'Case #%d: ' % i )
            solve ( )
        out.close ( )
    next ( )
    return int ( next ( ) )
