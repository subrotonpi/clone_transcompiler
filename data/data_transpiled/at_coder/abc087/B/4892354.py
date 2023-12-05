def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.ROW = 3
    def VALUES ( self ) :
        self.ROWS = self.ROW
    def main ( self ) :
        sc = sys.stdin
        coins = [ ]
        for i in range ( self.ROWS ) :
            coins.append ( sc.randint ( 0 , 100 ) )
        x = sc.randint ( 0 , 100 )
        cnt = 0
        for n500 in range ( 0 , coins [ 0 ] ) :
            if n500 * 500 > x :
                continue
            for n100 in range ( 0 , coins [ 1 ] ) :
                if n100 * 100 > x :
                    continue
                for n50 in range ( 0 , coins [ 2 ] ) :
                    if n50 * 50 > x :
                        continue
                    sum = ( n500 * 500 ) + ( n100 * 100 ) + ( n50 * 50 )
                    if sum == x :
                        cnt += 1
        print ( cnt )
