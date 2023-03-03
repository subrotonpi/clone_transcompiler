def _import ( ) : return ''
import os
import sys
import os
import sys
import getopt
import locale
import locale
import locale
import time
import locale
import sys
class Main ( object ) :
    import locale
    import string
    import locale
    import os
    import sys
    import getopt
    def __init__ ( self , problem ) :
        try :
            self.problem = problem + 'B'
        except :
            self.problem = problem
    def solve ( self ) :
        N = self.iread ( )
        V , X = struct.unpack ( '>i' , self.dread ( ) ) [ 0 ]
        p = [ ]
        for i in range ( N ) :
            p.append ( ( char , i ) )
        return ''.join ( p )
    def readword ( self ) :
        try :
            locale.setlocale ( locale.LC_ALL , '' )
        except :
            pass
        return ''
    def readword ( self ) :
        b = [ ]
        c = self.read ( )
        while c >= 0 and c <= '' :
            c = c.read ( )
        if c > 0 :
            return ''
        while c > 0 :
            b.append ( ( char , '' ) )
            c = c.read ( )
        return ''.join ( b )
    def main ( self ) :
        try :
            locale.setlocale ( locale.LC_ALL , '' )
        except :
            pass
        return ''
    def solve ( self ) :
        tests = self.iread ( )
        for test in range ( 1 , N ) :
            S += p [ test ] [ 0 ] * p [ test ] [ 1 ]
            sum += p [ test ] [ 2 ]
    def solve_gcj ( self ) :
        return self.iread ( )
    def solve ( self ) :
        for test in range ( tests ) :
            out.write ( 'Case #%d: ' % test )
            self.solve ( )
            out.write ( '\n' )
