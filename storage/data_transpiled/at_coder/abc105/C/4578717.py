def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.stdin.close ( )
    def run ( self ) :
        if self.n == 0 :
            print ( 0 )
            return
        rem = [ ]
        for i in range ( 40 ) :
            rem.append ( n % - 2 )
            n /= - 2
            if rem [ i ] == - 1 :
                n += 1
                rem.append ( 1 )
        rem = rem [ : : - 1 ]
        for i in range ( 0 , len ( rem ) - 1 , - 1 ) :
            if rem [ i ] == 1 :
                break
        for i in range ( 0 , - 1 , - 1 ) :
            sys.stdout.write ( rem [ i ] )
        sys.stdout.write ( "\n" )
