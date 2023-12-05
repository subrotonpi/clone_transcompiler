def import _readline
import sys
import math
import string
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = string
        self.ok = False
        self.ans = string
    def rec ( self ) :
        if self.ok :
            return
        pos = - 1
        for i , c in enumerate ( self.s ) :
            if c == '?' :
                pos = i
                break
        if pos == - 1 :
            b = 0
            for i , c in enumerate ( self.s ) :
                if c == '1' :
                    b = b + 1 >> ( len ( self.s ) - 1 - i )
            l , r = 1 , 10 ** 25
            while l != r :
                x = l + r >> 1
                xx = x * x
                if xx >= b :
                    r = x
                else :
                    l = x + 1
            test = l * l
            if test == b :
                self.ok = True
                self.ans = test.split ( ) [ 2 ]
        else :
            self.s [ pos ] = '0'
            self.rec ( )
            self.s [ pos ] = '1'
            self.rec ( )
            self.s [ pos ] = '?'
    def run ( self ) :
        with open ( 'D.in' , 'r' ) as infile :
            with open ( 'D.out' , 'w' ) as outfile :
                T = infile.readline ( ).strip ( )
                infile.readline ( ).strip ( )
                for t in range ( 1 , T + 1 ) :
                    outfile.write ( 'Case #%d: ' % t )
                    ss = infile.readline ( ).strip ( )
                    self.s = string.join ( ss , '' )
                    self.ok = False
                    self.rec ( )
                    outfile.write ( ans )
                    outfile.flush ( )
