def _import ( ) :
    import sys
    import math
    import math
    class x :
        def __init__ ( self ) :
            self.dx = [ 0 , - 1 , 0 , 1 ]
            self.dy = [ 1 , 0 , - 1 , 0 ]
            self.mc = 100
            self.f = [ ]
            self.xc , self.yc , self.dir = 0 , 0 , 0
        def traverse ( self , s ) :
            for c in s :
                if c == 'F' :
                    self.f [ self.xc ] [ self.yc ] = 2
                    self.xc += self.dx [ self.dir ]
                    self.yc += self.dy [ self.dir ]
                    self.f [ self.xc ] [ self.yc ] = 2
                elif c == 'L' : self.dir += 1
                else : self.dir -= 1
                self.dir &= 3
    def dfs ( x , y ) :
        if self.f [ x ] [ y ] != 0 : return
        self.f [ x ] [ y ] = 1
        self.dfs ( x + 1 , y )
        self.dfs ( x , y + 1 )
        self.dfs ( x - 1 , y )
        self.dfs ( x , y - 1 )
    def main ( args ) :
        with open ( '/proc/' , 'r' ) as f :
            t = int ( f.read ( ) )
            for tt in range ( 1 , t + 1 ) :
                l = int ( f.read ( ) )
                self.f = [ ]
                self.xc = self.mc * 2 + 4
                self.yc = self.mc * 2 + 4
                self.dir = 0
                for s in f.read ( ) :
                    rc = int ( f.read ( ) )
                    for c in range ( rc ) : self.traverse ( c )
            for i in range ( mc * 2 + 5 ) :
                self.f [ 0 ] [ i ] = 1
                self.f [ i ] [ 0 ] = 1
                self.f [ i ] [ 1 ] = 1
                self.f [ i ] [ 0 ] = 1
                self.f [ i ] [ 1 ] = 1
                self.f [ i ] [ 1 ]