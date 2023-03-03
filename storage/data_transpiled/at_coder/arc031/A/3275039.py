def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        a = self.sc.readline ( )
        b = ''
        a = a.decode ( 'ascii' )
        b = a.decode ( 'ascii' )
        if a == b :
            print ( 'YES' )
        else :
            print ( 'NO' )
