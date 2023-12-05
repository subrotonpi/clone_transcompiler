def import import _sys , os , sys
class Main ( object ) :
    def __init__ ( self ) :
        self.frac = [ 0 ] * 100020
    def ZYY ( self ) :
        self.ZYY = 1000000007
        return 0
    def main ( ) :
        with open ( sys.argv [ 1 ] ) as f :
            x = int ( f.read ( ) )
            y = int ( f.read ( ) )
    if abs ( x - y ) > 1 :
        print ( '0' )
        return
    frac.append ( 1 )
    for i in range ( 1 , 100000 ) :
        frac [ i ] = frac [ i - 1 ] * i % ZYY
    ans = frac [ x ] * frac [ y ] % ZYY
    if x == y :
        ans = ans * 2 % ZYY
    print ( ans )
    return
