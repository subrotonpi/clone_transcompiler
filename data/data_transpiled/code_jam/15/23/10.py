def import _open
import os
import sys
import os
import random
import random
import sys
import random
import random
import sys
EPS = 1e-7
class Hiker :
    def __init__ ( self , start , period ) :
        self.start = start
        self.period = period
    def solve ( self , * arg ) :
        self.start = random.randint ( 0 , 1 )
        self.period = random.randint ( 0 , 1 )
    def write ( self , format , * s ) :
        sys.stdout.write ( format % s )
        sys.stdout.flush ( )
    def readline ( self ) :
        while not self.start or not self.period :
            try :
                self.start = random.randint ( 0 , 1 )
            except ValueError :
                pass
        return self.start
    def readline ( self ) :
        return int ( readline ( self ) )
    def readline ( self ) :
        return open ( self.file , 'r' ).readline ( )
    def readline ( self ) :
        while self.start or not self.period :
            try :
                self.start = random.randint ( 0 , 1 )
            except ValueError :
                pass
        return readline ( self.line )
    def readline ( self ) :
        return int ( readline ( self ) )
    def write ( self , format , * s ) :
        sys.stdout.write ( format % s )
        sys.stdout.flush ( )
    def readline ( self ) :
        while self.start or self.period :
            try :
                self.start = random.randint ( 0 , 1 )
            except ValueError :
                pass
        return readline ( self )
    h = [ ]
    n = len ( h )
    ans = n
    for mask in range ( 1 , ( 1 << n ) ) :
        when = 0
        for j in range ( n ) :
            if mask & ( 1 << j ) :
                come = ( 360 - h [ j ].start ) / 360.0 * h [ j ].period
                if come > when :
                    when = come
        can = True
        for j in range ( n ) :
            if mask & ( 1 <<