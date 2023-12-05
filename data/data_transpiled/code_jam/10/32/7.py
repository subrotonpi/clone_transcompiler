def import loadtest
import os
import sys
import os
import loadtest
class Loadtest :
    def __init__ ( self ) :
        self.counter = 0
        accumulator = self.c
        pdoub = p * 1.0
        while pdoub / l > self.c :
            pdoub = pdoub / accumulator
            accumulator *= accumulator
            counter += 1
        return counter
    def main ( self ) :
        filename = sys.argv [ 1 ]
        with open ( filename , 'r' ) as f :
            self.num_cases = len ( f.readlines ( ) )
        for i in range ( self.num_cases ) :
            L , P , C = loadtest ( f.readlines ( ) )
            print ( 'Case #%d: ' % ( i + 1 ) , end = ' ' )
            print ( loadtest.numIterations ( L , P , C ) )
