def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        for i in range ( 10 ) :
            A = sc.next ( ).split ( ' ' )
    sea = [ ]
    for i in range ( 10 ) :
        for j in range ( 10 ) :
            if A [ i ] [ j ] == 'x' :
                sea.append ( "%d:%d" % ( i , j ) )
    for h in sea :
        count = 0
        x , y = map ( int , h.split ( ':' ) )
        self.init ( )
        A_tmp [ x ] [ y ] = 'o'
        for i in range ( 10 ) :
            for j in range ( 10 ) :
                if A_tmp [ i ] [ j ] == 'o' :
                    self.dfs ( i , j )
                    count += 1
        if count == 1 :
            print ( "YES" )
            return
    print ( "NO" )
    def __init__ ( self ) :
        for i in range ( 10 ) :
            for j in range ( 10 ) :
                A_tmp [ i ] [ j ] = A [ i ] [ j ]
    def dfs ( x , y ) :
        if x < 0 or x >= 10 or y < 0 or y >= 10 or A_tmp [ x ] [ y ] == 'x' :
            return
        A_tmp [ x ] [ y ] = 'x'
        self.dfs ( x - 1 , y )
        self.dfs ( x + 1 , y )
        self.dfs ( x , y - 1 )
        self.dfs ( x , y + 1 )
