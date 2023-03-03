def main ( ) :
    import sys
    import os
    import subprocess
    class Main ( object ) :
        def __init__ ( self ) :
            self.input = sys.stdin.readline ( )
            self.n = int ( self.input.readline ( ) )
            self.a = int ( self.input.readline ( ) )
            print ( ( self.n ** 2 ) - self.a )
