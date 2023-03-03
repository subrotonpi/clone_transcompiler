def import _solve
import os
import sys
import os
import sys
import subprocess
import time
import sys
class Solution ( object ) :
    INPUT_FILE_NAME = 'a.big.in.txt'
    OUTPUT_FILE_NAME = 'a.big.out.txt'
    def __init__ ( self ) :
        self._solve = _solve
    def solve ( self ) :
        rd = open ( Solution.INPUT_FILE_NAME )
        wr = open ( Solution.OUTPUT_FILE_NAME , 'w' )
        line = rd.readline ( )
        line = line.split ( )
        nn = int ( line [ 0 ] )
        for ii in range ( nn ) :
            self.sub_solve ( ii )
        rd.close ( )
        wr.close ( )
    def sub_solve ( self ) :
        line = rd.readline ( )
        line = line.split ( )
        n = int ( line [ 0 ] )
        a = [ ]
        b = [ ]
        line = rd.readline ( )
        line = line.split ( )
        line = line [ 0 : n ]
        a.append ( int ( line [ n - 1 ] ) )
        line = rd.readline ( )
        line = line [ n - 1 : ]
        b.append ( int ( line [ n - 1 ] ) )
        a.sort ( )
        b.sort ( )
        result = 0
        for i in range ( n ) :
            result += ( a [ i ] * b [ n - i - 1 ] )
        wr.write ( 'Case #%d: %d\n' % ( self._ii + 1 , result ) )
