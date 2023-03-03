def import _scanner
class Main ( object ) :
    def __init__ ( self ) :
        self.ans = 0
    def __init__ ( self ) :
        self.ans = 0
    def dfs ( self , path , node ) :
        self.ans = 0
        self.path = [ [ False for a in range ( self.n ) ] for b in range ( self.m ) ]
        self.path [ self.n ] [ self.n ] = True
        self.path [ self.n ] [ self.m ] = True
        self.path [ self.n ] [ self.n ] = True
        self.path [ self.n ] [ self.m ] = True
        self.path [ self.n ] [ self.n ] = True
        self.path [ self.n ] [ self.m ] = True
        self.path [ self.n ] [ self.n ] = True
        self.flg = [ ]
        self.dfs ( flg , path , 1 )
        print ( self.ans )
    def dfs ( self , flg , path , node ) :
        if self.flg [ node ] :
            return
        self.flg [ node ] = True
        judge = True
        for i in range ( 1 , len ( self.flg ) ) :
            if not self.flg [ i ] :
                judge = False
                break
        if judge :
            self.ans += 1
            return
        for i in range ( 1 , len ( self.path [ node ] ) ) :
            if self.path [ node ] [ i ] :
                next_flg = self.flg [ node ] [ i ]
                self.dfs ( next_flg , path , i )
