def import _imports_C
class C :
    def __init__ ( self , A , i ) :
        self.K = i
        self.P = [ A [ i ] for i in range ( 0 , i + 1 ) ]
        self.N = i
        self.M = i
        self.best_array = None
        self.best_score = 0
    def f ( self , A , i ) :
        if i == self.N :
            score = 1
            freq = [ 0 ] * 126
            for set in range ( ( 1 << self.N ) ) :
                product = 1
                for j in range ( self.N ) :
                    if self.bit_set ( set , j ) :
                        product *= A [ j ]
                    freq [ product ] += 1
            for j in range ( self.K ) :
                score *= freq [ self.P [ j ] ]
            if score > self.best_score :
                self.best_score = score
                for j in range ( self.N ) :
                    self.best_array.append ( self.A [ j ] )
        else :
            for d in range ( 2 , self.M + 1 ) :
                A [ i ] = d
                self.f ( A , i + 1 )
    def main ( self ) :
        with open ( self.T , 'r' ) as f :
            self.R , self.N , self.M , self.K = f.read ( )
