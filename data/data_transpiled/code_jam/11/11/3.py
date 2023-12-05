def import import sys , StringIO , sys , tty , text
class A ( object ) :
    def __init__ ( self ) :
        self.stdout = sys.stdout
        self.stderr = sys.stderr
    def raw_input ( self ) :
        self.stdout = sys.stdout
        self.stderr = sys.stderr
    def fmt ( self ) :
        return '0.000000000'
    def main ( self ) :
        try :
            TCase = select.select ( [ ] , [ ] , [ ] ) [ 0 ]
            for cc in range ( 1 , TCase + 1 ) :
                n , p , q = select.select ( [ ] , [ ] , [ ] )
                print ( 'Case #%d: %s' % ( cc , 'Possible' if poss ( self ) else 'Broken' ) )
        except :
            pass
    def poss ( self ) :
        for D in range ( 1 , n + 1 ) :
            if ( p * D ) % 100 != 0 :
                continue
            W = p * D // 100
            c = 100 * W - q * D
            for DD in range ( 0 , 1000000 ) :
                if ( q * DD - c ) % 100 != 0 :
                    continue
                WW = ( q * DD - c ) // 100
                if 0 <= WW <= DD :
                    return True
        return False
    def main ( self ) :
        start_time = time.time ( )
        ( A ( ) , ) = sys.stdin.read ( )
        end_time = time.time ( )
        ms = end_time - start_time
        sec , ms = ms // 1000 , ms % 1000
        min , sec = sec // 60 , sec % 60
        print ( 'Time Spent: %d minute(s) %d second(s) %d (ms)' % ( min , sec , ms ) , file = sys.stderr )
    def iInt ( self ) :
        return sys.stdin.read ( )
    def iLong ( self ) :
        return sys.stdin.read ( )
    def iToken ( self ) :
        return sys.stdin.read ( )
    def iLine ( self ) :
        return sys.stdout.readline ( )
