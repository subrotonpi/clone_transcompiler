def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        w = sc.get ( 'w' )
        h = sc.get ( 'h' )
        n = sc.get ( 'n' )
        hidarisita = ( 0 , 0 )
        migiue = ( w , h )
        for i in range ( n ) :
            x = sc.get ( 'x' )
            y = sc.get ( 'y' )
            a = sc.get ( 'a' )
            if a == 1 :
                hidarisita [ 0 ] = max ( hidarisita [ 0 ] , x )
            elif a == 2 :
                migiue [ 0 ] = min ( migiue [ 0 ] , x )
            elif a == 3 :
                hidarisita [ 1 ] = max ( hidarisita [ 1 ] , y )
            elif a == 4 :
                migiue [ 1 ] = min ( migiue [ 1 ] , y )
        print ( max ( 0 , migiue [ 0 ] - hidarisita [ 0 ] ) * max ( 0 , migiue [ 1 ] - hidarisita [ 1 ] ) )
class Point ( object ) :
    def __init__ ( self , x , y ) :
        self.x = x
        self.y = y
