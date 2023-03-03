def import import sys , iread , dread , lread
import os
import sys
import random
import time
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.taskname = "A-large"
    def solve ( self ) :
        tests = iread ( )
        for t in range ( 1 , tests + 1 ) :
            P , K , L = self.iread ( )
            a = [ - iread ( ) for i in range ( L ) ]
            a.sort ( )
            ans = 0
            for i in range ( L ) :
                ans += ( - a [ i ] ) * ( i / K + 1 )
            self.out.write ( "Case #%d: %d\n" % ( t , ans ) )
    def run ( self ) :
        try :
            f = open ( self.taskname + ".in" , "r" )
            out = open ( self.taskname + ".out" , "w" )
            self.solve ( )
            out.flush ( )
        except :
            pass
    def iread ( self ) :
        return int ( self.readword ( ) )
    def dread ( self ) :
        return float ( self.readword ( ) )
    def lread ( self ) :
        return long ( self.readword ( ) )
    global infile , outfile
    def readword ( self ) :
        b = [ ]
        while c >= 0 and c <= '' :
            c = infile.read ( 1 )
        if not c : return ''
        while c > '' :
            b.append ( c )
            c = infile.read ( 1 )
        return b
