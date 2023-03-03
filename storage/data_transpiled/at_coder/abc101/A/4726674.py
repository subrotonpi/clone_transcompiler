def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
        self.str = _main ( )
    def __str__ ( self ) :
        return self.str
    ans = 0
    for char in str :
        if char == '+' :
            ans += 1
        else :
            ans -= 1
    print ( ans )
