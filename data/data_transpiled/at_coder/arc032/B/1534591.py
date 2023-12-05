def import _solve
class Main ( object ) :
    def __init__ ( self ) :
        self.to = [ ]
        self.visit = False
    def __init__ ( self ) :
        self.to = [ ]
        self.visit = False
    def Scanner ( ) :
        sc = _connect ( )
        self.N = sc.__next__ ( )
        self.M = sc.__next__ ( )
        self.node = [ ]
        for i in range ( 100000 ) :
            a = sc.__next__ ( )
            b = sc.__next__ ( )
            self.node [ a - 1 ].to.append ( b - 1 )
            self.node [ b - 1 ].to.append ( a - 1 )
        count = 0
        for i in range ( N ) :
            if self.visit :
                continue
            self.visit = True
            self.solve ( self.node )
            count += 1
        print ( count - 1 )
    def solve ( self ) :
        for i in range ( len ( self.to ) ) :
            next = self.to [ i ]
            if self.visit :
                continue
            self.visit = True
            self.solve ( next )
