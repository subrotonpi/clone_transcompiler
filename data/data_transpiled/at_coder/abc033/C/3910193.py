def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        a = self.sc.readline ( )
        b = a.split ( '+' )
        count = 0
        for e in b :
            if '0' not in e :
                count += 1
        print ( count )
