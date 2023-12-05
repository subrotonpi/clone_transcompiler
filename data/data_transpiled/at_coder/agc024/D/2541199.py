def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.solve ( )
        def solve ( self ) :
            cin = sys.stdin
            N = cin.randint ( 0 , 1 )
            rank = [ ]
            mat = [ [ 1 ] * N ]
            for i in range ( N - 1 ) :
                L = cin.randint ( 0 , 1 )
                R = cin.randint ( 0 , 1 )
                rank [ L ] += 1
                rank [ R ] += 1
                mat [ L ] [ R ] = mat [ L ] [ R ] = 1
        def score ( self , parent , mat , N , level , max_rank ) :
            if self.cur == self.parent or self.parent :
                continue
            if self.mat [ self.cur ] [ self.N ] == 1 :
                rank [ L ] += 1
                score ( self , self.mat [ self.N ] [ self.N ] , level , max_rank )
        self.max_rank = max ( max_rank [ level ] , rank )
    def score ( self , parent , mat , N , level , max_rank ) :
        for i in range ( N ) :
            if self.mat [ self.N ] [ i ] == self.N and self.mat [ self.N ] [ i ] == self.N :
                if self.mat [ self.N ] [ i ] == self.N :
                    ans *= self.mat [ self.N ] [ i ]
            else :
                ans *= self.mat [ self.N ] [ i ]
    S = - 1
    T = - 1
    max_d = 0
    for i in range ( N ) :
        if self.rank [ i ] != 1 :
            continue
        for j in range ( i + 1 ) :
            if self.rank [ j ] != 1 :
                continue
            if self.max_d < self.mat [ self.N ] [ j ] :
                max_d = self.max_d
                S = i
                T = j
    if N == 2 :
        print ( '1 2' )
        cin.close ( )
        return
    if max_d % 2 == 0 :
        C = - 1