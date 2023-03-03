def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.data = [ ]
    def main ( self ) :
        with open ( self.data [ 0 ] ) as sc :
            n = sc.read ( )
        ans = 100000000
        for i in range ( 1 , n + 1 ) :
            j = n // i
            num = n - i * j
            ans = min ( ans , num + abs ( i - j ) )
        print ( ans )
class Pair ( object ) :
    from operator import itemgetter
    def __init__ ( self , other ) :
        self.from other import itemgetter
        self.end = itemgetter ( 0 )
    def end ( self ) :
        otherpair = self.other
        return self.end - otherpair.end
