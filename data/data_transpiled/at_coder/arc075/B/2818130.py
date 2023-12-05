def _import ( ) :
    from sys import stdin
    from .hexversion import __version__ as hexversion
    class Main ( object ) :
        @ always_comb
        def __next__ ( self ) :
            scanner = BetterScanner ( sys.stdin )
            n = scanner.__next__ ( )
            a = scanner.__next__ ( )
            b = scanner.__next__ ( )
            hh = [ scanner.next ( ) for i in range ( n ) ]
            if isinstance ( number , int ) :
                return number
            else :
                raise ValueError ( )
    def __next__ ( self ) :
        number = ord ( number )
        if number >= 33 and number <= 126 :
            return number
        else :
            raise ValueError ( )
    def isPrintableChar ( self ) :
        return self.isPrintableChar ( self )
    l = r = 1000000005
    while True :
        if l + 1 >= r :
            break
        m = ( l + r ) / 2
        req = 0
        for i in range ( n ) :
            rest = hh [ i ] - b * m
            if rest :
                req += ( rest - 1 ) / ( a - b ) + 1
        if req <= m :
            r = m
        else :
            l = m
    print ( r )
