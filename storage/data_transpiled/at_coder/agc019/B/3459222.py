def import import sys
import struct
class Main ( struct.Struct ) :
    def __init__ ( self ) :
        struct.Struct.__init__ ( self )
        self.line = sys.stdin.readline ( )
        self.line = sys.stdin.readline ( )
        self.line = sys.stdin.readline ( )
        self.line = sys.stdin.readline ( )
        self.line = sys.stdin.readline ( )
        self.line = sys.stdin.readline ( )
        self.a_count = [ 0 ] * 26
        rev = 0
        self.answer = 1
        for chr in self.line :
            self.a_count [ ord ( chr ) - ord ( 'a' ) ] += 1
        for data in self.a_count [ : ] :
            if data > 1 :
                rev = rev + data * ( data - 1 ) / 2
        if self.line :
            self.answer = self.answer + self.line * ( self.line - 1 ) / 2
        print ( self.answer - rev )
