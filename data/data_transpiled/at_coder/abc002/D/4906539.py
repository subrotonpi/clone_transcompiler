def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.M = sys.stdin.read ( )
        self.con = [ [ False ] * N ]
        for i in range ( self.M ) :
            x = self.N - 1
            y = self.M - 1
            self.con [ x ] [ y ] = self.con [ y ] [ x ] = True
    answer = 0
    label = 0
    for i in range ( ( 1 , N ) ) :
        count = sum ( i )
        if answer >= count :
            continue
        for j in range ( self.N ) :
            for n in range ( self.N + 1 ) :
                if ( ( ( i >> j ) & 1 ) == 1 and ( ( i >> n ) & 1 ) == 1 and not self.con [ j ] [ n ] ) :
                    continue label
        answer = count
    print ( answer )
