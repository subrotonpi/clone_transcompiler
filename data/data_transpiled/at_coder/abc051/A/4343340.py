def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        S = self.sc.readline ( ).split ( ',' )
        for i in S : print ( i , end = ' ' )
