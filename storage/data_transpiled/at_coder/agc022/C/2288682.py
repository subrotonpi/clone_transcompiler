def _import ( ) :
    import sys
    import random
    import time
    import sys
    class Main ( object ) :
        def __init__ ( self , a , b ) :
            self.a = a
            self.b = b
            self.N = self.N
        def getMaxk ( self ) :
            res = - 1
            for i in range ( self.N ) :
                for j in range ( 1 , self.a [ i ] ) :
                    if self.a [ i ] == self.b [ i ] :
                        continue
                    if self.a [ i ] % j == self.b [ i ] or self.a [ i ] % j > self.b [ i ] * 2 :
                        res = max ( res , j )
                        break
            return res
        def chk ( self ) :
            for i in range ( self.N ) :
                if self.a [ i ] != self.b [ i ] :
                    return False
            return True
    class Edge ( object ) :
        def __init__ ( self , to , cost ) :
            self.to = to
            self.cost = cost
    def get_max_cost ( self , s , t , res ) :
        if s == t :
            return res
        c = 100
        if s <= 2 * t :
            return 100
        for e in self.edge_list [ s ] :
            c = min ( c , get_max_cost ( e.to , t , max ( e.cost , res ) ) )
        return c
    def main ( ) :
        with open ( '/' ) as f :
            N = f.readline ( ).strip ( )
    a = [ ]
    b = [ ]
    for i in range ( N ) :
        a.append ( i )
    for i in range ( N ) :
        b.append ( i )
    ans = 0
    edge_list = [ ]
    for i in range ( 51 ) :
        for j in range ( 1 , i ) :
            edge_list [ i ] = [ ( i % j , j ) ]
    while True :
        k = max ( k , max ( a [ i ] , 0 ) )
        ans += 1
    return ans
