def _import ( ) :
    import sys
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            self.A , self.B , self.C , self.N = random.randint ( 0 , 3 )
            self.llist = [ ]
            for i in range ( self.N ) :
                self.llist.append ( random.randint ( 0 , 3 ) )
    print ( dfs ( 0 , 0 , 0 , 0 ) )
    def dfs ( n , a , b , c ) :
        if n == self.N :
            return ( abs ( A - a ) + abs ( B - b ) + abs ( C - c ) - 30 if min ( min ( a , b ) , c ) > 0 else 9999999 )
        mp0 = dfs ( n + 1 , a , b , c )
        mp1 = dfs ( n + 1 , a + llist [ n ] , b , c ) + 10
        mp2 = dfs ( n + 1 , a , b + llist [ n ] , c ) + 10
        mp3 = dfs ( n + 1 , a , b , c + llist [ n ] ) + 10
        return min ( min ( mp0 , mp1 ) , min ( mp2 , mp3 ) )
