def _ _ main _ _ ( ) : return sys.stdin.readline ( ).rstrip ( )
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = FastScanner ( sys.stdin )
        self.pw = sys.stdout
        self.N = self.sc.__next__ ( )
        self.A = self.sc.__next__ ( )
        answer = self.solve ( )
        self.pw.write ( answer.value )
        self.pw.write ( len ( answer.way ) )
        for each in answer.way :
            self.pw.write ( each + 1 )
        self.pw.flush ( )
    def solve ( self ) :
        self.even = 0
        for i in range ( self.N ) :
            if i % 2 == 0 and self.A [ i ] > 0 :
                self.even += self.A [ i ]
        self.odd = 0
        for i in range ( self.N ) :
            if i % 2 == 1 and self.A [ i ] > 0 :
                self.odd += self.A [ i ]
        if self.even <= 0 and self.odd <= 0 :
            return self.case_0 ( )
        ways = [ ]
        for i in self.A :
            ways.append ( long ( i ) )
        if self.odd > self.even :
            ways.pop ( )
            ways.append ( 0 )
        while len ( ways ) > 1 :
            if len ( ways ) == 2 :
                ways.pop ( )
                ways.pop ( )
                ways.pop ( )
            else :
                if ways [ 0 ] < 0 :
                    ways.append ( 0 )
                    ways.pop ( )
                    ways.pop ( )
                else :
                    next_even = ways [ 2 ]
                    if next_even >= 0 :
                        first = ways [ 1 ]
                        ways.append ( 1 )
                        ways [ 1 ] = first + next_even
                        ways.pop ( 2 )
                        ways.pop ( 0 )
                    else :
                        if len ( ways ) == 3 :
                            ways.pop ( )
                            ways.append ( 2 )
                        else :
                            second = ways [ 1 ]
                            forth = ways [ 3 ]
                            ways.pop (