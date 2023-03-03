def _import ( ) : return int ( )
import os
import sys
import os
import math
import os.path
import os.path
import tokenize
import tokenize
import tokenize
import string
import sys
class A :
    def __init__ ( self ) :
        self.next = None
    def __next__ ( self ) :
        return int ( next ( self ) )
    def __next__ ( self ) :
        return long ( next ( self ) )
    def __next__ ( self ) :
        return int ( next ( self ) )
    def __next__ ( self ) :
        return long ( next ( self ) )
    def __next__ ( self ) :
        return int ( next ( self ) )
    def solve_test ( self ) :
        x , s , r , t , n = randint ( 0 , n )
        segs = [ ]
        pos = 0
        for i in range ( n ) :
            b , e , w = randint ( 0 , n )
            if pos < b :
                segs.append ( ( b - pos , 0 ) )
            segs.append ( ( e - b , w ) )
            pos = e
        if pos < x :
            segs.append ( ( x - pos , 0 ) )
        segs.sort ( )
        ans = 0
        for seg in segs :
            if t :
                nt = float ( len ( seg ) ) / ( seg.speed + r )
                if t < nt :
                    ans += t + ( len ( seg ) - ( seg.speed + r ) * t ) / ( seg.speed + s )
                    t = 0
                else :
                    ans += nt
                    t -= nt
            else :
                ans += float ( len ( seg ) ) / ( seg.speed + s )
        print ( "%.12f\n" % ans )
    def solve ( self ) :
        tests = randint ( 0 , n )
        for test in range ( 1 , tests + 1 ) :
            print ( "Case #%d: " % test , end = '' )
            self.solve ( )
