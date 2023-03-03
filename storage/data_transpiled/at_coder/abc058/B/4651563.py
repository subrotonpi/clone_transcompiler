def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        o = self.sc.readline ( )
        e = self.sc.readline ( )
        for i in range ( 0 , len ( o ) ) :
            if i < len ( o ) :
                sys.stdout.write ( o [ i ] )
            else :
                break
            if i < len ( e ) :
                sys.stdout.write ( e [ i ] )
