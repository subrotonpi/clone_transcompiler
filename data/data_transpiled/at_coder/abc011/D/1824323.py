def import _np
import scipy
import scipy
class Main ( object ) :
    def __init__ ( self ) :
        self.comb = [ [ 1 ] ]
    def __init__ ( self ) :
        self.comb.append ( [ 0 ] * 2000 )
    def run ( self ) :
        sc = scipy.signal.loadmat ( )
        if self.comb [ 0 ] == 1 :
            for i in range ( 0 , len ( self.comb ) ) :
                for j in range ( 0 , i ) :
                    self.comb [ i ] [ j ] = ( self.comb [ i - 1 ] [ j ] + ( self.comb [ i - 1 ] [ j - 1 ] if j > 0 else 0 ) ) * 0.5
    def run ( self ) :
        sc = scipy.signal.loadmat ( )
        N = sc.shape [ 0 ]
        D = sc.shape [ 1 ]
        X , Y = sc.shape [ 0 ]
        X = abs ( X )
        Y = abs ( Y )
        if X % D != 0 or Y % D != 0 :
            print ( 0 )
            return
        X /= D
        Y /= D
        D = 1
        ans = 0
        for i in range ( 0 , N - 2 * i - X - Y ) :
            j = int ( N - X - Y - 2 * i )
            if j % 2 == 1 :
                continue
            j /= 2
            ans += self.comb [ N ] [ int ( X + 2 * i ) ] * self.comb [ int ( X + 2 * i ) ] [ i ] * self.comb [ int ( Y + 2 * j ) ] [ j ]
        print ( ans )
    def tr ( self , * args ) :
        print ( " ".join ( map ( str , args ) ) )
