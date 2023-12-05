def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.country = [ ]
        self.done = [ ]
        self.island_area , self.island_cnt = 0 , 0
        self.startX , self.startY = - 1 , - 1
        self.isone = False
    def dfs ( self ) :
        with open ( self.filename ) as sc :
            line , point = sc.readline ( ).split ( )
            for i in range ( 10 ) :
                point = line [ i ]
                self.country [ i ] [ j ] = point
                if point == 'o' :
                    self.island_area += 1
                    if self.startX < 0 :
                        self.startX , self.startY = i , j
    for i in range ( 10 ) :
        for j in range ( 10 ) :
            if self.country [ i ] [ j ] == 'x' :
                self.country [ i ] [ j ] = 'o'
                self.done = [ ]
                self.island_cnt = 0
                self.dfs ( i , j )
                if self.isone :
                    break
                self.country [ i ] [ j ] = 'x'
        if self.isone :
            break
    print ( 'YES' if self.isone else 'NO' )
def dfs ( self , x , y ) :
    if x < 0 or x > 9 or y < 0 or y > 9 :
        return
    if self.country [ x ] [ y ] == 'x' :
        return
    if self.done [ x ] [ y ] :
        return
    if self.country [ x ] [ y ] == 'o' :
        self.island_cnt += 1
        self.isone = self.isone or self.island_area + 1 == self.island_cnt
    self.done [ x ] [ y ] = True
    dfs ( self.x + 1 , y )
    dfs ( self.y - 1 , y )
    dfs ( self.x , y + 1 )
    dfs ( self.x , y - 1 )
