def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        n = self.sc.read ( )
        print ( n / 10 ** 100 + min ( 100 , n % 10 ** 15 ) )
