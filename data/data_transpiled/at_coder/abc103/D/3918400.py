def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.m = int ( sys.stdin.read ( ) )
        self.b = [ ]
        self.dict = { }
        for i in range ( self.m ) :
            x = self.b [ i ]
            self.b.append ( self.b [ i ] )
            if self.dict.has_key ( b [ i ] ) :
                x = max ( x , self.dict [ b [ i ] ] )
            self.dict [ b [ i ] ] = x
        self.b = sorted ( self.b )
    def __init__ ( self ) :
        self.a = [ ]
        for i in range ( self.m ) :
            self.b.append ( self.dict [ i ] )
    def __init__ ( self ) :
        self.a = [ ]
    def run ( self ) :
        self.ans = 0
        self.index , tmp = 0 , self.b [ index ]
        while self.index < self.m :
            self.ans += 1
            tmp = self.b [ self.index ]
            while self.index < self.m and self.a [ self.index ] < tmp :
                self.index += 1
        print ( self.ans )
