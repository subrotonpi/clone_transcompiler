def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.dp = [ ]
    SIZE = 2000
    R = _main.getint ( 'R' )
    G = _main.getint ( 'G' )
    B = _main.getint ( 'B' )
    self.dp = [ [ - 1 ] for i in range ( SIZE ) ]
    print ( _main.dfs ( 0 , R + G + B ) )
    def dfs ( pos , num ) :
        if num == 0 :
            return 0
        if self.dp [ pos ] [ num ] >= 0 :
            return self.dp [ pos ] [ num ]
        move = 0
        if num > G + B :
            move = abs ( SIZE / 2 - 100 - pos )
        elif num > B :
            move = abs ( SIZE / 2 - pos )
        elif num > 0 :
            move = abs ( SIZE / 2 + 100 - pos )
        if pos >= SIZE - num :
            self.dp [ pos ] [ num ] = _dfs ( pos + 1 , num - 1 ) + move
        else :
            self.dp [ pos ] [ num ] = min ( _dfs ( pos + 1 , num ) , _dfs ( pos + 1 , num - 1 ) + move )
        return self.dp [ pos ] [ num ]
return Main
