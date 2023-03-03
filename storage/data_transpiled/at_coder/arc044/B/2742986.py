def _import ( ) :
    from ..utils import is_printable , read_bytes
    MOD = 1000000007
    @ BetterScanner
    def read ( ) :
        scanner = _import BetterScanner
        n = scanner.read ( )
        aa = [ ]
        nums = [ ]
        for i in range ( n ) :
            aa.append ( scanner.read ( ) )
        return ''.join ( aa )
    def read ( ) :
        if hasNext ( ) :
            number = False
            if codePoint == '-' :
                minus = True
                codePoint = read ( )
            if codePoint in [ '0' , '9' ] :
                while codePoint in [ '-' , '-' ] :
                    number *= 10
                elif codePoint < 0 or not is_printable ( codePoint ) :
                    return - number
                else :
                    raise ValueError ( )
            codePoint = read ( )
            if codePoint in [ 33 , 126 ] :
                return ord ( codePoint )
        else :
            raise StopIteration ( )
    def read ( ) :
        number = read ( )
        if number >= 0 and number <= 126 :
            return number
        else :
            raise ValueError ( )
    if aa [ 0 ] != 0 :
        print ( 0 )
        return
    res = 1
    for i in range ( 1 , n ) :
        if nums [ i ] > 0 :
            res *= pow ( pow ( 2 , nums [ i - 1 ] ) - 1 , nums [ i ] )
            res %= MOD
            res *= pow ( 2 , ( nums [ i ] * ( nums [ i ] - 1 ) ) // 2 )
            res %= MOD
    print ( res )
    def div ( a , b ) :
        return a * pow ( b , MOD - 2 ) % MOD
    def pow ( a , b ) :
        if b == 0 :
            return 1
        elif b % 2 == 0 :
            d = pow ( a , b // 2 )
            return ( d * d ) % MOD
        else :
            d = pow ( a , b - 1 )
            return ( a * d ) % MOD
    def read ( ) :
        while is_printable ( ) and not is_printable ( ) :
            pointer += 1
    return read
