def _import ( ) :
    from collections import deque
    from os import urandom
    class Main ( object ) :
        def __init__ ( self ) :
            self.R = int ( sys.stdin.read ( ) )
            self.C = int ( sys.stdin.read ( ) )
            self.sx = int ( sys.stdin.read ( ) ) - 1
            self.sy = int ( sys.stdin.read ( ) ) - 1
            self.gx = int ( sys.stdin.read ( ) ) - 1
            self.gy = int ( sys.stdin.read ( ) ) - 1
    board = [ ]
    for line in urandom ( ).split ( '' ) :
        board.append ( line.split ( '' ) )
    ans = _search_route ( sx , sy , gx , gy , board )
    print ( ans )
    def search_route ( self , sx , sy , gx , gy , board ) :
        p = deque ( [ ( sx , sy ) ] )
        moves = 0
        board [ sx ] [ sy ] = '0'
        dx = [ - 1 , 1 , 0 , 0 ]
        dy = [ 0 , 0 , - 1 , 1 ]
        s , i , j = board [ h - 1 ] , board [ w - 1 ]
        while True :
            s = len ( p )
            for k in range ( s ) :
                i = p.popleft ( ) [ 0 ]
                j = p.popleft ( ) [ 1 ]
                for a in range ( 4 ) :
                    if i + dx [ a ] < 0 or h <= i + dx [ a ] :
                        continue
                    if j + dy [ a ] < 0 or w <= j + dy [ a ] :
                        continue
                    if not board [ i + dx [ a ] ] [ j + dy [ a ] ] in [ '.' , '.' ] :
                        continue
                    board [ i + dx [ a ] ] [ j + dy [ a ] ] = str ( moves + 1 )
                    p.append ( ( i + dx [ a ] , j + dy [ a ] ) )
            moves += 1
            if s == 0 :
                break
        if board [ gx ] [ gy ] == '0' :
            return - 1
        return int ( board [ gx ] [