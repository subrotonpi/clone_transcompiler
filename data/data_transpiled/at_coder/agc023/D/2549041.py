def _import ( ) : return next ( )
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.sgn = 1
    def __next__ ( self ) :
        self.sgn = - 1
        self.sgn = 0
        while True :
            if self.sgn < '0' or self.sgn > '9' :
                raise StopIteration
            self.sgn += self.sgn
            self.x = [ ]
            self.p = [ ]
            for i in range ( self.n ) :
                self.x.append ( self.x [ i ] )
                self.p.append ( self.p [ i ] )
            self.sgn = 1
        return self.sgn
    def __next__ ( self ) :
        self.sgn = 0
        while True :
            if self.sgn < 0 or self.sgn > '9' :
                raise StopIteration
            self.sgn += 1
            self.x = [ ]
            self.p = [ ]
        self.sgn = 1
        return self.sgn
    def __next__ ( self ) :
        self.sgn = 0
        while True :
            if self.sgn > 0 :
                self.x = [ ]
                self.p = [ ]
            self.sgn = 1
        return self.sgn
    def __next__ ( self ) :
        self.sgn = 1
        while True :
            if self.sgn < 0 or self.sgn > 0 :
                self.x.append ( self.x [ - 1 ] )
                self.p.append ( self.x [ - 1 ] )
            else :
                self.x.append ( self.x [ - 1 ] )
            break
        if self.sgn >= 0 :
            self.sgn -= 1
        return self.sgn
    def __next__ ( self ) :
        self.sgn = 1
        while True :
            self.x = [ ]
            self.p = [ ]
            self.sgn -= 1
        return self.sgn
