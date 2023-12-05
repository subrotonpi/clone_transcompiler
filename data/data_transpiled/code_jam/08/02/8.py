def import _open
import sys
import os
import sys
import time
import time
import time
import sys
class Train ( object ) :
    def __init__ ( self , loc ) :
        self.loc = loc
        self.used = [ ]
        self.used = [ ]
        self.used.append ( 1 )
        self.used.append ( True )
    def fill ( self , start , end ) :
        max = min ( 1440 , end )
        for i in range ( start , max ) :
            self.used.append ( True )
    print ( "Case #%d: %d %d" % ( self.test , self.loc , self.used [ 0 ] ) )
class Trip ( object ) :
    def __init__ ( self , loc , start , end ) :
        self.loc = loc
        self.start = start
        self.end = end
    def __test ( self , x ) :
        if x < 0 :
            return - 1
        elif x == 0 :
            return 0
        else :
            return 1
    def __convert_min ( self , time ) :
        return time
    def __convert ( self , time ) :
        return time
    def solve ( self , f , out ) :
        num_tests = self.num_tests
        for test in range ( 1 , num_tests + 1 ) :
            delay = self.delay
            na = self.na
            nb = self.nb
            trips = [ ]
            for i in range ( na ) :
                time = self.time [ i ]
                t_start , time = self.convert ( time )
                t_end = self.convert ( time )
                trips.append ( ( 0 , t_start , t_end ) )
            for i in range ( nb ) :
                time = self.time [ i ]
                t_start , time = self.convert ( time )
                t_end = self.convert ( time )
                trips.append ( ( 1 , t_start , t_end ) )
return
