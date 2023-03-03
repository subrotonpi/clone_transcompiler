def import _main
class Main ( object ) :
    MOD = 1000000007
    def __init__ ( self ) :
        self.n = int ( self.n )
    def __call__ ( self , * args ) :
        arr = [ ]
        for i in range ( self.n ) :
            arr.append ( _main ( self.n , i ) )
    arr.sort ( )
    idxes = [ - 1 ] * n
    idx = 1
    for i in range ( n ) :
        while arr [ idx ] < arr [ i ] * 2 :
            idx += 1
            if idx >= n :
                break
        if idx >= n :
            break
        idxes.append ( idx )
    third = [ ]
    for i in range ( 1 , n - 2 ) :
        if idxes [ n - 1 - i ] != - 1 :
            third.append ( ( third [ n - i ] + n - idxes [ n - 1 - i ] ) % MOD )
    second = [ ]
    for i in range ( 2 , n - 1 ) :
        if idxes [ n - 1 - i ] != - 1 :
            second.append ( ( second [ n - i ] + third [ idxes [ n - 1 - i ] ] ) % MOD )
    sum = 0
    for i in range ( 3 , n ) :
        if idxes [ n - 1 - i ] != - 1 :
            sum += second [ idxes [ n - 1 - i ] ]
            sum %= MOD
    print ( sum )
