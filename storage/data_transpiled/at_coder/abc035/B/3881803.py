def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.S = _main ( )
        self.T = _main ( )
    x = y = q = 0
    for char in S :
        if char == 'L' :
            x -= 1
        elif char == 'R' :
            x += 1
        elif char == 'U' :
            y += 1
        elif char == 'D' :
            y -= 1
        else :
            q += 1
    ans = abs ( x ) + abs ( y )
    _max = ans + q
    _min = ans - q
    if ans < q :
        d = q - ans
        if d % 2 == 1 : _min = 1
        else : _min = 0
    print ( _max if T == 1 else _min )
