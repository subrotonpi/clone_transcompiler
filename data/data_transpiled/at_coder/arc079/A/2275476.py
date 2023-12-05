def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ).strip ( ) )
        self.m = int ( sys.stdin.readline ( ).strip ( ) )
        self.s1 = set ( )
        self.sn = set ( )
        for a , b in zip ( self.s1 , self.sn ) :
            if a == 1 :
                self.s1.add ( b )
            if b == self.n :
                self.sn.add ( a )
        self.s1.retainAll ( self.sn )
        print ( 'IMPOSSIBLE' if self.s1 == set ( ) else 'POSSIBLE' )
