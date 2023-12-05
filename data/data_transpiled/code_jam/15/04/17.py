def gcj._2015.qual
import os
import sys
import os
import sys
import sys
import os
import sys
class D ( object ) :
    def solve ( self ) :
        input = open ( 'data/gcj/2015/qual/D-large.in' )
        self.input = input
        test = open ( 'data/gcj/2015/qual/D.out' , 'w' )
        sys.stdout = sys.__stdout__
        sys.stdout = test
        case = self.input.readline ( )
        self.input.readline ( )
        for i in range ( 1 , case + 1 ) :
            sys.stdout.write ( 'Case #%d: %s\n' % ( i , 'GABRIEL' if self.solve_case ( ) else 'RICHARD' ) )
    def solve_case ( self ) :
        x = self.input.readline ( )
        r = self.input.readline ( )
        c = self.input.readline ( )
        if r > c :
            tmp = r
            r , c = c , tmp
        if r * c % x != 0 :
            return False
        if x == 1 :
            return True
        if x == 2 :
            return True
        if x == 3 :
            return r >= 2
        if x == 4 :
            return r == 3 and c >= 4 or r > 3
        if x == 5 :
            return r == 3 and c >= 10 or r > 3
        if x == 6 :
            return r > 3
        return False
    def main ( self ) :
        super ( D , self ).solve ( )
