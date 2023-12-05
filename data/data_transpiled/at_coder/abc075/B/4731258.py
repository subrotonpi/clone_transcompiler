def import import sys
import os
import sys
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.h = 0
        self.w = 0
        squares = [ ]
        with open ( sys.argv [ 1 ] ) as f :
            tmp = f.read ( ).split ( 's' )
            h = int ( tmp [ 0 ] )
            w = int ( tmp [ 1 ] )
            squares = [ [ line.split ( ' ' ) [ 0 ] for line in squares ] for line in f ]
    def __init__ ( self ) :
        self.h = h
        self.w = w
    def __init__ ( self ) :
        self.squares = squares
    def __init__ ( self ) :
        self.count = [ ]
        for line in self.squares :
            for i in range ( len ( line ) ) :
                if line [ i ] == '#' :
                    self.count [ i ] [ j ] = - 1
                    if 0 <= i - 1 and self.squares [ i - 1 ] [ j ] != '#' :
                        self.count [ i - 1 ] [ j ] += 1
                    if i + 1 < h and self.squares [ i + 1 ] [ j ] != '#' :
                        self.count [ i + 1 ] [ j + 1 ] += 1
                    if 0 <= i - 1 < h and self.squares [ i + 1 ] [ j ] != '#' :
                        self.count [ i + 1 ] [ j ] += 1
                    if 0 <= i - 1 < w and self.squares [ i + 1 ] [ j ] != '#' :
                        self.count [ i + 1 ] [ j ] += 1
for i in range ( len ( self.count ) ) :
    self.count [ i ] = self.count [ i ]
