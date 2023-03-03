def import _main
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.list = [ ]
        self.a = 0
        self.b = 0
        self.N = 0
        self.M = 0
        self.sum = 0
        self.keiro = [ ]
        self.que = [ ]
        def main ( self ) :
            self.scan ( )
            self.que.append ( self.a )
            while not self.que.empty ( ) :
                temp = self.list [ self.que [ 0 ] ]
                for i in range ( len ( temp ) ) :
                    if self.keiro [ temp [ i ] ] [ 0 ] > self.keiro [ que [ 0 ] ] [ 0 ] + 1 :
                        self.keiro [ temp [ i ] ] [ 0 ] = self.keiro [ que [ 0 ] ] [ 0 ] + 1
                        self.keiro [ temp [ i ] ] [ 1 ] += self.keiro [ que [ 0 ] ] [ 1 ] % 1000000007
                        self.que.append ( temp [ i ] )
                    elif self.keiro [ temp [ i ] ] [ 0 ] == self.keiro [ que [ 0 ] ] [ 0 ] + 1 :
                        self.keiro [ temp [ i ] ] [ 1 ] += self.keiro [ que [ 0 ] ] [ 1 ] % 1000000007
                del que [ 0 ]
            print ( self.keiro [ b ] [ 1 ] )
    Note :./ Main.py.uses.unsafe.operations.Note : Recompile.with - Xlint :
    for details in [ '' , '' , '' ] :
        self.list = [ ]
        self.keiro = [ [ 200 , 0 ] ]
        self.keiro = [ [ ] ]
        self.keiro.append ( [ ] )
