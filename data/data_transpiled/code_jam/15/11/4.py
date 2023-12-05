def import locale
import os
import sys
import locale
import getopt
import locale
import locale
import time
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.problem = 'A'
        self.filename = '%s-large' % self.problem
    def solve ( self ) :
        N = self.iread ( )
        a = [ ]
        for i in range ( N ) :
            a.append ( self.iread ( ) )
        A , B , C = 0 , 0 , 0
        for i in range ( N + 1 ) :
            A += max ( a [ i ] - a [ i + 1 ] , 0 )
            B = max ( B , a [ i ] - a [ i + 1 ] )
        for i in range ( N + 1 ) :
            C += min ( B , a [ i ] )
        self.out.write ( '%d %d\n' % ( A , C ) )
    def solve_gcj ( self ) :
        tests = self.iread ( )
        for test in range ( 1 , tests + 1 ) :
            self.out.write ( 'Case #%d: ' % test )
            self.solve ( )
            self.out.write ( '\n' )
    def run ( self ) :
        try :
            f = open ( self.filename + '.in' , 'r' )
            f.write ( '\n' )
            self.solve_gcj ( )
            f.flush ( )
        except :
            sys.stderr.write ( 'Failed to open %s\n' % self.filename )
            sys.exit ( 1 )
    def iread ( self ) :
        return int ( self.readword ( ) )
    def dread ( self ) :
        return float ( self.readword ( ) )
    def lread ( self ) :
        return long ( self.readword ( ) )
    f = open ( self.filename + '.in' , 'r' )
    f.write ( '\n' )
    f.close ( )
    return f
