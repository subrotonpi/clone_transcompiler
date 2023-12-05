def import _input
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.K = 0
        self.S = ''
    def input ( self ) :
        with open ( self.N ) as f :
            self.K = f.read ( )
        self.S = f.read ( )
    def main ( self ) :
        self.input ( )
    map = { }
    s = [ ]
    arr = [ 0 ] * ( N - K + 1 )
    for i in range ( 0 , N - K + 1 ) :
        if i == 0 :
            for j in range ( N ) :
                arr [ S [ j ] - 'a' ] += 1
        else :
            arr [ S [ i - 1 ] - 'a' ] -= 1
            arr [ S [ i + K - 1 ] - 'a' ] += 1
        s.append ( " ".join ( arr ) )
        if s [ i ] in map :
            map [ s [ i ] ] = max ( map [ s [ i ] ] , i )
        else :
            map [ s [ i ] ] = i
    for i in range ( 0 , N - K + 1 ) :
        if map [ s [ i ] ] - i >= K :
            print ( "YES" )
            return
    print ( "NO" )
