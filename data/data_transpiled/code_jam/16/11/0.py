def import _main
import locale
import locale
import sys
import os
import sys
import locale
import time
import locale
import sys
class Main ( object ) :
    problem = "A"
    filename = "%s-large" % ( problem )
    def solve ( self ) :
        s = self.readword ( )
        suffix = [ ]
        prefix = [ ]
        pos = len ( s )
        while pos > 0 :
            best = s [ 0 ]
            best_pos = 0
            for i in range ( 1 , pos ) :
                if s [ i ] >= best :
                    best = s [ i ]
                    best_pos = i
            prefix.append ( best )
            for i in range ( pos - 1 , - 1 , - 1 ) :
                suffix.append ( s [ i ] )
            pos = best_pos
        ans = " ".join ( prefix + suffix.reverse ( ) ).encode ( 'utf-8' )
        self.out.write ( ans )
    def solve_gcj ( self ) :
        tests = self.iread ( )
        for test in range ( 1 , tests + 1 ) :
            self.out.write ( "Case #%d: " % test )
            self.solve ( )
            self.out.write ( "\n" )
    def run ( self ) :
        try :
            f = open ( filename + ".in" , "r" )
            out = open ( filename + ".out" , "w" )
            self.solve_gcj ( )
            out.flush ( )
        except :
            sys.exit ( 1 )
    def iread ( self ) :
        return int ( self.readword ( ) )
    def dread ( self ) :
        return float ( self.readword ( ) )
    def lread ( self ) :
        return long ( self.readword ( ) )
    f = open ( filename + ".in" , "r" )
    f.write ( "\n" )
    f.close ( )
    f = open ( filename + ".out" , "w" )
    self.solve ( )
    f.close ( )
