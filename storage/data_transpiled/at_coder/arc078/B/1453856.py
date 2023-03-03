def _import ( ) :
    from os import popen
    from io import StringIO
    def __init__ ( self , input ) :
        self.stream = input
        try :
            n = next ( self.stream )
        except StopIteration :
            n = len ( input )
        A = [ [ int ( i ) , int ( i ) ] for i in input ]
        print ( self.solve ( n , A ) )
    def solve ( n , A ) :
        graph = self.construct_graph ( n , A )
        fenec_dist = [ - 1 ] * ( n + 1 )
        snuke_dist = [ - 1 ] * ( n + 1 )
        self.dfs ( graph , fenec_dist , 1 , 0 )
        self.dfs ( graph , snuke_dist , n , 0 )
        fscore = [ 1 ] * ( n + 1 )
        for i in range ( 1 , n + 1 ) :
            if fenec_dist [ i ] <= snuke_dist [ i ] :
                fscore [ i ] = 1
        return [ 'Fennec' if i > n / 2 else 'Snuke' for i in fscore ]
    def dfs ( graph , dist , start , depth ) :
        if dist [ start ] > - 1 :
            return
        dist [ start ] = depth
        for i in graph [ start ] :
            self.dfs ( graph , dist , i , depth + 1 )
    def construct_graph ( n , A ) :
        graph = { }
        for i in range ( 0 , n ) :
            graph [ i ] = [ ]
        for i in range ( 0 , len ( A ) ) :
            graph [ i ].append ( i )
        for i in range ( 0 , len ( A ) ) :
            graph [ i ].append ( i )
    return graph
