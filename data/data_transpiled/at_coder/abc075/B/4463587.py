def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
    def main ( self ) :
        h , w = self.sc.split ( ' ' )
        board = [ ]
        for s in self.sc :
            for j in range ( w ) :
                board.append ( s [ j ] )
        for i in range ( h ) :
            for j in range ( w ) :
                if board [ i ] [ j ] == '#' :
                    continue
                count = '0'
                for k in [ - 1 , 1 ] :
                    if i == 0 and k == - 1 or i == h - 1 and k == 1 :
                        continue
                    for l in [ - 1 , 1 ] :
                        if j == 0 and l == - 1 or j == w - 1 and l == 1 or k == 0 and l == 0 :
                            continue
                        if board [ i + k ] [ j + l ] == '#' :
                            count += 1
                board [ i ] [ j ] = count
    lines = [ ]
    for i in range ( h ) :
        for j in range ( w ) :
            lines.append ( board [ i ] [ j ] )
        print ( '\n'.join ( lines ) )
