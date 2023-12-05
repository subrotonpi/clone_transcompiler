def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.m = int ( self.m )
        self.R = int ( self.R )
        self.used = [ False ] * R
        self.ans = sum ( self.ans )
        self.t = [ ]
        self.r1 = [ ]
        for i in range ( self.R ) :
            self.r1.append ( self.r )
        for i in range ( 1 , self.n + 1 ) :
            for j in range ( 1 , self.n + 1 ) :
                if i != j :
                    self.t [ i ] [ j ] = int ( self.ans / 10 )
        for i in range ( self.m ) :
            a , b , c = self.r1 [ i ] , self.r1 [ i ] , self.r1 [ i ]
            t [ a ] [ b ] = c
            t [ b ] [ a ] = c
        for i in range ( 1 , self.n + 1 ) :
            for j in range ( 1 , self.n + 1 ) :
                for k in range ( 1 , self.n + 1 ) :
                    t [ j ] [ k ] = min ( t [ j ] [ k ] , t [ j ] [ i ] + t [ i ] [ k ] )
        self.dfs ( 0 , - 1 , 0 )
        print ( self.ans )
    def dfs ( self , count , last , sum ) :
        if count == self.R :
            self.ans = min ( self.ans , sum )
            return
        for i in range ( self.R ) :
            if not self.used [ i ] :
                self.used [ i ] = True
                if last == - 1 :
                    self.dfs ( self.count + 1 , i , 0 )
                else :
                    self.dfs ( self.count + 1 , i , sum + t [ self.r1 [ last ] ] [ r1 [ i ] ] )
                self.used [ i ] = False
return Main
