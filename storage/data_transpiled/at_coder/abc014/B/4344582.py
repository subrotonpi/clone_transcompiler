def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        X = int ( self.X )
        map = [ ]
        for i in range ( N - 1 , 0 , - 1 ) :
            map.append ( _main.get ( i ) )
        bi = "00000000000000000000" + bin ( X )
        bi = bi [ - N : ]
        ans = 0
        for i in bi :
            ans += map [ i ] if i == '1' else 0
        print ( ans )
