def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = len ( _main.args )
        self.K = len ( _main.args )
        a = [ _main.args [ i ] for i in range ( self.K ) ]
        for i in range ( self.N ) :
            val = str ( i )
            flag = True
            for j in range ( self.K ) :
                if val in a [ j ] :
                    flag = False
            if flag :
                print ( i )
                return
