def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
    def main ( self ) :
        self.count = self.n
        for i in range ( 0 , self.n ) :
            t = i
            c = 0
            while t > 0 :
                c += t % 6
                t /= 6
            t = self.n - i
            while t > 0 :
                c += t % 9
                t /= 9
            self.count = min ( self.count , c )
        print ( self.count )
