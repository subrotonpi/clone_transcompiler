def import _sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = _sys.stdin
        S = [ sc.readline ( ).strip ( ) for i in range ( 3 ) ]
        cnt = [ ]
        def __init__ ( self ) :
            self.S.append ( S [ 0 ] )
            self.S.append ( S [ 1 ] )
            self.S.append ( S [ 2 ] )
            self.cnt.append ( len ( S [ 0 ] ) )
            self.cnt.append ( len ( S [ 1 ] ) )
            self.cnt.append ( len ( S [ 2 ] ) )
        def serch ( self , thisTurn ) :
            if self.cnt [ thisTurn ] <= 0 : return thisTurn
            index = len ( self.S [ thisTurn ] ) - self.cnt [ thisTurn ]
            char = self.S [ thisTurn ] [ index ]
            self.cnt [ thisTurn ] -= 1
            if char == 'a' : return self.serch ( 0 )
            elif char == 'b' : return self.serch ( 1 )
            else : return self.serch ( 2 )
