def import _main
class Main ( object ) :
    def __init__ ( self ) :
        Scanner = _main
        m = scanner.scanner
        n = scanner.scanner
        a = scanner.scanner
        b = scanner.scanner
        c = [ ]
        if n * m < 2 * ( a + b ) :
            print ( "NO" )
            return
        if n % 2 :
            v = min ( b , m // 2 )
            b -= v
            for i in range ( v ) :
                c [ n - 1 ] [ 2 * i ] = '^'
                c [ n - 1 ] [ 2 * i + 1 ] = 'v'
        if m % 2 :
            r = min ( a , n // 2 )
            a -= r
            for i in range ( r ) :
                c [ 2 * i ] [ m - 1 ] = '<'
                c [ 2 * i + 1 ] [ m - 1 ] = '>'
        ca = 0
        for i in range ( n // 2 ) :
            for j in range ( m // 2 ) :
                if ca == a :
                    break
                if a - ca != 1 :
                    self.putAS ( 2 * i , 2 * j )
                    ca += 2
                else :
                    if b % 2 :
                        self.putAS ( 2 * i , 2 * j )
                    ca += 1
            if ca == a :
                break
        cb = 0
        ca = 0
        for i in range ( n // 2 ) :
            for j in range ( m // 2 ) :
                if ca < a - 1 :
                    ca += 2
                    continue
                if cb == b :
                    if a - ca == 1 :
                        self.putAS ( 2 * i , 2 * j )
                        break
                    if b - cb != 1 :
                        self.putBS ( 2 * i , 2 * j )
                        cb += 2
                    else :
                        self.putBs ( 2 * i , 2 * j )
                        cb += 1
return Main
