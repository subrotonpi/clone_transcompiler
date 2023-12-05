def import readline
import sys
import os
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
class B ( object ) :
    def __init__ ( self , f , readline ) :
        self.f = open ( 'b.in' , 'r' )
        self.f = open ( 'b.out' , 'w' )
        self.MAX_CASES = read_int ( )
        for casenum in range ( 1 , MAX_CASES + 1 ) :
            self.f.write ( 'Case #%d: ' % casenum )
            x = read_int ( )
            y = read_int ( )
            dist = abs ( x ) + abs ( y )
            max = 1
            while ( max * max + max ) / 2 < dist or ( ( max * max + max ) / 2 ) % 2 != dist % 2 :
                max += 1
            list = [ ]
            for i in range ( max - 1 , - 1 , - 1 ) :
                if abs ( x ) > abs ( y ) :
                    if x > 0 :
                        list.append ( 'E' )
                        x -= i + 1
                    else :
                        list.append ( 'W' )
                        x += i + 1
                else :
                    if y > 0 :
                        list.append ( 'N' )
                        y -= i + 1
                    else :
                        list.append ( 'S' )
                        y += i + 1
            self.f.write ( ''.join ( list ) )
        self.f.close ( )
    def readInt ( self ) :
        return int ( readline ( self ) )
    def readLong ( self ) :
        return long ( readline ( self ) )
    def readdouble ( self ) :
        return float ( readline ( self ) )
    def readstr ( self ) :
        while self.f is readline or not self.f.readline :
            if not self.f.strip ( ) :
                self.f.close ( )
                sys.exit ( 0 )
            self.f = open ( self.f.readline ( ) , 'r' )
