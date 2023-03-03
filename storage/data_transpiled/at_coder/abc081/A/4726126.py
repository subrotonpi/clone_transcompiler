def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( )
        self.strlist = self.s.split ( '' )
        sum = 0
        for i in self.strlist :
            sum = sum + int ( i )
        print ( sum )
