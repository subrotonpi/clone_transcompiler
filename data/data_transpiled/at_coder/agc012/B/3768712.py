def import _core
class Main ( object ) :
    def __init__ ( self ) :
        self.mod = ( int ( 1e9 ) + 7 )
        self.n = int ( self.n )
        self.m = int ( self.m )
        g = [ [ ] for i in range ( self.n ) ]
        for i in range ( self.m ) :
            a = int ( self.n ) - 1
            b = int ( self.n ) - 1
            g [ a ].append ( b )
            self.g [ b ].append ( a )
        self.q = int ( self.q )
        self.v = [ int ( self.n ) - 1 for i in self.q ]
        self.d = [ int ( self.n ) - 1 for i in self.q ]
        self.c = [ int ( self.n ) - 1 for i in self.q ]
        self.result = [ ]
        self.used = [ - 1 ]
        for t in self.q - 1 :
            que = deque ( )
            self.push ( t , self.v [ t ] , self.d [ t ] , que )
            while que.popleft ( ) != 0 :
                i = que.popleft ( )
                if i in self.used :
                    for j in self.g [ i ] :
                        self.push ( t , self.g [ i ] [ j ] , self.used [ i ] - 1 , que )
        for i in self.n :
            print ( self.result [ i ] )
    def push ( self , t , i , dist , que ) :
        if used [ i ] < dist :
            self.used [ i ] = dist
            if self.result [ i ] == 0 :
                self.result [ i ] = c [ t ]
            self.que.popleft ( )
