def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.G = 0
        self.D = 0
        self.p = [ ]
        self.c = [ ]
        self.used = [ ]
        self.ans = 1000000000
    def main ( self ) :
        sc = _main.raw_input
        ss = sc.split ( )
        dp = [ [ ] for _ in range ( len ( ss ) + 1 ) ]
        dp [ 0 ].append ( 0l )
        mod = 1000000007
        moziretusum = 1l
        for i in range ( len ( ss ) ) :
            if ss [ i ] == 'A' :
                dp [ i + 1 ].append ( dp [ i ] [ 0 ] % mod )
                dp [ i + 1 ].append ( dp [ i ] [ 1 ] % mod )
                dp [ i + 1 ].append ( dp [ i ] [ 2 ] % mod )
                dp [ i + 1 ].append ( dp [ i ] [ 0 ] % mod )
            elif ss [ i ] == 'B' :
                dp [ i + 1 ].append ( dp [ i ] [ 0 ] % mod )
                dp [ i + 1 ].append ( dp [ i ] [ 1 ] % mod )
                dp [ i + 1 ].append ( dp [ i ] [ 2 ] % mod )
                moziretusum *= 3l
                moziretusum %= mod
        if ss [ i ] == '?' :
            dp [ i + 1 ].append ( 3 * dp [ i ] [ 0 ] % mod )
            dp [ i + 1 ].append ( 3 * dp [ i ] [ 1 ] % mod )
            dp [ i + 1 ].append ( dp [ i ] [ 0 ] % mod )
            dp [ i + 1 ].append ( dp [ i ] [ 2 ] % mod )
            dp [ i + 2 ].append ( dp [ i ] [ 1 ] % mod )
