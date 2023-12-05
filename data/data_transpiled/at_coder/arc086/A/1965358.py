def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
        for i in range ( self.N ) :
            N , K = self.Scanner.scan ( )
    d = { }
    for i in range ( self.N ) :
        x = self.Scanner.scan ( )
        if x not in d :
            d [ x ] = 1
        else :
            d [ x ] = d [ x ] + 1
    d = sorted ( d.values ( ) )
    ans = 0
    for i in d [ : - K ] :
        ans += i
    print ( ans )
