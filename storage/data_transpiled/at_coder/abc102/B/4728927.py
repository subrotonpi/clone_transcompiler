def main ( ) :
    import sys
    import os
    import subprocess
    class Main ( object ) :
        def __init__ ( self ) :
            self.stdin = sys.stdin
            self.stdout.readline ( )
            self.nums = [ int ( x ) for x in self.stdin.readline ( ).split ( ) ]
            self.nums = [ int ( x ) for x in self.nums ]
            self.print ( self.nums [ - 1 ] - self.nums [ 0 ] )
