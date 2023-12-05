def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = len ( sys.argv )
        r = sys.argv [ 1 ]
        a = b = c = d = f = 0
        for tmp in r :
            if tmp == 'A' : a += 1
            elif tmp == 'B' : b += 1
            elif tmp == 'C' : c += 1
            elif tmp == 'D' : d += 1
            elif tmp == 'F' : f += 1
            else : break
    if f == N :
        print ( 0 )
        return
    print ( float ( 4 * a + 3 * b + 2 * c + d ) / ( a + b + c + d + f ) )
