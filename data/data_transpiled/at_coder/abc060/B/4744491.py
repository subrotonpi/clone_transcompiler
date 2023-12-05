def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.k = 1
        self.ans = 'NO'
    def main ( self ) :
        sc = _main ( )
        a = sc.__next__ ( )
        b = sc.__next__ ( )
        c = sc.__next__ ( )
        for i in range ( 1 , b + 1 ) :
            if a * i % b == c :
                ans = 'YES'
        print ( ans )
