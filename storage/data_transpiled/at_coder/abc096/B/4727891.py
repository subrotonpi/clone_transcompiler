def main ( ) :
    import sys
    import math
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            self.stdin = sys.stdin
            self.nums = [ int ( x ) for x in self.stdin.readline ( ).split ( ) ]
            time = int ( self.stdin.readline ( ).split ( ) [ 0 ] )
            self.nums = [ int ( x ) for x in self.nums ]
            self.nums [ 2 ] *= int ( random.randrange ( 2 , time ) )
            print ( sum ( self.nums ) )
