def import import _scanner
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.m = int ( self.m )
        self.ans = 0
        self.map = [ ]
        self.map1 = [ ]
        for i in range ( self.m ) :
            u = self.n - 1
            v = self.n - 1
            self.map [ u ].append ( v )
            self.map [ v ].append ( 1 )
        for i in range ( self.n ) :
            if self.map1 [ i ] == False :
                if self.dfs ( i ) :
                    self.ans += 1
        print ( self.ans )
    def dfs ( self , number ) :
        if not self.map1 [ number ] :
            self.map1 [ number ] = True
        else :
            return False
        for i in range ( self.n ) :
            if self.map [ number ] [ i ] == 1 :
                self.map [ i ] [ number ] = 0
                if not self.dfs ( i ) :
                    return False
        return True
