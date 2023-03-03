def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.l = int ( sys.stdin.read ( ) )
        self.t = int ( sys.stdin.read ( ) )
        self.x = [ ]
        self.w = [ ]
        for i in range ( self.n ) :
            self.x.append ( i )
            self.w.append ( i )
        cnt = 0
        for i in range ( 1 , self.n ) :
            if self.w [ 0 ] == 1 and self.w [ i ] == 2 :
                if self.t * 2 >= self.x [ i ] - self.x [ 0 ] :
                    cnt += ( 1 + ( self.t * 2 - self.x [ i ] + self.x [ 0 ] ) / self.l )
            elif self.w [ 0 ] == 2 and self.w [ i ] == 1 :
                if self.t * 2 >= self.l - self.x [ i ] + self.x [ 0 ] :
                    cnt -= ( 1 + ( self.t * 2 - self.l + self.x [ i ] - self.x [ 0 ] ) / self.l )
        if self.w [ 0 ] == 1 :
            cnt %= self.n
        else :
            cnt = ( ( cnt % self.n ) + self.n ) % self.n
        for i in range ( self.n ) :
            if self.w [ i ] == 1 :
                self.x [ i ] = ( self.x [ i ] + self.t ) % self.l
            else :
                self.x [ i ] = ( ( self.x [ i ] - self.t ) % self.l + self.l ) % self.l
        dist0 = self.x [ 0 ]
        self.x.sort ( )
        index0 = 0
        if self.w [ 0 ] == 1 :
            for i in range ( self.n - 1 , - 1 , - 1 ) :
                if self.x [ i ] == dist0 :
                    index0 = i
                    break
        else :
            for