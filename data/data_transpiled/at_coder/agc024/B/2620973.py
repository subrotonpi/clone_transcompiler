def import import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
    def __call__ ( self , sc ) :
        self.p = [ ]
        self.q = [ ]
        for i in range ( n ) :
            self.p.append ( sc.randint ( 0 , 1 ) )
            self.q.append ( self.p [ - 1 ] )
        self.max = 0
        cnt = 0
        for i in range ( n - 1 ) :
            cnt += 1
            if self.q [ i ] > self.q [ i + 1 ] :
                self.max = max ( self.max , cnt )
                cnt = 0
        self.max = max ( self.max , cnt + 1 )
        print ( self.n - self.max )
    def main ( self ) :
        with open ( "/proc/" , "r" ) as f :
            return Main ( )
