def import _main
class Main ( object ) :
    def __init__ ( self , ans ) :
        self.ans = ans
        self.flag = [ ]
        self.dp = [ ]
        self.count = 0
        self.r = [ ]
    def main ( self ) :
        with open ( self.path ) as f :
            N , M , R = f.read ( ).split ( ' ' )
            self.r = [ ]
            self.flag = [ ]
            self.A = [ ]
            self.B = [ ]
            self.C = [ ]
            self.dp = [ ]
            for i in range ( 1 , N + 1 ) :
                for j in range ( 1 , N + 1 ) :
                    if i != j :
                        self.dp [ i ].append ( int ( i / 2 ) )
            for i in range ( 1 , M + 1 ) :
                a , b , c = f.read ( ).split ( ' ' )
                self.dp [ a ].append ( b )
                self.dp [ b ].append ( c )
            for k in range ( 1 , N + 1 ) :
                for i in range ( 1 , N + 1 ) :
                    for j in range ( 1 , N + 1 ) :
                        self.dp [ i ].append ( min ( self.dp [ i ] [ j ] , self.dp [ i ] [ k ] + self.dp [ k ] [ j ] ) )
        self.dps = self.dp [ 0 ]
        print ( self.ans )
    def dps ( self , r , p , sum , count ) :
        if count == len ( r ) :
            self.ans = min ( sum , ans )
            return
        for i in range ( len ( r ) ) :
            if not self.flag [ i ] :
                self.flag [ i ] = True
                if p == 0 :
                    self.dps ( r , r [ i ] , 0 , count + 1 )
                else :
                    self.dps ( r , r [ i ] , 0 , count + 1 )
return Main
