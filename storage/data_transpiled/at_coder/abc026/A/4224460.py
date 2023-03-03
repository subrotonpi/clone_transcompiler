def import import *
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = Scanner ( )
        print ( long ( sum ( [ x * y for x , y in zip ( self.sc.next ( ) , self.sc.next ( ) ) ] ) ) )
