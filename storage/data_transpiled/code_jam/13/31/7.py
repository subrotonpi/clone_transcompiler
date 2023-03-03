def import readline
import sys
import os
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import sys
import readline
import readline
import readline
import readline
import readline
import sys
class A ( object ) :
    def __init__ ( self , f , readline ) :
        self.f = open
        self.readline = readline
        self.sys = sys.stdin
        self.stdout = open
        self.MAX_CASES = read_int ( )
        vowel = 'aeiou'
        for casenum in range ( 1 , MAX_CASES + 1 ) :
            self.stdout.write ( 'Case #%d: ' % casenum )
            data = readline ( )
            count = read_int ( )
            ret = 0
            curr = 0
            last_start = - 1
            for i in range ( len ( data ) ) :
                if vowel.find ( data [ i ] + '' ) == - 1 :
                    curr += 1
                else :
                    curr = 0
                if curr >= count :
                    begin = i - count + 1
                    go_after = i
                    ret += ( begin - last_start ) * 1 * ( len ( data ) - go_after )
                    last_start = begin
            self.stdout.write ( ret )
        self.stdout.close ( )
    def readInt ( self ) :
        return int ( readline ( ) )
    def readLong ( self ) :
        return long ( readline ( ) )
    def readdouble ( self ) :
        return float ( readline ( ) )
    def readline ( self ) :
        while self.f is readline or not self.f.closed :
            if not self.f.closed :
                self.f.close ( )
                sys.exit ( )
            self.f = open ( self.f.name , 'r' )
        return readline ( )
