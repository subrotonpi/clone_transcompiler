def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ).strip ( ) )
        self.max_s = ""
        max = 0
        total = 0
        for s in self.n :
            p = int ( sys.stdin.readline ( ).strip ( ) )
            total += p
            if max < p :
                max = p
                self.max_s = s
        if max > ( total ) / 2 :
            print ( self.max_s )
        else :
            print ( "atcoder" )
