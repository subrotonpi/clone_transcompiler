def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.s = sys.stdin.readline ( )
        self.s = self.s.decode ( 'utf-8' )
        self.abc = 'qwertyuiopasdfghjklzxcvbnm'
    def __init__ ( self ) :
        self.d = { }
        for i in range ( self.n ) :
            if str ( self.s [ i ] ) in self.d :
                self.d [ str ( self.s [ i ] ) ] = self.d [ str ( self.s [ i ] ) ] + 1
            else :
                self.d [ str ( self.s [ i ] ) ] = 1
    ans = 1
    mod = 1000000007
    for i in range ( 26 ) :
        get = 1
        if str ( abc [ i ] ) in self.d :
            get += int ( self.d [ str ( abc [ i ] ) ] )
        ans *= get
        ans %= mod
    ans -= 1
    print ( ans )
