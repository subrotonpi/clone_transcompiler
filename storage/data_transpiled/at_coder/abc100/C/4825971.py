def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout.readline ( )
        self.stdout.readline ( )
        self.N = int ( self.stdout.readline ( ) )
        self.stdout.readline ( )
        self.stdout.readline ( )
        self.a = [ ]
        self.cont = 0
        for x in self.stdout.readline ( ).split ( ) :
            self.a.append ( int ( x ) )
            self.cont += 1
    ans = 0
    for i in self.a :
        while i % 2 == 0 :
            if i % 2 == 0 :
                i /= 2
                ans += 1
    print ( ans )
