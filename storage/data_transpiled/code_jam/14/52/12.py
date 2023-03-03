def _ _ main _ _ ( ) : return
def update ( dp , i , j , val ) : dp [ i ] [ j ] = max ( dp [ i ] [ j ] , val )
def main ( ) : return int ( next ( ) )
def main ( ) : return int ( next ( ) )
def main ( ) : return float ( next ( ) )
def main ( ) : return long ( next ( ) )
def task_count ( ) :
    for task_index in range ( 1 , task_count + 1 ) :
        P , Q , N = next ( )
        life = [ next ( ) for _ in range ( N ) ]
        gold = [ next ( ) for _ in range ( N ) ]
        total = N * 10 + 10
        dp = [ [ ] for _ in range ( N + 1 ) ]
        for arr in dp :
            [ arr ] = - 1
        dp [ 0 ] [ 1 ] = 0
        for i in range ( N ) :
            for j in range ( total ) :
                if dp [ i ] [ j ] == - 1 :
                    continue
                for k in range ( 20 ) :
                    left = life [ i ] - k * Q
                    if left <= 0 :
                        update ( dp , i + 1 , j + k , dp [ i ] [ j ] )
                        break
                    require = left / P + ( left % P == 0 )
                    if j + k >= require :
                        update ( dp , i + 1 , j + k - require , dp [ i ] [ j ] + gold [ i ] )
        res = 0
        for i in range ( total ) :
            res = max ( res , dp [ N ] [ i ] )
        print ( 'Case #%d: %d' % ( task_index , res ) )
class FastScanner ( object ) :
    def __init__ ( self ) :
        self.stdin = open ( 'input' )
        self.tokens = [ ]
        self.tokens = [ ]
        self.tokens = [ ]
        self.tokens = [ ]
        self.tokens = [ ]
        self.tokens = [ ]
        self.tokens = [ ]
        self.tokens = [ ]
        self.tokens = [ ]
        self.tokens = [ ]
return main
