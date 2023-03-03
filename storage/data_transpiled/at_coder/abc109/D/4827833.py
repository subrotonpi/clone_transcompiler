def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.h , self.w = sys.argv [ 1 ] , sys.argv [ 2 ]
        self.froml , self.fromu = 0 , 0
        s = [ ]
        for i in range ( self.h ) :
            self.froml = 0
            for j in range ( self.w ) :
                a = sys.stdin.read ( 1 )
                a += self.froml
                if j == self.w - 1 :
                    a += self.fromu
                    self.fromu = a % 2
                    if self.fromu == 1 and self.i + 2 <= self.h :
                        s.append ( ( i + 1 , j + 1 , i + 2 , j + 1 ) )
                    break
                self.froml = a % 2
                if self.froml == 1 :
                    s.append ( ( i + 1 , j + 1 , i + 1 , j + 2 ) )
        print ( len ( s ) )
        for i in range ( len ( s ) ) :
            print ( s [ i ] )
