def main ( ) :
    import sys
    def run ( ) :
        cin = sys.stdin
        board = [ ]
        for st in cin.read ( ).split ( ) :
            for i in range ( 8 ) :
                board.append ( st [ i ] )
        if dfs ( 0 , 8 , board ) :
            for i in range ( 8 ) :
                for j in range ( 8 ) :
                    print ( board [ i ] [ j ] , end = ' ' )
                print ( )
        else :
            print ( 'No Answer' )
    def dfs ( pos , nokori , board ) :
        if nokori == 0 : return True
        if pos == 64 : return False
        y , x = pos // 8 , pos % 8
        if is_puttable ( y , x , board ) :
            if board [ y ] [ x ] == 'Q' :
                return dfs ( pos + 1 , nokori - 1 , board )
            else :
                board [ y ] [ x ] = 'Q'
                if dfs ( pos + 1 , nokori - 1 , board ) : return True
                board [ y ] [ x ] = '.'
        return dfs ( pos + 1 , nokori , board )
    def ok ( y , x ) :
        return y >= 0 and x >= 0 and y < 8 and x < 8
    def is_puttable ( y , x , board ) :
        for vy in [ - 1 , 1 ] :
            for vx in [ - 1 , 1 ] :
                if vy == 0 and vx == 0 : continue
                ty , tx = y , x
                while True :
                    ty += vy
                    tx += vx
                    if not ok ( ty , tx ) : break
                    if board [ ty ] [ tx ] == 'Q' : return False
        return True
    return False
return run ( )
