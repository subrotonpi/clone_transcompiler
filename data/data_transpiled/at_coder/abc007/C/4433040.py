def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.readline ( ).split ( )
        H , W , t = [ int ( s [ 0 ] ) for s in s [ 1 : ] ]
        sx , sy = [ int ( t [ 0 ] ) - 1 for t in t [ 1 : ] ]
        u = sc.readline ( ).split ( )
        gx , gy = [ int ( u [ 0 ] ) - 1 for u in u [ 1 : ] ]
        ix = [ - 1 , 0 , + 1 , 0 ]
        iy = [ 0 , + 1 , 0 , - 1 ]
        maze = [ ]
        route = [ ]
        for i in range ( H ) :
            data = sc.readline ( ).split ( )
            for j in range ( W ) :
                maze.append ( data [ j ] )
                if maze [ i ] [ j ] == '#' :
                    route [ i ] [ j ] = - 1
                else :
                    route [ i ] [ j ] = 0
        qx = Queue ( )
        qy = Queue ( )
        qx.put ( sx )
        qy.put ( sy )
        while qx :
            nx , ny = qx.get ( ) , qy.get ( )
            if nx == gx and ny == gy :
                break
            for i in range ( 4 ) :
                ax = nx + ix [ i ]
                ay = ny + iy [ i ]
                if ax >= 0 and ax < H and ay >= 0 and ay < W and not ( ax == sx and ay == sy ) and route [ ax , ay ] == 0 :
                    qx.put ( ax )
                    qy.put ( ay )
                    route [ ax , ay ] = route [ nx , ny ] + 1
    print ( route [ gx , gy ] )
