def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = len ( sys.argv )
        self.s = [ ]
        self.flag1 = 0
        self.flag2 = 0
        for i in range ( self.n ) :
            self.s.append ( self.s [ i ] )
            if i > 0 :
                if self.s [ i - 1 ] [ - 1 ] != self.s [ i ] [ 0 ] :
                    self.flag1 = 1
        self.s.sort ( )
        for i in range ( 1 , self.n ) :
            if self.s [ i - 1 ] == self.s [ i ] :
                self.flag2 = 1
        if self.flag1 == 0 and self.flag2 == 0 :
            sys.stdout.write ( 'Yes' )
        else :
            sys.stdout.write ( 'No' )
