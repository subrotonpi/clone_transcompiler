def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a , self.d = sys.stdin.read ( ).split ( '\n' )
        self.attack = ( self.a + 1 ) * self.d
        self.defence = ( self.d + 1 ) * self.a
        if self.attack == self.defence :
            print ( self.attack )
        elif self.attack > self.defence :
            print ( self.attack )
        else :
            print ( self.defence )
