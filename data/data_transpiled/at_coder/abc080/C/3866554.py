def import _scanner
class Main ( object ) :
    def __init__ ( self ) :
        self.open = [ ]
        self.ans = int ( )
        self.n = 0
        self.f = [ ]
        self.sc = _scanner
        self.p = [ ]
        self.first = True
    def func ( self ) :
        self.n = self.n
        self.f = [ ]
        for i in range ( self.n ) :
            for j in range ( self.n ) :
                self.f [ i ] [ j ] = self.sc.randint ( )
        self.p = [ ]
        for i in range ( self.n ) :
            for j in range ( self.n ) :
                self.p [ i ] [ j ] = self.sc.randint ( )
        self.DFS ( 0 )
        print ( self.ans )
    def DFS ( self , pos ) :
        if pos >= 10 :
            return
        self.open [ pos ] = 0
        self.func ( )
        self.DFS ( pos + 1 )
        self.open [ pos ] = 1
        self.func ( )
        self.DFS ( pos + 1 )
    def func ( self ) :
        opencnt = 0
        for i in range ( self.n ) :
            if self.open [ i ] == 0 :
                opencnt += 1
        if opencnt == 10 :
            return
        tmp = 0
        for i in range ( self.n ) :
            cnt = 0
            for j in range ( self.n ) :
                if self.open [ j ] == 0 :
                    continue
                else :
                    if self.f [ i ] [ j ] == 1 :
                        cnt += 1
            tmp += self.p [ i ] [ cnt ]
        self.ans = max ( self.ans , tmp )
return Main
