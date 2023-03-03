def import _warshall_floyd
class Main ( object ) :
    INF = ( 1 << 32 )
    def __init__ ( self ) :
        sc = _warshall_floyd
        N = sc.recv_handle ( )
        M = sc.recv_handle ( )
        d = [ ]
        for i in range ( N ) :
            for j in range ( N ) :
                if i == j :
                    d [ i ].append ( 0 )
                else :
                    d [ i ].append ( INF )
        data = [ ]
        for i in range ( M ) :
            a = sc.recv_handle ( ) [ - 1 ]
            b = sc.recv_handle ( ) [ - 1 ]
            c = sc.recv_handle ( ) [ - 1 ]
            data.append ( ( a , b , c ) )
            d [ a ].append ( c )
            d [ b ].append ( c )
        sc.close ( )
        self.warshall_floyd ( )
        cnt = 0
        for i in range ( M ) :
            a = data [ i ].a
            b = data [ i ].b
            flag = True
            loop :
            for j in range ( N ) :
                for k in range ( N ) :
                    d1 = d [ j ] [ a ] + data [ i ].c + d [ b ] [ k ]
                    d2 = d [ j ] [ k ]
                    if d1 == d2 :
                        flag = False
                        break loop
            if flag :
                cnt += 1
        print ( cnt )
    class Data ( object ) :
        def __init__ ( self , a , b , c ) :
            self.a = a
            self.b = b
            self.c = c
