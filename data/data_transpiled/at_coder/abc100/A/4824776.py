def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.data = sys.stdin.read ( )
        self.AB = [ ]
        self.cont = 0
        for x in self.data.split ( ) :
            self.AB.append ( int ( x ) )
            self.cont += 1
        if self.AB [ 0 ] <= 8 and self.AB [ 1 ] <= 8 :
            print ( "Yay!" )
        else :
            print ( ":(" )
