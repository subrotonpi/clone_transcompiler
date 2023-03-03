def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( )
        self.s += '@'
        self.tmp = ''
        self.cnt = 0
        self.count = ''
        self.list = [ ]
        for i in range ( len ( self.s ) ) :
            self.tmp = str ( self.s [ i ] )
            self.cnt = 0
            for j in range ( i , len ( self.s ) ) :
                if self.tmp [ 0 ] == self.s [ j ] :
                    self.cnt += 1
                elif self.tmp [ 0 ] != self.s [ j ] :
                    self.count = str ( self.cnt )
                    self.list.append ( self.tmp + self.count )
                    self.i = j - 1
                    break
    for name , data in self.list :
        sys.stdout.write ( data )
    sys.stdout.write ( '\n' )
