def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n , self.m , self.l = sys.stdin.readline ( ).strip ( ).split ( ' ' )
    def run ( self ) :
        if self.n == self.m :
            print ( self.l )
        elif self.n == self.l :
            print ( self.m )
        else :
            print ( self.n )
