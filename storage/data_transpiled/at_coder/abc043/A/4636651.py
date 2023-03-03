def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.count = sys.stdin.read ( )
    def main ( self ) :
        self.total = 0
        for ix in range ( 1 , self.count + 1 ) :
            total += ix
        print ( total )
