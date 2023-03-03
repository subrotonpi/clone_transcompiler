def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self._exec = sys.stdin
        def solve ( n , pd , pg ) :
            max = min ( n , 100 )
            base = 10000
            all = 100 * base
            win = pg * base
            for i in range ( 1 , max + 1 ) :
                w = i * pd
                if w % 100 != 0 :
                    continue
                w /= 100
                m = all - i
                c = win - w
                if c < 0 or c > m :
                    continue
                return True
            return False
        def solve ( n , pd , pg ) :
            with open ( 'input.txt' , 'r' ) as cin :
                t = cin.read ( )
                for i in range ( 1 , t + 1 ) :
                    n , pd , pg = cin.read ( )
                    print ( 'Case #%d: ' % i , end = '' )
                    print ( 'Possible' if solve ( n , pd , pg ) else 'Broken' )
    return Main ( )
