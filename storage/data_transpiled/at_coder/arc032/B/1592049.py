def import _solve
class Main ( object ) :
    def __init__ ( self ) :
        self.to = [ ]
        self.visit = False
    def node ( self ) :
        self.to = [ ]
        self.visit = False
class Node ( object ) :
    def __init__ ( self , node ) :
        self.to = [ ]
        self.visit = False
    def solve ( self ) :
        sc = _raw_input ( )
        N = sc.__next__ ( )
        M = sc.__next__ ( )
        for i in range ( N ) :
            self.node.append ( Node ( ) )
        for i in range ( M ) :
            a = sc.__next__ ( )
            b = sc.__next__ ( )
            self.node [ a - 1 ].to.append ( b - 1 )
            self.node [ b - 1 ].to.append ( a - 1 )
        count = 0
        for i in range ( N ) :
            if self.visit :
                continue
            self.visit = True
            solve ( self )
            count += 1
        print ( count - 1 )
    def solve ( self ) :
        for i in range ( len ( self.to ) ) :
            next = self.to [ i ]
            if self.visit :
                continue
            self.visit = True
            solve ( self )
