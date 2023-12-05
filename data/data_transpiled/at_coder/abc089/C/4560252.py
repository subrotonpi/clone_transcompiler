def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.argv.count ( 'N' )
    def __init__ ( self ) :
        self.count = [ 0 ] * 5
        symbols = [ 'M' , 'A' , 'R' , 'C' , 'H' ]
        for name in self.name :
            index = symbols.find ( name.decode ( 'utf-8' ) )
            if index != - 1 :
                count [ index ] = count [ index ] + 1
    ans = 0
    for i in range ( len ( symbols ) ) :
        for j in range ( i + 1 , len ( symbols ) ) :
            for k in range ( j + 1 , len ( symbols ) ) :
                ans += count [ i ] * count [ j ] * count [ k ]
    print ( ans )
