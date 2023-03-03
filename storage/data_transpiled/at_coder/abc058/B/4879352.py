def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        o = self.sc.readline ( )
        e = self.sc.readline ( )
        for i in o :
            print ( "%s%s" % ( i , i ) , end = "" )
        print ( )
