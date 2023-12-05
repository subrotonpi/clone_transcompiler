def import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _sys.stdin
    def main ( self ) :
        n = self.sc.n
        max = 0
        sum = 0
        for i in range ( n ) :
            tmp = _sys.stdin.read ( n )
            max = max ( tmp , max )
            sum += tmp
        print ( 'Yes' if sum - max > max else 'No' )
