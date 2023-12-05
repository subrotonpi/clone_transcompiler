def _ _ main _ _ ( ) : return
import os
import sys
import os
import sys
import os
import os
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import math
import struct
import codecs
class GCJ_R2_A :
    def test ( self ) :
        self.test = True
    def solve ( self ) :
        t = self.iread ( )
        for i in range ( t ) :
            self.solveIt ( i + 1 )
    def solveIt ( self , casenr ) :
        n = self.iread ( )
        best = [ ]
        pos = [ ]
        pos = [ ]
        pos = [ ]
        reached = [ ]
        for i in range ( n ) :
            pos.append ( self.lread ( ) )
            pos.append ( self.lread ( ) )
        D = self.lread ( )
        reached.append ( True )
        best.append ( pos [ 0 ] )
        for i in range ( len ( best ) ) :
            if reached [ i ] :
                for k in range ( i + 1 , n ) :
                    best [ k ] = max ( best [ k ] , min ( pos [ k ] - pos [ i ] , len [ k ] ) )
                    reached [ k ] = True
        ans = "NO"
        for i in range ( n ) :
            if reached [ i ] and best [ i ] + pos [ i ] >= D :
                ans = "YES"
        answerString = "Case #%d: %s" % ( casenr , ans )
        outfile.write ( answerString + "\n" )
        print ( answerString )
    def iread ( self ) :
        return int ( self.wread ( ) )
    def dread ( self ) :
        return float ( self.wread ( ) )
    def lread ( self ) :
        return int ( self.wread ( ) )
    return GCJ_R2_A
