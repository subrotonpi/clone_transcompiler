def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.s = sys.stdin.readline ( )
        self.max = 0
        for i in range ( 1 , n ) :
            s1 = [ s [ : i ].split ( '' ) for s in self.s [ : i ] ]
            s2 = [ s [ i : ].split ( '' ) for s in self.s [ i : ] ]
            s1 = set ( s1 ).intersection ( s2 )
            if len ( s1 ) > self.max :
                self.max = len ( s1 )
        print ( self.max )
