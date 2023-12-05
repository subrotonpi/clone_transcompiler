def import import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.dp = [ ]
    def run ( self ) :
        sc = _main ( )
        field = [ ]
        for line in sc.readlines ( ) :
            field.append ( line.split ( '' ) )
        if self.dfs ( 0 , 8 , field ) :
            for i in range ( 8 ) :
                for j in range ( 8 ) :
                    print ( field [ i ] [ j ] , end = '' )
                print ( )
        else :
            print ( 'No Answer' )
    def dfs ( pos , nokori , field ) :
        if nokori == 0 : return True
        if pos == 64 : return False
        y , x = pos // 8 , pos % 8
        if field [ y ] [ x ] == 'Q' :
            if self.can_put ( y , x , field ) :
                if self.dfs ( pos + 1 , nokori - 1 , field ) : return True
        else :
            if self.can_put ( y , x , field ) :
                field [ y ] [ x ] = 'Q'
                if self.dfs ( pos + 1 , nokori - 1 , field ) : return True
                field [ y ] [ x ] = '.'
            if self.dfs ( pos + 1 , nokori , field ) : return True
        return False
    def is_in_field ( y , x ) :
        return y >= 0 and y < 8 and x >= 0 and x < 8
    def can_put ( y , x , field ) :
        for dy in [ - 1 , 1 ] :
            for dx in [ - 1 , 1 ] :
                if dy == 0 and dx == 0 : continue
                ty = y
                tx = x
                while True :
                    ty += dy
                    tx += dx
                    if not self.is_in_field ( ty , tx ) : break
                    if self.is_in_field ( ty , tx ) : return False
        return True
return Main
