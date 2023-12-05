def year2016.round1a
import os
import sys
import os
import sys
import csv
class RankAndFile :
    def __init__ ( self ) :
        self.inputFile = os.path.abspath ( 'B-large.in' )
        with open ( inputFile , 'r' ) as infile :
            self.outputFile = open ( 'output.txt' , 'w' )
            self.T = int ( infile.read ( ) )
    for t in range ( T ) :
        N = int ( infile.read ( ) )
        stat = [ 0 ] * 2501
        for i in range ( N * ( 2 * N - 1 ) ) :
            height = int ( infile.read ( ) )
            stat [ height ] += 1
        output = [ ]
        for i in range ( 1 , 2500 ) :
            if stat [ i ] % 2 == 1 :
                output.append ( ' '.join ( [ str ( i ) for i in range ( 1 , i + 1 ) ] ) )
        print ( 'Case #%d:' % ( t + 1 ) , file = output_file )
