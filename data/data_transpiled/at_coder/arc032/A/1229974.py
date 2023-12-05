def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
    def main ( self ) :
        n = self.s.count ( )
        if n == 1 :
            print ( "BOWWOW" )
            return
        n = n * ( n + 1 ) / 2
        for i in range ( 2 , n ) :
            if n % i == 0 :
                print ( "BOWWOW" )
                return
        print ( "WANWAN" )
