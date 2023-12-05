def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.n = self.sc.__next__ ( )
            self.s = [ ]
            if self.n == 0 :
                print ( 0 )
                return
            while self.n != 0 :
                if self.n % - 2 == 0 :
                    self.s.append ( '0' )
                    self.n /= - 2
                else :
                    self.s.append ( '1' )
                    if self.n < 0 :
                        self.n /= - 2
                        self.n += 1
                    else :
                        self.n /= - 2
    xx = ''.join ( reversed ( list ( Main ( ) ) ) )
    print ( xx )
class Pair ( object ) :
    def __init__ ( self ) :
        self.from = 0
        self.end = 0
        self.num = 0
        self.bango = 0
    def __eq__ ( self , other ) :
        otherpair = other.__eq__ ( self )
        return self.from - otherpair.from
