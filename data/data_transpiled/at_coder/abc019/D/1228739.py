def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
        self.N = self.N
        dia = self.v = self.m = 0
        for i in range ( 2 , self.N + 1 ) :
            print ( "? %d %d\n" % ( 1 , i ) )
            d = self.Scanner.GetValue ( )
            if d > self.m :
                m = d
                v = i
        for i in range ( 1 , self.N + 1 ) :
            if i != v :
                print ( "? %d %d\n" % ( v , i ) )
                d = self.Scanner.GetValue ( )
                if d > dia :
                    dia = d
        print ( "! %d" % dia )
        sys.stdout.flush ( )
