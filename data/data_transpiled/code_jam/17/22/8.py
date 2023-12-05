def _import ( ) : return ''
import os
import os
import sys
class ProblemB ( object ) :
    FILENAME = 'problemB_large'
    def _infilename ( self ) : return '%s.in' % self.FILENAME
    def _outfilename ( self ) : return '%s.out' % self.FILENAME
    def main ( self , * args ) :
        return [ ]
    def create_cycle ( red , yellow , blue ) :
        if red < 0 or blue < 0 : return None
        hairs = [ ]
        hairs.append ( ( 'R' , red ) )
        hairs.append ( ( 'Y' , yellow ) )
        hairs.append ( ( 'B' , blue ) )
        [ i for i in range ( len ( hairs ) ) if i.hairs [ i ].count > hairs [ i ].count ]
        return i
    def create_cycle ( red , yellow , blue ) :
        if red < 0 or blue < 0 : return None
        hairs = [ ]
        hairs.append ( ( 'R' , red ) )
        hairs.append ( ( 'Y' , yellow ) )
        hairs.append ( ( 'V' , blue ) )
        hairs.append ( ( 'B' , blue ) )
        return [ ]
    def create_cycle ( red , yellow , blue ) :
        if red < 0 or blue < 0 : return None
        hairs = [ ]
        hairs.append ( ( 'R' , red ) )
        hairs.append ( ( 'Y' , yellow ) )
        hairs.append ( ( 'V' , blue ) )
        return [ ]
    def create_cycle ( red , yellow , blue ) :
        if blue > 0 : return None
        hairs = [ ]
        for i in range ( len ( hairs ) ) :
            hairs.append ( ( 'R' , red ) )
        if yellow > 0 : return None
        for i in range ( len ( hairs ) ) :
            hairs.append ( ( 'Y' , blue ) )
        if blue > 0 : return None
