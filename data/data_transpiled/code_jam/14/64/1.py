def import _paradox_easy
import os
import sys
import os
import sys
import sys
import os
import sys
class Paradox_easy :
    PROBLEM_NAME = "paradox_easy"
    WORK_DIR = r"D:\GCJ\\"+PROBLEM_NAME+" \ \"
    def __init__ ( self , pos ) :
        if pos == self.N :
            which = self.p [ 0 ]
            for i in range ( 1 , N ) :
                if self.pref [ self.p [ i ] ] [ which ] == 'Y' :
                    which = self.p [ i ]
                if which == A :
                    self.find = True
                    res = self.p [ : ]
                return
            for p in range ( 0 , self.N ) and not self.find :
                if not self.used [ p [ pos ] ] :
                    self.used [ p [ pos ] ] = True
                    self.go ( pos + 1 )
                    self.used [ p [ pos ] ] = False
    def solve ( self , f ) :
        N = self.p [ 0 ]
        A = self.p [ 1 ]
        pref = [ ]
        for i in range ( self.p [ 0 ] ) :
            pref.append ( self.p [ i ].capitalize ( ) )
        p = [ ]
        self.used = [ ]
        self.find = False
        self.go ( 0 )
        if self.find :
            for i in range ( self.p [ 0 ] ) :
                f.write ( " " + str ( self.res [ i ] ) + "\n" )
            f.write ( "\n" )
        else :
            f.write ( " IMPOSSIBLE\n" )
    def main ( ) :
        with open ( os.path.join ( WORK_DIR , "input.txt" ) , "r" ) as sc :
            with open ( os.path.join ( WORK_DIR , "output.txt" ) , "w" ) as pw :
                casecnt = len ( sc.read ( ) )
                for casenum in range ( self.casecnt ) :
                    print ( "Processing test case " + str (