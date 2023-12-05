def import import *
import sys
import string
class b ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
    def get_int ( self ) :
        return int ( self.stdin.readline ( ) )
    def get_ins ( self ) :
        s = self.stdin.readline ( ).split ( )
        r = [ int ( i ) for i in s ]
        return r
    def docase ( self ) :
        self.get_int ( )
        v = self.get_ins ( )
        d = [ ( v [ i + 1 ] - v [ i ] + 10007 ) % 10007 for i in range ( len ( v ) - 1 ) ]
        delta = 2
        s0 = 1
        s1 = 0
        while 1 :
            d2 = delta // 2
            okay = 1
            if s1 + delta >= len ( d ) :
                return "UNKNOWN"
            for i in range ( s0 + delta , len ( d ) , delta ) :
                if d [ i ] != d [ s0 ] :
                    okay = 0
            okay2 = 0
            for i in range ( s1 , len ( d ) , delta ) :
                if d [ i ] != d [ s1 ] :
                    okay2 = 1
            if okay and okay2 :
                return "%d" % ( v [ - 1 ] + d [ s0 ] ) % 10007
            delta = delta * 2
            s0 = 2 * s0 + 1
            s1 = 2 * s1 + 1
    def main ( ) :
        lim = self.get_int ( )
        for c in range ( 1 , lim + 1 ) :
            r = docase ( )
            print ( "Case #%d: %s" % ( c , r ) )
