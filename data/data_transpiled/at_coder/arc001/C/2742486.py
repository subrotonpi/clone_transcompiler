def main ( x ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.dp = [ ]
        def __call__ ( self , * args , ** kwargs ) :
            sc = open ( self.dp [ 0 ] )
            field = [ ]
            for line in sc.readlines ( ) :
                field.append ( line.split ( ) )
            if self.dfs ( 0 , 8 , field ) :
                for i in range ( 8 ) :
                    for j in range ( 8 ) :
                        print ( field [ i ] [ j ] )
                    self.nl ( )
            else :
                self.pln ( "No Answer" )
        def dfs ( self , pos , nokori , field ) :
            if nokori == 0 :
                return True
            if pos == 64 :
                return False
            y = pos // 8
            x = pos % 8
            if field [ y ] [ x ] == "Q" :
                if self.can_put ( y , x , field ) :
                    if self.dfs ( pos + 1 , nokori - 1 , field ) :
                        return True
            else :
                if self.can_put ( y , x , field ) :
                    field [ y ] [ x ] = "Q"
                    if self.dfs ( pos + 1 , nokori - 1 , field ) :
                        return True
                    field [ y ] [ x ] = "."
                if self.dfs ( pos + 1 , nokori , field ) :
                    return True
            return False
        def is_in ( self , y , x ) :
            return y in self.dp
        def can_put ( self , y , x , field ) :
            for dy in - 1 , 1 :
                for dx in - 1 , 1 :
                    if dy == 0 and dx == 0 :
                        continue
                    ty = y
                    tx = x
                    while True :
                        ty += dy
                        tx += dx
                        if not self.is_in ( ty , tx ) :
                            break
                        if self.is_in ( ty , tx ) :
                            break
            return True
    return Main
