def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
    def __init__ ( self ) :
        self.a = [ ]
        self.sum = 0
        for i in range ( self.N ) :
            self.a.append ( sys.stdin.read ( ) )
            self.sum += self.a [ i ]
        if self.sum % self.N != 0 :
            print ( - 1 )
        if self.sum % self.N == 0 :
            ave = self.sum / self.N
            count = 0
            t = 0
            for i in range ( self.N ) :
                t += self.a [ i ]
                if t != ( i + 1 ) * ave :
                    count += 1
            print ( count )
