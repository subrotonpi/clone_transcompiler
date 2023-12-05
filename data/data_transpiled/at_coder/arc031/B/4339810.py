def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sum = 0
        self.dx = [ 0 , 0 , 1 , - 1 ]
        self.dy = [ 1 , - 1 , 0 , 0 ]
        self.map = [ ]
        self.count = 0
        self.ma = [ ]
    def main ( self ) :
        with open ( "input.txt" , "r" ) as sc :
            self.map = [ ]
            for a in sc.readlines ( ) :
                for i in range ( 10 ) :
                    self.map [ i ].append ( a [ i ] )
                    if self.map [ i ] [ j ] == "o" :
                        self.sum += 1
        for i in range ( 10 ) :
            for j in range ( 10 ) :
                if self.map [ i ] [ j ] == "x" :
                    self.map [ i ].append ( "o" )
                    self.count = 0
                    self.ma = [ ]
                    self.dfs ( j , i )
                    if self.count == ( self.sum + 1 ) :
                        print ( "YES" )
                        return
                    else :
                        self.map [ i ].append ( "x" )
        print ( "NO" )
    def judge ( self , x , y ) :
        return x in self.map
    def dfs ( self , x , y ) :
        if self.ma [ y ] [ x ] == True :
            return
        self.count += 1
        self.map [ y ].append ( "x" )
        self.ma [ y ] [ x ] = True
        for i in range ( 4 ) :
            if judge ( x + self.dx [ i ] , y + self.dy [ i ] ) and self.map [ y + self.dy [ i ] ] [ x + self.dx [ i ] ] != "x" :
                self.dfs ( x + self.dx [ i ] , y + self.dy [ i ] )
        self.map [ y ].append ( "o" )
