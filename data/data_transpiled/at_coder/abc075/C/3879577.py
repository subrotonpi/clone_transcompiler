def import _scanner
class Main ( object ) :
    def __init__ ( self ) :
        self.a = [ ]
        self.b = [ ]
        self.move = [ ]
        self.vis = [ ]
    def start ( self ) :
        self.n = self.n
        self.m = self.m
        self.a = [ ]
        self.b = [ ]
        self.move = [ ]
        self.vis = [ ]
        for i in range ( self.n + 1 ) :
            for j in range ( self.n + 1 ) :
                self.move [ i ] [ j ] = False
        for i in range ( self.m ) :
            self.a.append ( self.a [ i ] )
            self.b.append ( self.b [ i ] )
            self.move [ a [ i ] ] [ b [ i ] ] = True
            self.move [ b [ i ] ] [ a [ i ] ] = True
        ans = 0
        conected = 1
        for i in range ( self.m ) :
            self.move [ a [ i ] ] [ b [ i ] ] = False
            self.move [ b [ i ] ] [ a [ i ] ] = False
            for j in range ( self.n + 1 ) :
                self.vis [ j ] = False
            conected = 1
            self.dfs ( 1 )
            self.vis [ 0 ] = True
            for j in range ( self.n + 1 ) :
                if not self.vis [ j ] :
                    conected = 0
            if not conected :
                ans += 1
            self.move [ a [ i ] ] [ b [ i ] ] = True
            self.move [ b [ i ] ] [ a [ i ] ] = True
        print ( ans )
    def dfs ( self ) :
        if self.vis [ x ] :
            return
        self.vis [ x ] = True
        for i in range ( 1 , self.n + 1 ) :
            if self.move [ x ] [ i ] :
                self.dfs ( i )
