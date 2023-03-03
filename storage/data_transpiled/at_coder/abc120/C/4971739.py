def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
        self.Counter1 , self.Counter0 = 0 , 0
        N = self.Scanner.next ( )
        S = [ ]
        for i in N :
            S.append ( str ( i ) )
            if S [ i ] == '1' :
                self.Counter1 += 1
            else :
                self.Counter0 += 1
        print ( min ( self.Counter0 * 2 , self.Counter1 * 2 ) )
