def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.m = int ( sys.stdin.readline ( ) )
        self.x = int ( sys.stdin.readline ( ) )
        self.y = int ( sys.stdin.readline ( ) )
        self.as = [ ]
        self.bs = [ ]
        for i in range ( self.n ) :
            self.as.append ( i )
        for i in range ( self.m ) :
            self.bs.append ( i )
        taken_a = taken_b = time = 0
        returned = 0
        try :
            while True :
                while self.as [ taken_a ] < time :
                    pass
                time = self.as [ taken_a - 1 ] + x
                while self.bs [ taken_b ] < time :
                    pass
                time = self.bs [ taken_b - 1 ] + y
                returned += 1
        except IndexError :
            print ( returned )
