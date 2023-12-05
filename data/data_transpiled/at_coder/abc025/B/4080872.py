def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ).strip ( ) )
        self.a = int ( sys.stdin.readline ( ).strip ( ) )
        self.b = int ( sys.stdin.readline ( ).strip ( ) )
        self.place = 0
        for s , d in zip ( self.n , self.a , self.b ) :
            if d < a :
                d = a
            elif d > b :
                d = b
            if s == "East" :
                self.place += d
            else :
                self.place -= d
        if self.place > 0 :
            print ( "East " , end = " " )
        elif self.place < 0 :
            print ( "West " , end = " " )
        print ( abs ( self.place ) )
