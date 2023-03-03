def import _gen_file
import os
import sys
import os
import sys
import csv
import csv
import csv
import csv
import sys
class SquareTiles ( ) :
    def __init__ ( self ) :
        Scanner ( sys.stdin )
        self.writer = csv
    def __init__ ( self ) :
        Scanner ( sys.stdout )
        self.writer = csv
        self.COUNT = sys.stdin.read ( )
        for y in range ( 1 , COUNT + 1 ) :
            N , M = self.COUNT , self.COUNT
            matrix = [ ]
            for t in csv.reader ( lambda x : x.strip ( ) ) :
                for j in range ( M ) :
                    matrix.append ( t [ j ] )
            impossible = False
            loop :
            for i in range ( N ) :
                for j in range ( M ) :
                    if matrix [ i ] [ j ] == '#' :
                        if i < N - 1 and j < M - 1 and matrix [ i ] [ j ] == '#' and matrix [ i ] [ j + 1 ] == '#' and matrix [ i + 1 ] [ j ] == '#' and matrix [ i + 1 ] [ j + 1 ] == '#' :
                            matrix [ i ] [ j ] = '/'
                            matrix [ i ] [ j + 1 ] = ' \ \'
                            matrix [ i + 1 ] [ j ] = ' \ \'
                            matrix [ i + 1 ] [ j + 1 ] = '/'
                        else :
                            impossible = True
                            break loop
        self.writer.write ( 'Case #%d:\n' % y )
        if impossible :
            self.writer.write ( 'Impossible\n' )
        else :
            for i in range ( N ) :
                for j in range ( M ) :
                    self.writer.write ( matrix [ i ] [ j ] )
                self.writer.write ( '\n' )
