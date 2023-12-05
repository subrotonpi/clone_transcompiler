def import locale
import os
import sys
class B_as as
class B_as ( object ) :
    def __init__ ( self ) :
        self.test_no = sys.maxint
    def solve ( self ) :
        self.test_no = sys.maxint
        for test in range ( 1 , test_no + 1 ) :
            n = len ( self.test_no )
            a = [ ]
            for i in range ( n ) :
                a.append ( self.test_no )
            a.sort ( )
            m = 0
            last = [ ]
            len = [ ]
            for i in range ( n ) :
                blen = sys.maxint
                best = - 1
                for j in range ( m ) :
                    if last [ j ] == a [ i ] - 1 and len [ j ] < blen :
                        best = j
                        blen = len [ j ]
                if best == - 1 :
                    last.append ( a [ i ] )
                    len [ m ] = 1
                    m += 1
                else :
                    last.append ( a [ i ] )
                    len [ best ] = len [ best ] + 1
            blen = sys.maxint
            for i in range ( m ) :
                if len [ i ] < blen :
                    blen = sys.maxint
            if blen == sys.maxint :
                blen = 0
            print ( "Case #%d: %d" % ( self.test , blen ) , file = sys.stderr )
    def run ( self ) :
        try :
            self.in_file = open ( "B-large.in" , "r" )
            self.out_file = open ( "B-large.out" , "w" )
            self.solve ( )
            self.in_file.close ( )
            self.out_file.close ( )
        except IOError :
            pass
