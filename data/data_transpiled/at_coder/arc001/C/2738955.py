def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.main = Main ( )
        def run ( self ) :
            with open ( self.filename , 'r' ) as f :
                field = [ ]
                for buf in f.read ( 8 ).split ( '' ) :
                    field.append ( buf.split ( '' ) )
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
                if self.is_puttable ( y , x , field ) :
                    if self.dfs ( pos + 1 , nokori - 1 , field ) : return True
            else :
                if self.is_puttable ( y , x , field ) :
                    field [ y ] [ x ] = 'Q'
                    if self.dfs ( pos + 1 , nokori - 1 , field ) : return True
                    field [ y ] [ x ] = '.'
                if self.dfs ( pos + 1 , nokori , field ) : return True
            return False
        def isinfield ( y , x ) :
            return y >= 0 and x >= 0 and y < 8 and x < 8
        def isputtable ( y , x , field ) :
            for vy in [ - 1 , 1 ] :
                for vx in [ - 1 , 1 ] :
                    if vy == 0 and vx == 0 : continue
                    ty = y
                    tx = x
                    while True :
                        ty += vy
                        tx += vx
                        if not self.isinfield ( ty , tx ) : break
                        if field [ ty ] [ vx ] == 'Q' : return False
            return True
    return Main
