def _import ( ) : return sys.stdin
class closematch ( InputReader ) :
    def __init__ ( self , name ) :
        self.name = name
    def SUBMIT ( self ) :
        self.name = 'B-large'
        self.bestdiff = 1l << 60
    def b1 ( self , s1 , s2 ) :
        self.name = s1
        self.bestdiff = - 1
    def test1 ( self , s1 , s2 ) :
        for i in range ( 1 , 9 ) :
            w1 = s1.decode ( 'utf-8' )
            w2 = s2.decode ( 'utf-8' )
            x1 = int ( w1 )
            x2 = int ( w2 )
            if abs ( x1 - x2 ) < self.bestdiff :
                self.bestdiff = abs ( x1 - x2 )
                self.b1 = w1
                self.b2 = w2
                self.n1 = x1
                self.n2 = x2
            elif abs ( x1 - x2 ) == self.bestdiff :
                if x1 < n1 or ( x1 == n1 and x2 < n2 ) :
                    self.b1 = w1
                    self.b2 = w2
                    self.n1 = x1
                    self.n2 = x2
    def test2 ( self , s1 , s2 ) :
        w1 = s1.decode ( 'utf-8' )
        w2 = s2.decode ( 'utf-8' )
        x1 = int ( w1 )
        x2 = int ( w2 )
        if abs ( x1 - x2 ) < self.bestdiff :
            self.bestdiff = abs ( x1 - x2 )
            self.b1 = w1
            self.b2 = w2
            self.n1 = x1
            self.n2 = x2
        elif abs ( x1 - x2 ) == self.bestdiff :
            if x1 < n1 or ( x1 == n1 and x2 < n2 ) :
                self.b1 = w1
                self.b2 = w2
                self.n1 = x1
                self.n2 = x2
    def main2 ( self ) :
        self.name = 'B-large'
        self.main2 ( self )
