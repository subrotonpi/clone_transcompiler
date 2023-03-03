def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.ascii_codes = [ ]
    def __init__ ( self ) :
        self.c = [ 0 ] * 26
    def Mod ( self ) :
        self.Mod = 1_000_000_007
    def main ( self ) :
        sc = sys.stdin
        int ( sc.readline ( ) )
        S = sc.readline ( )
        sc.close ( )
        try :
            ascii_codes = S.encode ( 'ascii' )
        except :
            pass
        for code in ascii_codes :
            self.c [ code - 97 ] += 1
    def solve ( self ) :
        res = 1
        for i in range ( 26 ) :
            res *= ( self.c [ i ] + 1 )
            while res > Mod :
                res -= Mod
        res -= 1
        print ( res )
