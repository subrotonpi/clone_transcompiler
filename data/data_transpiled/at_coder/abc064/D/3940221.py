def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = self.n
        self.s = self.s
        self.up = 0
        self.down = 0
        self.s = [ ]
        for c in self.s :
            if c == '(' :
                for i in range ( self.down ) :
                    self.insert ( 0 , '(' )
                for i in range ( self.down ) :
                    self.append ( ')' )
                self.down = 0
                self.s.append ( c )
                self.up += 1
            else :
                if self.up == 0 :
                    self.down += 1
                else :
                    self.s.append ( c )
                    self.up -= 1
        for i in range ( self.down ) :
            self.insert ( 0 , '(' )
        for i in range ( self.down ) :
            self.append ( ')' )
        for i in range ( self.up ) :
            self.append ( ')' )
        print ( '\n'.join ( self.s ) )
