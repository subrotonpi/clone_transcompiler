def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.s = sys.stdin.read ( )
        self.c = [ False ] * 26
        for ssc in self.s :
            pos = ord ( ssc ) - 97
            if self.c [ pos ] :
                self.print ( 'no' )
                return
            else :
                self.c [ pos ] = True
        self.sc.close ( )
        self.print ( 'yes' )
