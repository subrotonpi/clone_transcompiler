def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.x1 , self.y1 , self.x2 , self.y2 = sys.stdin.read ( ).split ( '\n' )
    def dfs ( self , x ) :
        self.node = [ ]
        self.mx , my , l = max ( self.mx , self.node [ x ].x2 ) , max ( self.my , self.node [ x ].y2 ) , min ( self.l , self.node [ x ].x1 + self.node [ x ].y1 )
        for i in range ( 0 , len ( self.node ) ) :
            if not self.node [ i ].flag :
                continue
            cnt = 0
            if self.node [ i ].x2 < self.node [ i ].x1 and self.node [ i ].y2 < self.node [ i ].y1 :
                cnt += 1
            if self.node [ i ].x2 + 1 < self.node [ i ].x1 :
                cnt += 1
            if self.node [ i ].y2 + 1 < self.node [ i ].y1 :
                cnt += 1
            if self.node [ i ].x1 > self.node [ i ].x2 + 1 :
                cnt += 1
            if self.node [ i ].y1 > self.node [ i ].y2 + 1 :
                cnt += 1
        self.dfs ( i )
    def main ( self ) :
        t = self.count ( )
        for ca in range ( 1 , t + 1 ) :
            n = self.count ( )
            self.node = [ ]
            for i in range ( 0 , n ) :
                self.node.append ( Node ( x1 = self.x1 , y1 = self.y1 , x2 = self.x2 , y2 = self.y2 , flag = True ) )
        ans = 0
        for i in range ( 0 , n ) :
            if self.node [ i ].flag :
                mx , my , l = 0 , int ( self.node [ i ].x1 ) , int ( self.node [ i ].y1 )
                self.dfs ( i )
                ans = max ( ans , mx + my