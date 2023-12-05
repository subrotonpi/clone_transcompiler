def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.map = [ ]
        self.way = [ ]
        self.check = [ ]
        for i in range ( self.n ) :
            self.map [ i ] = [ ]
        for a in range ( self.n - 1 ) :
            b = self.n - 1
            self.map [ a ].append ( b )
            self.map [ b ].append ( a )
        self.bfs ( self.n - 1 )
        self.way.append ( self.n - 1 )
        num = [ ]
        self.check = [ False for i in range ( self.way ) ]
        for i in range ( self.way ) :
            self.check [ i ] = True
        for i in range ( self.way ) :
            num.append ( self.count ( i ) )
        black = 0
        for i in range ( self.way // 2 + self.way % 2 ) :
            black += self.num [ i ]
        if black <= self.n - black :
            print ( "Snuke" )
        else :
            print ( "Fennec" )
    def bfs ( self , pos ) :
        if not pos :
            return True
        self.check [ pos ] = True
        ans = False
        for i in range ( self.way ) :
            next = self.map [ i ]
            if not self.check [ next ] :
                if bfs ( next ) :
                    ans = True
                    self.way.append ( next )
                    break
        return ans
    def count ( self ) :
        ans = 1
        self.check [ pos ] = True
        for i in range ( self.way ) :
            next = self.map [ i ]
            if not self.check [ next ] :
                if bfs ( next ) :
                    ans = True
                    self.way.append ( next )
                    break
        return ans
return Main
