def import _main
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
    BASE = '0'
    def __call__ ( self ) :
        sc = _main.sc
        _ , S = sc.partition ( '.' )
        print ( dfs ( S , 0 , 0 ) )
        sc.close ( )
    def dfs ( S , current , pos ) :
        current = current * 10 + int ( S [ pos ] - BASE )
        if pos == len ( S ) - 1 :
            return current
        depth = ( len ( S ) - pos - 2 )
        a = ( current << depth ) + dfs ( S , 0 , pos + 1 )
        b = dfs ( S , current , pos + 1 )
        return a + b
