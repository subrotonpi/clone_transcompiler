def import sys , flag
class Main ( object ) :
    def __init__ ( self ) :
        self.count = 0
    def __init__ ( self ) :
        self.count = 0
    def main ( self ) :
        self.count = 0
    R = sys.stdin.read ( )
    C = sys.stdin.read ( )
    K = sys.stdin.read ( )
    s = [ ]
    field = [ ]
    for i in range ( R ) :
        s.append ( self.next ( ) )
    for i in range ( R ) :
        for j in range ( C ) :
            field [ i ] [ j ] = s [ i ] [ j ]
    up = [ ]
    down = [ ]
    for j in range ( C ) :
        if field [ 0 ] [ j ] == 'o' :
            up.append ( 1 )
    for j in range ( C ) :
        if field [ R - 1 ] [ j ] == 'o' :
            down.append ( 1 )
    for i in range ( 1 , R ) :
        for j in range ( C ) :
            if field [ i ] [ j ] == 'o' :
                up [ i ] [ j ] = up [ i - 1 ] [ j ] + 1
    for i in range ( R - 2 , - 1 , - 1 ) :
        for j in range ( C ) :
            if field [ i ] [ j ] == 'o' :
                down [ i ] [ j ] = down [ i + 1 ] [ j ] + 1
    count = 0
    for x in range ( K - 1 , R - K + 1 ) :
        for y in range ( K - 1 , C - K + 1 ) :
            flag = True
            for z in range ( y - ( K - 1 ) , y + ( K - 1 ) + 1 ) :
                if up [ x ] [ z ] <= K - 1 - abs ( y - z ) :
                    flag = False
                    break
            if flag :
                self.count += 1
