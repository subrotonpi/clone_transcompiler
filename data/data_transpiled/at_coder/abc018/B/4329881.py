def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.str = sys.stdin.read ( )
        self.c = [ ]
        self.tmp = [ ]
        for i in range ( len ( self.c ) ) :
            self.c.append ( self.str [ i ] )
        self.n = len ( self.c )
    def main ( self ) :
        for i in range ( self.n ) :
            tmp_l = self.n - 1
            tmp_r = self.n - 1
            for j in range ( tmp_r - tmp_l + 1 ) :
                self.tmp.append ( self.c [ tmp_l + j ] )
            for j in range ( tmp_r - tmp_l + 1 ) :
                self.c [ tmp_l + j ] = self.tmp [ tmp_r - tmp_l - j ]
        for a in self.c :
            print ( a , end = '' )
        print ( '' )
