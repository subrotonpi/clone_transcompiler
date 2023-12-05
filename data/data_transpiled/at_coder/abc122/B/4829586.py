def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        arr = self.stdin.read ( ).decode ( 'utf-8' )
        max , cur = 0 , 0
        for c in arr :
            if c == 'A' or c == 'T' or c == 'C' or c == 'G' :
                max = max
                cur += 1
            else :
                cur = 0
        self.stdout.write ( "%s" % max )
