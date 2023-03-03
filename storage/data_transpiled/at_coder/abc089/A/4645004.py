def import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        scn = raw_input ( )
        n = scn.__next__ ( )
        ans = n / 3
        sys.stdout.write ( ans )
